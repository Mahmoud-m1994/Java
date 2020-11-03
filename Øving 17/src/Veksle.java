
public class Veksle {
    public double fra_til(Valuta fra,Valuta til, double tall){
        double fra1= fra.veksling1(tall);
        double til1= til.veksling2(fra1);
        return til1;
    }
}
