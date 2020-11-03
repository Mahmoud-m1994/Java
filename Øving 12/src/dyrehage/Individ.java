package dyrehage;

import dyrehage.Dyr;

import java.util.Calendar;


abstract class Individ extends Dyr implements SkandinaviskeRovdyr {
    private final String navn;
    private final int fDato;
    private final String hanndyr;
    private final boolean farlig;

    public Individ(String navn, int ankommetDato,int fDato,String adresse,String hanndyr,boolean farlig,String norskNavn, String latNavn,
                   String latFamilie){
        super( norskNavn, latNavn, latFamilie, ankommetDato, adresse);
        this.farlig=farlig;
        this.fDato=fDato;
        this.hanndyr=hanndyr;
        this.navn=navn;
    }
    public String getHanndyr() {
        return hanndyr;
    }

    public boolean getFarlig() {
        return farlig;
    }

    public String getNavn() {
        return navn;
    }

    public int getFdato() {
        return fDato;
    }


    public int getAlder(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-getFdato();
    }

    public void flytt(String nyAdresse){
        super.setAdresse(nyAdresse);
    }

    // her antar jeg at vi  bruker  toString ??
    public String skrivUtInfo(){
        return super.toString() ;
    }
    public abstract int getAntKull();
    public abstract void leggTilKull(int antall);
    public abstract void leggTilNyttKull();
}
