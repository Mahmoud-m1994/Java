public class Hund extends Dyr {
    private final int LITEN=1;
    private final int MIDDEL=2;
    private final int STOR=3;
    private int størrelse;

    public Hund(int nr, String navn,int størrelse) {
        super(nr, navn);
        this.størrelse=størrelse;
    }


    @Override
    public double beregnNetooPris() {
        if(størrelse==LITEN){
            return 390;
        }
        return 440;
    }
}
