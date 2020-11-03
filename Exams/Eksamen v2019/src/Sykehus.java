import java.util.ArrayList;

class Sykehus implements ISykehus {
    private String Sname;
    ArrayList<Avdeling> avdelings = new ArrayList<Avdeling>();

    public Sykehus(String Sname){
        this.Sname=Sname;
    }

    @Override
    public boolean register(Object o) {
        boolean ok = false;
        if (o instanceof Avdeling){
            Avdeling a = (Avdeling) o;
            if(!avdelings.contains(a)){
                avdelings.add(a);
                ok=true;
            }
        }
        return ok;
    }

    @Override
    public boolean fjern(Object o) {
        boolean ok = false;
        if (o instanceof Avdeling){
            Avdeling a = (Avdeling) o;
            if(avdelings.contains(a)){
                avdelings.remove(a);
                ok=true;
            }
        }
        return ok;
    }
}
