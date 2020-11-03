public class Person {
    private String fornavn;
    private String etternavn;
    private int pernr;

    public Person(String fornavn,String etternavn,int pernr){
        this.etternavn=etternavn;
        this.fornavn= fornavn;
        this.pernr=pernr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getPernr() {
        return pernr;
    }

    public void setPernr(int pernr) {
        this.pernr = pernr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", pernr=" + pernr +
                '}';
    }
}

class Ansatt extends Person {
    public Ansatt(String fornavn, String etternavn, int pernr) {
        super(fornavn, etternavn, pernr);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ super.toString();
    }
}
class Lege extends Ansatt{

    public Lege(String fornavn, String etternavn, int pernr) {
        super(fornavn, etternavn, pernr);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ super.toString();
    }
}
class Sykepleier extends Ansatt{
    public Sykepleier(String fornavn, String etternavn, int pernr) {
        super(fornavn, etternavn, pernr);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ super.toString();
    }
}
class Pasient extends Person {
    public Pasient(String fornavn, String etternavn, int pernr) {
        super(fornavn, etternavn, pernr);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ super.toString();
    }
}













