import java.time.LocalDate;
import java.util.ArrayList;

class Kunde {
    private int kundenr;
    private String navn;
    private ArrayList<Dyr> dyrene = new ArrayList<Dyr>();

    public Kunde(int kundenr, String navn) {
        this.kundenr = kundenr;
        this.navn = navn;
    }
    private boolean registrerDyr(Dyr dyr){
        if(dyr==null)
            return false;
        for(int i=0;i<dyrene.size();i++){
            if(dyrene.get(i).getDyrNavn().equals(dyr.getDyrNavn())){  // dyr finnes fra før
                return false;
            }
        }
        dyrene.add(dyr);
        return true;
    }
    private boolean registrerOpphold(Dyr dyr, LocalDate ankomst,LocalDate avreise,ArrayList<Tillegg> tilleggs){
        return true;
    }

}
