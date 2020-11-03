package dyrehage;

public class Hannindivid extends Individ{
    public Hannindivid (String navn, int ankommetDato,int fDato,String adresse,String hanndyr,boolean farlig,String norskNavn, String latNavn,
                   String latFamilie) {
        super(navn, ankommetDato, fDato, adresse, hanndyr, farlig, norskNavn, latNavn,
                latFamilie);
    }

    public int getAntKull() {
        return 0;
    }

    public void leggTilKull(int antKull) {

    }

    public void leggTilNyttKull(){

    }
}
