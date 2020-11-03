public class Visittkort {
    private Navn navn;
    private int tlfmobil;
    private int tlfjobb;
    private String epost;

    public Visittkort( String fornavn, String etternavn, int tlfmobil, int tlfjobb, String epost){
        this.navn= new Navn(fornavn, etternavn);
        this.tlfmobil=tlfmobil;
        this.tlfjobb=tlfjobb;
        this.epost=epost;
    }
    public Navn getNavn(){
        String fornavn= navn.getFornavn();
        String etternavn=navn.getEtternavn();
        return new Navn(fornavn, etternavn);
    }
    public String getTlfmobil(){
        return tlfmobil;
    }
    public String getTlfjob(){
        return tlfjobb;
    }
    public String getEpost(){
        return epost;
    }

    public String toString(){
        return ""+ navn+"\n"+ tlfmobil + "\n"+ tlfjobb+ "\n"+ epost ;
    }

}
