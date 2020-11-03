import java.io.*;
public class Arrangement {
    private String navn;
    private Idrettsgren [] idrettsgrenser;
    private int MAKS;

    public Arrangement(String navn, int MAKS){
        this.navn=navn;
        this.idrettsgrenser= new Idrettsgren [MAKS];
    }
    public boolean regNy(Idrettsgren input) {
        boolean ok = false;
        if (input == null && idrettsgrenser.length == MAKS) {
            return ok;
        }
        for (int i = 0; i < idrettsgrenser.length; i++) {
            if (idrettsgrenser[i].getNavn().toLowerCase().equals(input.getNavn().toLowerCase())) {
                return ok;
            }
           // return ok;
        }
        idrettsgrenser[idrettsgrenser.length-1]= input;
        return true;
    }
    public static Arrangement lesFraFil(String filnavn) {
        Arrangement ob=null;
        try {

            Arrangement os= new Arrangement("mahmoud",2);
            FileOutputStream fos= new FileOutputStream(filnavn);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(os);
            oos.close();

            FileInputStream forbindelse = new FileInputStream(filnavn);
            ObjectInputStream leser = new ObjectInputStream(forbindelse);
            ob = (Arrangement) leser.readObject();
            leser.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            //System.out.println("feil ved fil lesing", filnavn);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException s){
            s.printStackTrace();
        }
        return ob;
    }
}
