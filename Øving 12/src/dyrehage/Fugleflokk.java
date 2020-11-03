package dyrehage;

public class Fugleflokk extends Dyregruppe{
    private final double gjennomsnittligVekt;
    private final boolean svømmer;

    public Fugleflokk(double gjennomsnittligVekt,boolean svømmer,String gruppenavn, int antIndivider,
                      String norskNavn, String latNavn, String latFamilie, int ankommetDato, String adresse){
        super( gruppenavn,antIndivider,norskNavn, latNavn, latFamilie, ankommetDato, adresse);
        this.gjennomsnittligVekt=gjennomsnittligVekt;
        this.svømmer=svømmer;
    }

    public double getGjennomsnittligVekt() {
        return gjennomsnittligVekt;
    }

    public boolean getSvømmer() {
        return svømmer;
    }

    @Override
    public String toString() {
        return super.toString() +" getGjennomsnittlig vekt er "+ getGjennomsnittligVekt()+" "+getSvømmer();
    }
}

