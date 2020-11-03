import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Opphold {
    private int oppholdNR;
    private LocalDate ankomst;
    private LocalDate avreiseDato;
    private ArrayList<Tillegg> tilleggs;

    public Opphold(int oppholdNR,LocalDate ankomst, LocalDate avreiseDato,ArrayList<Tillegg> tilleggs) {
        this.oppholdNR=oppholdNR;
        this.ankomst = ankomst;
        this.avreiseDato = avreiseDato;
        this.tilleggs= new ArrayList<Tillegg>();
    }
    private boolean leggTilTillegg(Tillegg tillegg) {
        if (tillegg == null)
            return false;
        for (int i = 0; i < tilleggs.size(); i++){
            if(tilleggs.get(i).equals(tillegg))
                return false;
        }
        tilleggs.add(tillegg);
        return true;
    }

    public LocalDate getAnkomst() {
        return ankomst;
    }

    public LocalDate getAvreiseDato() {
        return avreiseDato;
    }
    public int getAntallDager(LocalDate localDate1,LocalDate localDate2){
        Period tall = Period.between(localDate1,localDate2);
        return tall.getDays();
    }
    protected boolean sjekkOverlapping(Opphold opphold){
        if(opphold==null){
            return false;
        }
        if(this==opphold){
            return true;
        }
        if(getAnkomst().isBefore(opphold.getAvreiseDato()))
            return true;
        return false;
    }
}
