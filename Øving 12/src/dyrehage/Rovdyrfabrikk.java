package dyrehage;
// SkandinaviskeRovdyr

public class Rovdyrfabrikk {


// String navn, int ankommetDato,int fDato,String adresse,String hanndyr,boolean farlig,String norskNavn, String latNavn,
//                   String latFamilie){

    public SkandinaviskeRovdyr nyBinne(String navn, int ankommetDato, int fDato, String adresse,int antall) {

        return new Hunnindivid("Brunbjoern", ankommetDato, fDato, adresse, "Hunndyr", true, "Bjørn", "Brown Bear", "Ursus arctos",2);

    }


    public SkandinaviskeRovdyr nyHannbjoern(String navn, int ankommetDato, int fDato, String adresse) {


        return new Hannindivid(navn, ankommetDato, fDato, adresse, "Hanndyr", true, "bjørn", "bears", "Ursus arctos");

    }

    public SkandinaviskeRovdyr nyUlvetispe(String navn, int ankommetDato, int fDato, String adresse, int antall) {
        return new Hunnindivid(navn, ankommetDato, fDato, adresse, "Hunndyr", true, "Ulvetispe", "fox", "Dogs",antall);
    }

    public SkandinaviskeRovdyr nyUlvehann(String navn, int ankommetDato, int fDato, String adresse) {

        return new Hannindivid(navn, ankommetDato, fDato, adresse, "UlveHann", true, "Ulvetispe", "Canis lupus", "Canidae");

    }
}

// test class SkandinaviskeRovdyr til S oppgave 3

