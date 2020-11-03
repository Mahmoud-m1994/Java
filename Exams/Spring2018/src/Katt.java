public class Katt extends Dyr{
    private boolean børste;

    public Katt(int nr,String navn,boolean børste){
        super(nr,navn);
        this.børste=børste;
    }

    @Override
    public double beregnNetooPris() {
        if(børste){
            return 190;
        }
        return 170;
    }
}
