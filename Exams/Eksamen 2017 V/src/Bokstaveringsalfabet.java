// 1.a)
import javax.swing.*;
import java.io.*;

import static javax.swing.JPopupMenu.*;

//import org.java.*
public class Bokstaveringsalfabet {
    private String navn;
    private String [] alfabeter;

    // 1.b)
    public Bokstaveringsalfabet(String navn, String alfabeter, String separator){
        this.navn=navn;
        this.alfabeter=alfabeter.split(separator);
    }
    // 1.C
    public Bokstaveringsalfabet(String navn,String alfabeter){
        this.navn=navn;
        alfabeter=lesAlfabetFraFil(filnavn);

        if(alfabeter==null){
            String [] kopi={"Alfa-Bravo-Charlie-Delta"};
            alfabeter=kopi;
        }
    }
    // 1.d
    public String toString(){
        String res="";
        for(int i=0; i<alfabeter.length; i++){
            res += alfabeter[i] +" ";
        }
        return res;
    }
    // 1.e)
    public boolean regNyttOrd( String ord){
        char bokstav= ord.charAt(0);
        int indeks= finnIndeks(bokstav);
        if(indeks<0){
            alfabeter[alfabeter.length-1]=ord;
            return true;
        }
        return false;
    }


    // metode som hjelper å finne indeks til et ord
    private int finnIndeks( char c){
        for(int i=0; i<alfabeter.length; i++){
            if(alfabeter[i].charAt(0)==c){
                return i;
            }
        }
        return -1;
    }
    // 1.f
    public boolean endre (String ord){
        char bokstav= ord.charAt(0);
        int indeks= finnIndeks(bokstav);
        if(indeks>0){       // fant ordet
            alfabeter[indeks]=ord;           // bytter ordet i taballen alfabet som
            // fant indeksen med det nye ordet
            return true;
        }
        return false;
    }
    // 1.g
    public String [] sorter(){
        String [] kopi= new String[alfabeter.length];
        for(int i=0; i<alfabeter.length; i++){
            kopi[i]=alfabeter[i];
        }
        for(int i=0; i<kopi.length; i++){
            int minst=i;
            for(int k=i+1; k<kopi.length; k++){
                if(kopi[k].compareTo(kopi[i]) <0 ){
                    minst=k;
                }
            }
            String hjelp= kopi[minst];
            kopi[minst]=kopi[i];
            kopi[i]=hjelp;
        }
        return kopi;
    }
    private int compareTo(String o){
        for(int i=0; i<alfabeter.length; i++){
            if(alfabeter[i].compareTo(o)<0){ return -1;}
            if(alfabeter[i].compareTo(o)>0){ return 1;}
        }
        return 0;
    }
    // 1.h
    private String konvert(char c){
        int indeks =finnIndeks(c);
        if(indeks >0){ return alfabeter[indeks]; }
        return "Ukjent";
    }
    public String konverter(String ord) {
        String o = "";
        for (int i = 0; i < ord.length(); i++) {
             o= konvert(ord.charAt(i))+" ";
        }
        return o.trim();
    }
    // 1. i
    public boolean skrivTilFil(String filnavn){
        try {
            FileWriter of= new FileWriter(filnavn,false);
            PrintWriter os= new PrintWriter(new BufferedWriter(of));
            os.write(Separator);
            for(int i=0; i<alfabeter.length; i++){
                os.write(alfabeter[i]+ Separator);
                os.close();
                return true;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
         return false;
    }
    public String[] lesAlfabetFraFil(String filnavn){
        try {
            FileReader of= new FileReader(filnavn);
            BufferedReader os= new BufferedReader(of);
            String seperator=os.readLine();
            String [] tab=os.readLine().split(seperator);
            os.close();
            return tab;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
