import static javax.swing.JOptionPane.*;
public class Main {
    public static void main(String []args){
        Arrangement a= new Arrangement("Olymbic",5);
        String[] Alternativer={"Registrer nytt arrangement","Registrer ny idrettsgren","avslutt"};
        private final int REG_ARRANGEMENT=0;
        private final int REG_IDRETTSGREN=1;
        private final int AVSLUTT=2;

        public int lesValg(){
            int valg= showOptionDialog(null, "velg en av instruksjoner","Arrangement",DEFAULT_OPTION,PLAIN_MESSAGE,null,Alternativer,Alternativer[0]);
            while(valg != AVSLUTT){
                switch (valg){
                    case REG_ARRANGEMENT:
                        a.regNy();
                        break;
                    case REG_IDRETTSGREN:
                        a.regNy();
                        break;
                        default:
                            break;
                }
                valg= showOptionDialog(null, "velg en av instruksjoner","Arrangement",DEFAULT_OPTION,PLAIN_MESSAGE,null,Alternativer,Alternativer[0]);
            }
        }
        public static void regNygren(Idrettsgren gren){
            String input= showInputDialog("skriv en ny idrettsgren");
            Idrettsgren o= new Idrettsgren(input,10);

        }
    }
}
