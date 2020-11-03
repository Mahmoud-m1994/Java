package dyrehage;

class Fiskestim extends Dyregruppe {
    private final double gjennomsnittligLengde;
    private final boolean kanDeleAkvarium;

    public Fiskestim(double gjennomsnittligLengde,boolean kanDeleAkvarium,String gruppenavn, int antIndivider,
                     String norskNavn, String latNavn, String latFamilie, int ankommetDato, String adresse){
        super( gruppenavn,antIndivider,norskNavn, latNavn, latFamilie, ankommetDato, adresse);
        this.gjennomsnittligLengde=gjennomsnittligLengde;
        this.kanDeleAkvarium=kanDeleAkvarium;
    }

    public double getGjennomsnittligLengde() {
        return gjennomsnittligLengde;
    }

    public boolean getKanDeleAkvarium() {
        return kanDeleAkvarium;
    }

    @Override
    public String toString() {
        return super.toString()+ " gjennomsnittlig Lengden er "+ getGjennomsnittligLengde()+" "+ getKanDeleAkvarium();
    }
}
