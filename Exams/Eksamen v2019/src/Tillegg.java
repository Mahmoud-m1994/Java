abstract class Tillegg {
    private final int nr;
    private final String navn;
    private final double pris;

    protected Tillegg(int nr, String navn, double pris) {
        this.nr = nr;
        this.navn = navn;
        this.pris = pris;
    }
    public int getNr() { return nr;
    }
    public String getNavn() { return navn;
    }
    public double getPris() { return pris;
    }
    public String toString() {
        return nr + ", " + navn + ", " + pris;
    }
}

class TilleggMedStr extends Tillegg {
    private final String str;
    public TilleggMedStr(int nr, String navn, double pris, String str) {
        super(nr, navn, pris);
        this.str = str; }
    public String getStr() { return str;
    }
    public String toString() {
        return super.toString() + ", " + str + "\n";
    }
}

class TilleggAnnet extends Tillegg {
    public TilleggAnnet(int nr, String navn, double pris) {
        super(nr, navn, pris);
    }

    public String toString() {
        return super.toString() + "\n";
    }
}