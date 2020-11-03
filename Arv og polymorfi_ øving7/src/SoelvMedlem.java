import java.time.LocalDate;

class SoelvMedlem extends BonusMedlem {
    public SoelvMedlem(int medlNr, Personalia pers, LocalDate innmeldtDato,int antall) {
        super(medlNr, pers, innmeldtDato);
        leggTilPoeng(antall);
    }
    public void  registrerPoeng(int antall){
        int a= (int) (antall*1.2);
        leggTilPoeng (a);
    }
}
