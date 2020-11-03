abstract class Tillegg {
    private int nr;
    private int navn;
    private int pris;

    public Tillegg(int nr, int navn, int pris) {
        this.nr = nr;
        this.navn = navn;
        this.pris = pris;
    }

    public int getNr() {
        return nr;
    }

    public int getNavn() {
        return navn;
    }

    public int getPris() {
        return pris;
    }

}
