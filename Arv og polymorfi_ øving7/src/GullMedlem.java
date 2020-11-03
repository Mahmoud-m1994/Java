import java.time.LocalDate;

class GullMedlem extends BonusMedlem {

    public GullMedlem(int medlNr, Personalia pers, LocalDate innmeldtDato,int poeng) {
        super(medlNr, pers, innmeldtDato);
        leggTilPoeng(poeng);
    }
    public void  registrerPoeng(int antall){
        int a= (int) (antall*1.5);
        leggTilPoeng (a);
    }
}