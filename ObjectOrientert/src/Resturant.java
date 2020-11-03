
import java.util.Calendar;
import java.util.Random;

// bruker kombossisjon
public class Resturant {
    private String navn;
    private int etablerings;
    private Bord bord;


    public Resturant(String navn, int etablerings,int antallBord){
        this.navn= navn;
        this.etablerings=etablerings;
        this.bord=new Bord(antallBord);
    }

    // finner navnet på resturantet
    public String getNavn() {
        return navn;
    }

    // finner etableringsår
    public int getEtablerings() {
        return etablerings;
    }

    // endrer resturants navn
    private void setNavn(String ord){
        navn=ord;
    }

    // finner hvor gammel er resturantet
    public int alder(){
        Calendar cal = Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        return year-etablerings;
    }

    // finner antall ledige bord

    public int ledigeBord(){
        return bord.ledigeBord();
    }
    // finner antall reserverte bord

    public int reserverteBord(){
        return bord.reserverteBord();
    }
    // reserverer et bord for en person

    public boolean reserver(int antBord,String kunde){
        return bord.reserver(antBord,kunde);
    }

    public int[] getReserverte(String ord){
        if(ord==null){
            return null;
        }
        //String [] ser= bord.getNavn();
        int [] table=new int [reserverteBord()];
        for(int i=0; i<reserverteBord(); i++){
            if(bord.KundeNavn(i)==ord){
                table[i]=i;
            }
        }
        return table;
    }
    // frigjør bordene som er ryddet
    public boolean friGjør(int [] bordNummere){
        if(bordNummere==null){
            return false;
        }
        for(int i=0;i<bordNummere.length;i++){
            bord.frigiBord(bordNummere[i]);
            return true;
        }
        return false;
    }
}
