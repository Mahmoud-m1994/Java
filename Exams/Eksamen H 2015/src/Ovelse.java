public class Ovelse {
    private String beskrivelse;
    private String kjønn;

    public Ovelse (String beskrivelse, String kjønn){
        this.beskrivelse = beskrivelse;
        this.kjønn=kjønn;
    }
    public String getBeskrivelse(){
        return beskrivelse;
    }
    public  String getKjønn(){
        return kjønn;
    }

    public void setBeskrivelse(String input) {
        this.beskrivelse = input;
    }

    public void setKjønn(String kj) {
        this.kjønn = kj;
    }

    public String toString() {
        return getBeskrivelse()+" " + getKjønn();
    }

    public boolean equals(Object o) {
        boolean ok=false;
        if(!(o instanceof Ovelse)){
            return false;
        }
        if (o==this){
            return true;
        }
        Ovelse input = (Ovelse)o;
        if(beskrivelse.toLowerCase().equals(input.getBeskrivelse().toLowerCase()) && kjønn.toLowerCase().equals(input.getKjønn().toLowerCase())){
            return true;
        }
        return ok;
    }
    public int compareTo(Ovelse o){
        String nytt= o.getBeskrivelse().trim() + o.getKjønn().trim();
        String hele= getBeskrivelse().trim()+getKjønn().trim();
        if(hele.compareTo(nytt)<0){
            return -1;
        }
        if(hele.compareTo(nytt)>0){
            return 1;
        }
        return 0;
    }
}
