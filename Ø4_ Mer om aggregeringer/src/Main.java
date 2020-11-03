
import javax.swing.*;

import static javax.swing.JOptionPane.*;

class Main {

    public static void main(String[] args) {
        final int Reg_Rommene = 0;
        final int Les_Reservasjoner=1;
        final int Skriv_ut=2;
        final int Rom_info=3;
        final int AVSLUTT = 4;
        String[] muligheter = {"Reg_Rommene","Les_Reservasjoner","Skriv_ut","Info om et rom", "AVSLUTT"};



        int valg = showOptionDialog(null,"Velg","ØVING 4 AGGREGERING",YES_NO_OPTION
                ,INFORMATION_MESSAGE,null,muligheter,muligheter[0]);
        Konferansesenteret konferansesenteret = new Konferansesenteret();


        while (valg != AVSLUTT) {
             valg = showOptionDialog(null,"Velg","ØVING 4 AGGREGERING"
                    ,INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION,null,muligheter,muligheter[0]);
             switch(valg){
                 case Reg_Rommene:
                    int romNr= Integer.parseInt(showInputDialog("Skriv inn rom nummer"));
                    int romStørrelse=Integer.parseInt(showInputDialog("Skriv inn rom størrelsen"));
                    System.out.println(konferansesenteret.regNyttRom(romNr,romStørrelse));

                    break;
                 case Les_Reservasjoner:
                    long fra= Long.parseLong(showInputDialog("skal reservere fra klokka?"));
                    long til= Long.parseLong(showInputDialog("skal reservere fra klokka?"));
                    String navn=showInputDialog("Skriv navnet");
                    String tlf=showInputDialog("Skriv telefon nummer");
                    int antall=Integer.parseInt(showInputDialog("Skriv inn antall personer"));
                    System.out.println(konferansesenteret.reserver(new Tidspunkt(fra),new Tidspunkt(til),navn,tlf,antall));
                    break;
                 case Skriv_ut:
                     int indeks=Integer.parseInt(showInputDialog("Skriv inn indeksen"));
                     System.out.println(konferansesenteret.allIno(indeks));
                     break;
                 case Rom_info:
                     int rom= Integer.parseInt(showInputDialog("Skriv inn rom nummeret"));
                     System.out.println(konferansesenteret.spesefikkRom(rom));
                     break;
                     default:
                         break;

             }
        }

    }

}

