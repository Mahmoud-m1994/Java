public class Student {
    private final String navn;
    private int antOppg;

    public Student(String navn){
        this.navn=navn;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void setAntOppg(int antOppg) {
        if(antOppg<0){
            throw new IllegalArgumentException("antall oppgaver kan ikke være negativit");
        }
        this.antOppg = antOppg;
    }

    @Override
    public String toString() {
        return "Studenten "+navn+" Har "+antOppg+ " antall gokjente oppgaver";
    }

    public boolean equals(Object o){
        if(!(o instanceof Student)){
            return false;
        }
        if(o== this.navn){
            return true;
        }
        Student f= (Student)o;
        if(this.equals(f)){
            return true;
        }
        return false;
    }
}
