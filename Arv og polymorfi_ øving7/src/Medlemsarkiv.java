import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

class Medlemsarkiv {
    private ArrayList<BonusMedlem> medlemmer= new ArrayList<BonusMedlem>();

    public int  finnPoeng(int nummer, String passord){
        for(int i=0; i<medlemmer.size();i++){
            if(medlemmer.get(i).getMedlnr()==nummer && medlemmer.get(i).okPassord(passord)){
                return medlemmer.get(i).getPoeng();
            }
        }
        return -1;
    }

    public boolean registrerPoeng(int nummer,int poeng) {
        for (int i = 0; i < medlemmer.size(); i++) {
            if (medlemmer.get(i).getMedlnr() == nummer) {   // fant medlemsnummer
                medlemmer.get(i).registrerPoeng(poeng);  // prøver å registrere poeng
                return true;
            }
        }
        return false;
    }

    public int nyMedlem(Personalia pers, LocalDate innmeldt){
        int tall=finnLedigNr();
        BasicMedlem a= new BasicMedlem(tall,pers,innmeldt);
        medlemmer.add(a);
        return tall;
    }

    private int finnLedigNr(){
        Random rand= new Random();
        int tall = rand.nextInt();
        boolean ok=true;
        while (!ok){
            for(int i=0;i<medlemmer.size();i++){
                if(medlemmer.get(i).getMedlnr()==tall){
                    ok=false;
                    break;
                }
                else
                    ok=true;
            }
            tall=rand.nextInt();    // prøver et nytt tilfeldig tall og sjekker den mot medlemmer igjen
        }
        return tall;
    }

    public void sjekkMedlemmer(LocalDate idag){
        for(int i=0; i<medlemmer.size();i++){
            if(medlemmer.get(i) instanceof BasicMedlem && medlemmer.get(i).finnKvalPoeng(idag)>25000){
                if(medlemmer.get(i).finnKvalPoeng(idag)<75000){
                    SoelvMedlem nyttSolvMedlem= new SoelvMedlem(medlemmer.get(i).getMedlnr(),
                            medlemmer.get(i).getPers(),
                            medlemmer.get(i).getInnmeldtDato(),
                            medlemmer.get(i).getPoeng());
                    medlemmer.set(i,nyttSolvMedlem);
                }
                else {
                    GullMedlem nyttGullMedlem = new GullMedlem(medlemmer.get(i).getMedlnr(),
                            medlemmer.get(i).getPers(),
                            medlemmer.get(i).getInnmeldtDato(),
                            medlemmer.get(i).getPoeng());
                    medlemmer.set(i,nyttGullMedlem);
                }
            }
            if(medlemmer.get(i) instanceof SoelvMedlem && medlemmer.get(i).finnKvalPoeng(idag)>75000){
                GullMedlem nyttGull = new GullMedlem(medlemmer.get(i).getMedlnr(),
                        medlemmer.get(i).getPers(),
                        medlemmer.get(i).getInnmeldtDato(),
                        medlemmer.get(i).getPoeng());
                medlemmer.set(i,nyttGull);
            }
        }
    }

    @Override
    public String toString() {
        String hjelp="";
        for(int i=0; i<medlemmer.size();i++){
            hjelp=medlemmer.get(i)+"\n";
        }
        return hjelp;
    }
}
