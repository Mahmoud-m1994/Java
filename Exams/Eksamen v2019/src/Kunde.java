import java.time.LocalDate;
import java.util.ArrayList;

class Kunde {
    private final int kundenr;
    private final String navn;
    private ArrayList<Dyr> dyrene;

    public Kunde(int kundenr, String navn) {
        this.kundenr = kundenr;
        this.navn = navn;
    }

    public int getKundenr() {
        return kundenr;
    }

    public String getNavn() {
        return navn;
    }

    public boolean regDyr(Dyr dyr, LocalDate ankomstDato, LocalDate avreiseDato, ArrayList<Tillegg> tilleggs){
        boolean registrert = false;

        return registrert;
    }
    private boolean registrert(Dyr dyr){
        boolean ok = false;
        for (int i=0;i<dyrene.size();i++) {
            if (dyr.getNavn().equals(dyrene.get(i).getNavn())){
                ok=true;
            }
        }
        return ok;
    }
}