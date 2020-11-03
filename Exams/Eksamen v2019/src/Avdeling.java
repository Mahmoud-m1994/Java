import java.util.ArrayList;

public class Avdeling {
    private String avdelingsnavn;
    ArrayList <Ansatt> ansatts =new ArrayList<Ansatt>();
    ArrayList <Pasient> pasients =new ArrayList<Pasient>();

    public Avdeling(String avdelingsnavn){
        this.avdelingsnavn=avdelingsnavn;
    }

    public String getAvdelingsnavn() {
        return avdelingsnavn;
    }

    public void setAvdelingsnavn(String avdelingsnavn) {
        this.avdelingsnavn = avdelingsnavn;
    }

    public ArrayList<Ansatt> getAnsatts() {
        return ansatts;
    }

    public void setAnsatts(ArrayList<Ansatt> ansatts) {
        this.ansatts = ansatts;
    }

    public ArrayList<Pasient> getPasients() {
        return pasients;
    }

    public void setPasients(ArrayList<Pasient> pasients) {
        this.pasients = pasients;
    }

    @Override
    public boolean equals(Object o) {
        boolean ok = false;
        if (this instanceof Avdeling)
            ok= true;
        Avdeling a = (Avdeling) o;
        return ok;
    }
}
