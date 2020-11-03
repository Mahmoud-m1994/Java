public class Bord {

    private String [] navn;

    public Bord(int antallBord){
        navn=new String[antallBord];
    }

    public int ledigeBord(){
        int a=0;
        for(int i=0; i<navn.length;i++){
            if(navn[i]==null){
                a++;
            }
        }
        return  a;
    }

    // finner antall reserverte bord

    public int reserverteBord(){
        int a=0;
        for(int i=0; i<navn.length;i++){
            if(navn[i]!=null){
                a++;
            }
        }
        return  a;
    }
    public boolean frigiBord(int indeks){
        if(indeks==0){
            return false;
        }
        navn[indeks]=null;
        return true;
    }

    public boolean reserver(int antBord, String ord){
        int ledige=ledigeBord();
        int optatt=reserverteBord();
        if(ord==null|| ledige<antBord) {
            return false;
        }
        for(int i=0; i<navn.length;i++){
            if(antBord==0) {
                break;
            }
            if(navn[i]==null){
                navn[i]=ord;
                antBord--;
                ledige--;
                optatt++;
                return true;
            }
        }
        return false;
    }
    public String KundeNavn(int indeks){
        return navn[indeks];
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Bord)){
            return false;
        }
        if(this==o){
            return true;
        }
        Bord f=(Bord)o;
        for(int i=0; i<navn.length;i++){
            if(navn[i].toLowerCase().equals(f)){
                return true;
            }
        }
        return false;
    }
    public String[] getNavn(){
        String [] kopi=new String[navn.length];
        for(int i=0; i<kopi.length;i++){
            kopi[i]=navn[i];
        }
        return kopi;
    }
}
