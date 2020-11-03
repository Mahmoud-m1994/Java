import java.io.*;
public class Ordbok implements java.io.Serializable {
    private String ordbokNavn;
    private Ord[] ordbok;
    private int antReg;
    private final int MAKS = 10;
    private String filnavn = "ordliste.ser";

    public Ordbok(String ordbokNavn, Ord[] ordbok) {
        this.ordbokNavn = ordbokNavn;
        this.ordbok = ordbok;
        boolean status = lesOrdbokFraFil(filnavn);
        if (status == false) {
            ordbok = new Ord[MAKS];
            antReg = 0;
        }
    }

    public boolean regNyttOrd(Ord ord) {
        boolean ok = false;
        if (ord == null) {
            return ok;
        }
        if (ordbok.length == MAKS) {
            return ok;
        }
        for (int i = 0; i < antReg; i++) {
            if (ordbok[i].equals(ord)) {
                return ok;
            }
        }
        ordbok[ordbok.length - 1] = ord;
        antReg++;
        return true;
    }

    public boolean leggTilDef(String ord, String def) {
        Ord nyDef = null;
        for (int i = 0; i < ordbok.length; i++) {
            if (ordbok[i].getOrd().equals(ord)) {
                ordbok[i] = nyDef;
            }
        }
        return nyDef.leggTilDef(def);
    }

    public Ord[] sorter() {
        Ord[] kopi = new Ord[antReg];
        for (int i = 0; i < antReg; i++) {
            kopi[i] = ordbok[i];
        }
        for (int i = 0; i < kopi.length; i++) {
            int minst = i;
            for (int j = i + 1; i < kopi.length; j++) {
                if (kopi[j].getOrd().compareTo(kopi[i].getOrd()) < 0) {
                    minst = j;
                }
            }
            Ord temp = kopi[minst];
            kopi[minst] = kopi[i];
            kopi[i] = temp;
        }
        return kopi;
    }

    public Ord getOrd(String sokeStreng) {
        sokeStreng = sokeStreng.toLowerCase();
        for (int i = 0; i < antReg; i++) {
            if (ordbok[i].getOrd().equals(sokeStreng)) {
                return ordbok[i];
            }
        }
        return null;
    }

    public boolean lesOrdbokFraFil(String filnavn) {
        try {
            FileInputStream o = new FileInputStream(filnavn);
            ObjectInputStream les = new ObjectInputStream(o);
            Ord[] ob = (Ord[]) les.readObject();

            int teller = 0;
            for (int i = 0; i < ob.length; i++) {
                if (ordbok[i] != null) {
                    teller++;
                }
            }
            ordbok = ob;
            antReg = teller;
            les.close();
            return true;
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return false;
        } catch (IOException e){
            e.printStackTrace();;
            return false;
        } catch (ClassNotFoundException e){
            return false;
        }
    }
}
