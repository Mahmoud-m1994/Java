import java.util.ArrayList;

public class Aktivitet {
    private int aktNR;
    private int estimerte_kostnadING;
    private int estimerte_kostnadADM;
    ArrayList<PersonTimer> personTimers;

    public Aktivitet(int aktNR, int estimerte_kostnadING, int estimerte_kostnadADM) {
        this.aktNR = aktNR;
        this.estimerte_kostnadING = estimerte_kostnadING;
        this.estimerte_kostnadADM = estimerte_kostnadADM;
    }

    public int getAktNR() {
        return aktNR;
    }

    public int getEstimerte_kostnadING() {
        return estimerte_kostnadING;
    }

    public int getEstimerte_kostnadADM() {
        return estimerte_kostnadADM;
    }

    public ArrayList<PersonTimer> getPersonTimers() {
        return personTimers;
    }
    public boolean regNyPersonTimer(Person p,int uke,int antallTimer){
        boolean ok = false;
        for (int i=0; i<personTimers.size();i++){
            if (p.equals(personTimers.get(i)) && personTimers.get(i).getUkenr()==uke){
                int t=personTimers.get(i).getTimer();
                personTimers.get(i).setTimer(t+antallTimer);
                ok=true;
            }
        }
        personTimers.add(new PersonTimer(p,uke,antallTimer));
        ok = true;
        return ok;
    }

    public double finnTotalKostnadIng(){
        double kostnad =0.0;
        for (int i=0; i<personTimers.size();i++){
            Person person= personTimers.get(i).getPerson();
            if (person instanceof Ingeniør){
                kostnad=person.bergenKostnad(personTimers.get(i).getTimer());
            }
        }
        return kostnad;
    }
    public double finnTotalKostnadADM(){
        double kostnad =0.0;
        for (PersonTimer pt: personTimers){
            Person p= pt.getPerson();
            if (p instanceof Admin){
                kostnad=p.bergenKostnad(pt.getTimer());
            }
        }
        return kostnad;
    }
    public double totalEstimert(){
        return estimerte_kostnadADM + estimerte_kostnadING;
    }
    public double totalForbruk(){
        return finnTotalKostnadIng();
    }
}
class PersonTimer{
    private Person person;
    private int ukenr;
    private int timer;

    public PersonTimer(Person person, int ukenr, int timer) {
        this.person = person;
        this.ukenr = ukenr;
        this.timer = timer;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getUkenr() {
        return ukenr;
    }

    public void setUkenr(int ukenr) {
        this.ukenr = ukenr;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
