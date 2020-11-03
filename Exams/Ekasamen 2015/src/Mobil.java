public class Mobil {
    private String modell;
    private int egetNR;
    private Visittkort[] liste;
    private final int ANT_MAKS ;
    private int antvisitors=0;

    public Mobil(String mobil, int egetNR , int ANT_MAKS){
        this.modell=modell;
        this.egetNR=egetNR;
        this.liste= new Visittkort[ANT_MAKS];
        this.ANT_MAKS=ANT_MAKS;
    }
    public String getModell(){
        return modell;
    }
    public int getEgetNR(){
        return egetNR;
    }
    public String toString(){
        String  temp= ""+ modell +" "+ egetNR ;
        for(int i=0; i<antvisitors; i++){
            temp += liste[i];
        }
        return temp;
    }
    public boolean legTil(Visittkort ord){
        if( ord == null && antvisitors< ANT_MAKS &&){
            return false;
        }
        for(int i=0; i<antvisitors; i++){
            if(liste[i].getNavn().equals(ord.getNavn())){
                return flase;
            }
        }
        liste[antvisitors]=ord;
        antvisitors++;
        return true;
    }
    public Visittkort[] sorter(){
        if(antvisitors>0 && liste != null){
            Visittkort[] kopi= new Visittkort[antvisitors];
            for(int i=0; i<antvisitors; i++) {
                kopi[i] = new Visittkort(liste[i].getNavn(), liste[i].getTlfmobil(), liste[i].getTlfjob(), liste[i].getEpost());
            }
            for(int start=0; start<antvisitors; start++){
                int minst=start;
                for(int j= minst+1; j<antvisitors; j++){
                    if(kopi[j].getNavn().compareTo(kopi[start].getNavn()) <0) {
                        minst = j;
                    }
                }
            Visittkort hjelp= new kopi[minst];
            kopi[minst]= kopi[start];
            kopi[start]=hjelp;
         }
         return kopi;
        }
        return null;
    }
}
