import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

abstract class BonusMedlem {
    private final int medlNr;
    private final Personalia pers;
    private final LocalDate innmeldtDato;
    private int poeng = 0;

    public BonusMedlem(int medlNr,Personalia pers,LocalDate innmeldtDato){
        this.medlNr=medlNr;
        this.innmeldtDato=innmeldtDato;
        this.pers=pers;  // aggreggering
    }

    public int getMedlnr() {
        return medlNr;
    }

    public Personalia getPers() {
        return pers;
    }

    public LocalDate getInnmeldtDato() {
        return innmeldtDato;
    }

    public int getPoeng() {
        return poeng;
    }
    public int finnKvalPoeng(LocalDate date2){
        long dagerMellom= ChronoUnit.DAYS.between(innmeldtDato,date2);
        if(dagerMellom<365){
            return getPoeng();
        }
        return 0;
    }
    public boolean okPassord(String passordet){
        return pers.okPassord(passordet);
    }
    public abstract void registrerPoeng(int poeng);

    // Bruker protected for å kunne endre på poeng i subklassene
    protected void leggTilPoeng(int antall){
        poeng +=antall;
    }

    public String toString(){
        return  getClass().getName()+ "Medlemmsnummer "+ medlNr +" har følgende kontakt info "+ pers.getFornavn()+" "+pers.getEtternavn()+" "+pers.getEPostadr()+" Meldt seg i datoen "+ getInnmeldtDato()+"\n";
    }

}
