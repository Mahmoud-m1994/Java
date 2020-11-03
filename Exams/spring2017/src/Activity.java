import java.util.ArrayList;

public class Activity {
    private final int aktNummer;
    ArrayList<Person> people;

    public Activity(int aktNummer){
        this.aktNummer=aktNummer;
    }

    public int getAktNummer() {
        return aktNummer;
    }
    public boolean regAntallTimer(Person person,int ukenummer, int timer){
        if(!sjekkPerson(person)){
            addPerson(person);
        }
        for (int i=0;i<people.size();i++) {
            if (people.get(i).getPersNR() == person.getPersNR()) {
                people.get(i).setTimeListe(ukenummer,timer);
                return true;
            }
        }
        return false;
    }
    private boolean addPerson(Person person){
        if (person==null){
            return false;
        }
        if(person instanceof Engineer){
            people.add(new Engineer(person.getPersNR(),person.getNavn(),person.getTimelønn(),person.getAnsettelse_år()));
            return true;
        }
        if(person instanceof Admin){
            people.add(new Admin(person.getPersNR(),person.getNavn(),person.getTimelønn(),person.getAnsettelse_år()));
            return true;
        }
        return false;
    }
    private boolean sjekkPerson(Person person){
        boolean ok=false;
        for (int i=0;i<people.size();i++) {
            if (people.get(i).getPersNR() == person.getPersNR()) {
                ok=true;
            }
        }
        return ok;
    }
    public double getKostnadIngeniør(){
        double kostnader=0;
        for (int i=0;i<people.size();i++){
            if(people.get(i) instanceof Engineer){
                kostnader+=people.get(i).beregnKostnad(people.get(i).getAntallTimer());
            }
        }
        return kostnader;
    }
    public double getKostnadAdmin(){
        double kostnader=0;
        for (int i=0;i<people.size();i++){
            if(people.get(i) instanceof Admin){
                kostnader+=people.get(i).beregnKostnad(people.get(i).getAntallTimer());
            }
        }
        return kostnader;
    }
    public double getSum(){
        return getKostnadAdmin()+getKostnadIngeniør();
    }
}
