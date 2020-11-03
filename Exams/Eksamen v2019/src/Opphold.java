import java.time.LocalDate;
import java.util.ArrayList;

public class Opphold {
    private int oppholdnr;
    private LocalDate ankomstDato;
    private LocalDate avreiseDato;
    ArrayList <Tillegg> tilleggs;

    public Opphold(int oppholdnr, LocalDate ankomstDato, LocalDate avreiseDato, ArrayList<Tillegg> tilleggs) {
        this.oppholdnr = oppholdnr;
        this.ankomstDato = ankomstDato;
        this.avreiseDato = avreiseDato;
        this.tilleggs = tilleggs;
    }

    public int getOppholdnr() {
        return oppholdnr;
    }

    public void setOppholdnr(int oppholdnr) {
        this.oppholdnr = oppholdnr;
    }

    public LocalDate getAnkomstDato() {
        return ankomstDato;
    }

    public void setAnkomstDato(LocalDate ankomstDato) {
        this.ankomstDato = ankomstDato;
    }

    public LocalDate getAvreiseDato() {
        return avreiseDato;
    }

    public void setAvreiseDato(LocalDate avreiseDato) {
        this.avreiseDato = avreiseDato;
    }

    public ArrayList<Tillegg> getTilleggs() {
        return tilleggs;
    }

    public void setTilleggs(ArrayList<Tillegg> tilleggs) {
        this.tilleggs = tilleggs;
    }
}
