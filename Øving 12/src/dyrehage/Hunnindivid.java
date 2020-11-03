package dyrehage;

public class Hunnindivid extends Individ {
    private int antKull;
    public Hunnindivid (String navn, int ankommetDato,int fDato,String adresse,String hanndyr,boolean farlig,String norskNavn, String latNavn,
                        String latFamilie,int antKull) {
        super(navn, ankommetDato, fDato, adresse, hanndyr, farlig, norskNavn, latNavn, latFamilie);
        this.antKull=antKull;
    }

    public int getAntKull() {
        return antKull;
    }

    public void leggTilKull(int antKull) {
        this.antKull += antKull;
    }

    public void leggTilNyttKull(){
        antKull++;
    }
}
