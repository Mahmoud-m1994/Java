public class Dyr {
    private int dyrnr;
    private String navn;

    public Dyr(int dyrnr, String navn) {
        this.dyrnr = dyrnr;
        this.navn = navn;
    }

    public int getDyrnr() {
        return dyrnr;
    }

    public void setDyrnr(int dyrnr) { this.dyrnr = dyrnr; }

    public String getNavn() { return navn; }

    public void setNavn(String navn) { this.navn = navn; }

    public double  beregnNettoprisPrDøgn(){
        return 0;
    }
}

class Hund extends Dyr{
    private int stor;

    public Hund (int dyrnr,String navn,int stor){
        super(dyrnr,navn);
        this.stor=stor;
    }

    public int getStor() {
        return stor;
    }

    public double beregnNettoprisPrDøgn(){
        double total=360;
        if (getStor()==1){
            total+=30;
        }
        if (getStor()==2||getStor()==3){
            total+=50;
        }
        return total;
    }
}


class Katt extends Dyr{
    private boolean børste;
    public Katt (int dyrnr,String navn,int stor) {
        super(dyrnr, navn);
        this.børste = børste;
    }

    public boolean isBørste() {
        return børste;
    }

    public double beregnNettoprisPrDøgn(){
        double total=170;
        if (isBørste()==true){
            total+=20;
        }
        return total;
    }
}









