
import javax.swing.JOptionPane.*;
import java.io.*;
import static javax.swing.JPopupMenu.*;
import o

public class Bokstavering {
    private String navn;
    private String [] alfabeter;
    private String filnavn="java.ser";

    public Bokstavering(String navn,String[] alfabeter, String separator){
        this.navn=navn;
        this.alfabeter=alfabeter.split(separator);
    }
    public Bokstavering(String navn, String []alfabeter){
        this.alfabeter= lesAlfabetFraFil (filnavn);
        this.navn=navn;
        if(alfabeter==null){
            String[] kopi={"Alfa,Bravo, Charlie"};
            alfabeter=kopi;
        }
    }
    public String toString(){
        String res="";
        for(int i=0; i<alfabeter.length; i++){
            res =alfabeter[i]+" ";
        }
        return res;
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(!(o instanceof Bokstavering) || o==null){
            return false;
        }
        String input=(String)o;
        for(int i=0; i<alfabeter.length; i++) {
            if (alfabeter[i].equals(input)) {
                return true;
            }
        }
        return false;
    }
    public boolean regNyttOrd(String ord){
        boolean ok=false;
        for(int i=0; i<alfabeter.length; i++) {
            if (alfabeter[i].equals(ord)) {
                return ok;
            }
        }
        utvidTabell();
        alfabeter[alfabeter.length-1]= ord;
        return true;

    }
    private void utvidTabell(){
        String[] kopi= new String[alfabeter.length+1];
        for(int i=0; i< alfabeter.length; i++){
            kopi[i]=alfabeter[i];
        }
        alfabeter=kopi;
    }
    public boolean endre(String ord){
        if(ord==null){
            return false;
        }
        int indeks=finnIndeks(ord.charAt(0));
        if(indeks>0){
            alfabeter[indeks]=ord;
            return true;
        }
        return false;
    }
    private int finnIndeks(char c){
        for(int i=0; i<alfabeter.length; i++){
            if(alfabeter[i].charAt(0)==c){
                return i;
            }
        }
        return -1;
    }
    public String konvert(String tekst){
        String ordTekst="";
        for(int i=0; i<tekst.length(); i++){
            ordTekst=konverter(tekst.charAt(i));
        }
        return ordTekst;
    }
    private String konverter(char ord){
        String o="";
        int indeks=finnIndeks(ord);
        o=alfabeter[indeks];
        if(indeks>0){
            return o;
        }
        return "Ukjent";
    }

    public boolean skrivTilFil(String filnavn){
        String separator="-";
        try {
            FileWriter ois= new FileWriter(filnavn,false);
            PrintWriter fis= new PrintWriter(ois);
            fis.write(separator);
            for(int i=0; i<alfabeter.length; i++){
                fis.write(alfabeter[i]);
                fis.close();
                return true;
            }
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    private String[] lesAlfabetFraFil(String filnavn){
        try {
            FileReader os=new FileReader(filnavn);
            BufferedReader of= new BufferedReader(os);
            String separator=of.readLine();
            String [] tab= of.readLine().split(separator);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

