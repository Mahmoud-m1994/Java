import java.util.Comparator;
import java.util.Random;

abstract class Tribune {
    private final String tribunenavn;
    private final int kapasitet;
    private final int pris;


    public Tribune(String tribunenavn, int kapasitet,int pris){
        this.tribunenavn=tribunenavn;
        this.kapasitet=kapasitet;
        this.pris=pris;

    }

    public int getPris() {
        return pris;
    }

    public String getTribunenavn() {
        return tribunenavn;
    }

    public int getKapasitet() {
        return kapasitet;
    }

    abstract int finnAntallSolgteBilletter();

    // metoden finner inntekten

    abstract int finnInntekt();

    abstract Billett[] kjøpBilletter1(int tall);

    abstract Billett[] kjøpBilletter2(String[] navnene);
}


// bruker aggreggering fordi Tribune har sitte/ stå og vip plasser

class Staa extends Tribune{
    private int antSolgteBilletter;
    public Staa (String tribunenavn,int kapasitet,int pris){
        super(tribunenavn,kapasitet,pris);
        antSolgteBilletter =0;
    }

    public int finnAntallSolgteBilletter() {
        return antSolgteBilletter;
    }
    @Override
    public int finnInntekt(){
        return antSolgteBilletter*getPris();
    }

    public Billett[] kjøpBilletter1(int tall){

        if(tall<=0 ||tall> getKapasitet()-finnAntallSolgteBilletter()){
            return new Billett[0];
        }
        Billett[] billett= new StaaplassBillett[tall];
        for(int i=0; i<billett.length;i++){
            billett[i]= new StaaplassBillett(getTribunenavn(),getPris());
            antSolgteBilletter++;
        }
        return billett;
    }

    public Billett[] kjøpBilletter2(String[] navnene){
        return kjøpBilletter1(navnene.length);
    }

}


// klassen sitte
class Sitte extends Tribune{
    private int antallRader;

    private int [] antOpptatt;

    public Sitte(String tribunenavn,int kapasitet,int pris,int antallRader){
        super(tribunenavn,kapasitet,pris);
        this.antallRader=antallRader;
        this.antOpptatt=new int[kapasitet/antallRader];
    }

    public int getAntOpptatt() {
        int opptatt=0;
        for(int i=0; i<antOpptatt.length;i++){
            if(antOpptatt[i]>0){
                opptatt+=antOpptatt[i];
            }
        }
        return opptatt;
    }

    public int finnAntallSolgteBilletter(){
        return getAntOpptatt();
    }

    public int finnInntekt(){
        return getAntOpptatt()*getPris();
    }

    // hjelpe metode for metoden kjøp billett 1 som finner ledig rad
    private int finnRad(int nummer){
        for(int i=0; i<antOpptatt.length;i++){
            if(nummer<antOpptatt[i]){
                return i;
            }
        }
        return -1;
    }

    public Billett[] kjøpBilletter1(int tall){
        int ledig = finnRad(tall);
        if(ledig>=0){
            Billett[] billett= new SitteplassBillett[tall];
            for(int i=0; i<billett.length;i++){
                billett[i]= new SitteplassBillett(getTribunenavn(),getPris(),finnRad(tall),antOpptatt[(finnRad(tall))]);
                antOpptatt[(finnRad(tall))]++;
            }
            return billett;
        }
        return new Billett[0];
    }
    public Billett[] kjøpBilletter2(String[] navnene){
        return kjøpBilletter1(navnene.length);
    }
}


// klassen vip
class VIP extends Tribune{
    private int antallRader;
    private String tribunenavn;
    private int kapasitet;
    private int pris;
    private String[][] tilskuer;

    public VIP (String tribunenavn,int kapasitet,int pris,int antallRader){
        super(tribunenavn,kapasitet,pris);
        this.tribunenavn=tribunenavn;
        this.kapasitet=kapasitet;
        this.pris=pris;
        this.antallRader=antallRader;
        this.tilskuer=new String[antallRader][kapasitet/antallRader];
    }

    public int getPris() {
        return pris;
    }

    public int finnAntallSolgteBilletter(){
        int solgte=0;
        for(int i=0; i<tilskuer.length;i++){
            for(int j=0; j<tilskuer[i].length; j++){
                solgte += j;
            }
        }
        return solgte;
    }

    public int finnInntekt(){
        return finnAntallSolgteBilletter()*pris;
    }

    public Billett[] kjøpBilletter1(int tall){
        return null;
    }



    public Billett[] kjøpBilletter2(String[] navnene){

        if( navnene.length>=kapasitet){
            return null;
        }
        if (navnene.length == 0) {
            return null;
        }
        Billett[] tabell=new Billett[navnene.length];
        for(int i=0;i<tabell.length;i++){
            int rad = ledigRad();
            tabell[i]=new SitteplassBillett(tribunenavn,pris, rad, ledigPlass(rad));
            tilskuer[rad][ledigPlass(rad)]=navnene[i];
        }
        return tabell;
    }

    public int ledigRad(){
        for(int i=0;i<tilskuer.length;i++){
            for(int j=0;j<tilskuer[i].length;j++){
                if(tilskuer[i][j]==null){
                    return i;
                }
            }
        }
        return -1;
    }
    public int ledigPlass(int rad) {
        for (int j = 0; j < tilskuer[rad].length; j++) {
            if (tilskuer[rad][j] == null) {
                return j;
            }
        }
        return -1;
    }


    public String toString(){
        String res="Vip tribune: \nHar :"+antallRader+" og koster "+pris+" kroner.\n navnene på de kjøpte billettene:\n";
        for(int i=0;i<tilskuer.length;i++){
            res+=("på rad nr: "+i+" har vi følgende tilskuere:\n");
            for(int j=0;j<tilskuer[i].length;j++){
                res+=tilskuer[i][j];
            }
        }
        return res;
    }
}
class Sortbypris implements Comparator<Tribune> {
    public int compare(Tribune a, Tribune b){
        return a.getPris()-b.getPris();
    }
}