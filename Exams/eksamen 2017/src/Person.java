public abstract class Person {
    private int pernr;
    private String navn;
    private int ansiennitet;
    private double timelønn;

    public Person(int pernr, String navn,int ansiennitet, double timelønn){
        if(pernr==0|| navn==null){
            throw new IllegalArgumentException("Feil input");
        }
        this.pernr=pernr;
        this.navn=navn;
        this.ansiennitet=ansiennitet;
        this.timelønn=timelønn;
    }


    public int getPernr() {
        return pernr;
    }

    public void setPernr(int pernr) {
        this.pernr = pernr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAnsiennitet() {
        return ansiennitet;
    }

    public double getTimelønn() {
        return timelønn;
    }
    abstract public double bergenKostnad(int antallTimer);

    @Override
    public boolean equals(Object obj) {
        boolean ok = false;
        if (! (obj instanceof Person)){
            ok = false;
        }
        if (obj==this){
            ok = true;
        }
        Person person = (Person) obj;
        return ok;
    }
}
class Ingeniør extends Person{
    private int ansiennitet;
    private double timelønn;

    public Ingeniør(int pernr, String navn, int ansiennitet, double timelønn) {
        super(pernr, navn,ansiennitet,timelønn);
        this.ansiennitet = ansiennitet;
        this.timelønn=timelønn;
    }

    public int getAnsiennitet() {
        return ansiennitet;
    }

    public double getTimelønn() {
        return timelønn;
    }

    @Override
    public double bergenKostnad(int antalltimer) {
        double kostnad=0;
        if (getAnsiennitet() >= 0 && getAnsiennitet() <= 2) {
            kostnad = 1.6 * getTimelønn()*antalltimer;
        }
        if (getAnsiennitet() >= 3 && getAnsiennitet() <= 5) {
            kostnad = 1.8 * getTimelønn()*antalltimer;
        }
        if (getAnsiennitet()>=6){
            kostnad=2.1 * getTimelønn()*antalltimer;
        }
        return kostnad;
    }
}
class Admin extends Person{
    public Admin(int pernr, String navn , int ansiennitet, double timelønn) {
        super(pernr, navn , ansiennitet,timelønn);
    }

    @Override
    public double bergenKostnad(int antallTimer) {
        return getTimelønn()*antallTimer*1.4;
    }
}
