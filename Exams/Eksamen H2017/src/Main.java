import static javax.swing.JOptionPane.*;
public class Main {
    public static void main(String[]args){
        String[] muligheter = {"Legg til ord","Legg til definisjon","Avslutt"};
        final int LEGG_TIL_ORD = 0;
        final int LEGG_TIL_DEFINISJON = 1;
        final int AVSLUTT = 2;
        int valg = showOptionDialog(null,"Velg","Eksamen des 2017",YES_NO_OPTION
                ,INFORMATION_MESSAGE,null,muligheter,muligheter[0]);
        String navn = "Ordboka";
        Ordbok ordbok = new Ordbok(navn,10);



    }
    private static void regNyttOrd(Ordbok ordbok){
        String a="";
        String ord= showInputDialog("Skriv inn et ord");
        Ord o= new Ord (ord);
        boolean status= ordbok.regNyttOrd(o);
        if(status){
            a="ordet ble registrert";
        }
        if(!status){
            a="Ordet er ikke registrert";
        }
        showMessageDialog(null,a);
    }
}
