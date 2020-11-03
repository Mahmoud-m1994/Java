import java.time.LocalDate;
import java.util.ArrayList;

abstract class Dyr {
    private int NR;
    private String dyrNavn;
    ArrayList<Opphold> oppholds = new ArrayList<Opphold>();

    public Dyr(int nr, String navn) {
        this.dyrNavn = navn;
        this.NR = nr;
    }

    public int getNR() {
        return NR;
    }

    public String getDyrNavn() {
        return dyrNavn;
    }

    abstract double beregnNetooPris();

    private boolean leggTilOpphold(Opphold opphold) {
        if (opphold == null)
            return false;
        for (int i = 0; i < oppholds.size(); i++) {
            if (oppholds.get(i).equals(opphold))
                return false;
        }
        oppholds.add(opphold);
        return true;
    }

    public Opphold finnOpphold(LocalDate fra) {
        Opphold verdi=null;
        for (int i = 0; i < oppholds.size(); i++) {
            if(oppholds.get(i).getAnkomst().equals(fra))
                verdi= oppholds.get(i);
        }
        return verdi;
    }
}