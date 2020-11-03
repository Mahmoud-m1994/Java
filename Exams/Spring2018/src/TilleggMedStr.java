public class TilleggMedStr extends Tillegg{
    private int størrelse;

    public TilleggMedStr(int nr, int navn, int pris, int størrelse) {
        super(nr, navn, pris);
        this.størrelse = størrelse;
    }

    public int getStørrelse() {
        return størrelse;
    }
}
