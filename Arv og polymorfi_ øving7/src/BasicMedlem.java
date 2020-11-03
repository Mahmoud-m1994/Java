import java.time.LocalDate;

class BasicMedlem extends BonusMedlem {

    public BasicMedlem(int medlNr, Personalia pers, LocalDate innmeldtDato) {

        super(medlNr, pers, innmeldtDato);
    }
    public void  registrerPoeng(int poeng){
        leggTilPoeng(poeng);
    }
}
