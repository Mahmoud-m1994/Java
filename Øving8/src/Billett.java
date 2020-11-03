abstract class Billett {
    private final String tribunenavn;
    private final int pris;

    public Billett(String tribunenavn, int pris) {
        if (tribunenavn == null || tribunenavn.trim().equals("")) {
            throw new IllegalArgumentException("Tribunenavn må oppgis.");
        }
        this.tribunenavn = tribunenavn.trim();
        this.pris = pris;
    }

    public String getTribune() {
        return tribunenavn;
    }

    public int getPris() {
        return pris;
    }

    public String toString() {
        return "Tribune: "+tribunenavn + " Pris: "+pris;
    }
}

class StaaplassBillett extends Billett {
    public StaaplassBillett(String tribunenavn, int pris) {
        super(tribunenavn, pris);
    }
}

/**
 * Sitteplassbilletter. Rad og plass på raden må oppgis.
 */
class SitteplassBillett extends Billett {
    private final int rad;
    private final int plass;

    public SitteplassBillett(String tribunenavn, int pris, int rad, int plass) {
        super(tribunenavn, pris);
        if (rad < 0 || plass < 0) {
            throw new IllegalArgumentException("Verken rad eller plass kan være negativ.\n"
                    + "Oppgitte verdier: " + rad + ", " + plass);
        }
        this.rad = rad;
        this.plass = plass;
    }

    public int getRad() {
        return rad;
    }

    public int getPlass() {
        return plass;
    }

    public String toString() {
        String res = super.toString();
        res += " Rad: "+ rad + " Plass: " + plass;
        return res;
    }
}

/*
		for(int i=0;i<vipBillettene.length;i++){
			System.out.println(vipBillettene[i]);
		}
		System.out.println("Ikke sortert:\n");
		for(int i=0;i<tribunene.length;i++){
			System.out.println(tribunene[i].toString());
		}
		Arrays.sort(tribunene, new Sortbypris());
		System.out.println("sortert:\n");
		for(int i=0;i<tribunene.length;i++){
			System.out.println(tribunene[i].toString());
		}*/

