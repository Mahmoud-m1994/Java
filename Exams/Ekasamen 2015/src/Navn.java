public class Navn {
    private String fornavn;
    private String etternavn;

    public Navn(String fornavn, String etternavn){
        this.fornavn= fornavn;
        this.etternavn= etternavn;
    }
    public String getFornavn(){
        return fornavn;
    }
    public String getEtternavn(){ return etternavn;}

    // e)

    public boolean equals(Object o) {
        if(!(o instanceof Navn)){
            return false;
        }
        if (o==this){
            return true;
        }
        Navn a = (Navn) 0;
        if (this.getEtternavn().equals(a.getEtternavn()) && this.getFornavn().equals(a.getFornavn())) {
            return true;
        }
        return false;
    }
    // f)
    public int compareTo(Navn o){
        /*
        String nytt= o.getFornavn()+o.getEtternavn();
        String hele= fornavn+etternavn;
        if(hele.toLowerCase().compareTo(nytt.toLowerCase() <0){
            return -1;
        }
        if(hele.toLowerCase().compareTo(nytt.toLowerCase() >0){
            return 1;
        }
        if(hele.toLowerCase().compareTo(nytt.toLowerCase()==0){
            return 0;
        s
        */
        if (etternavn.compareTo(o.getEtternavn()) <0){ return -1;}
        if (etternavn.compareTo(o.getEtternavn()) >0){ return 1;}
        if (etternavn.compareTo(o.getEtternavn())==0) {
            if (fornavn.compareTo(o.getFornavn()) > 0) {
                return 1;
            }
            if (fornavn.compareTo(o.getFornavn()) < 0) {
                return -1;
            }
        }
        return 0; // navnene er like
    }


}
