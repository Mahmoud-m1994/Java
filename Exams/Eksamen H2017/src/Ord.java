public class Ord {
    private String ord;
    private int antDef=0;
    private String [] defisjoner= new String [antDef];


    public Ord(String ord, String [] defisjoner){
        this.ord=ord;
        this.defisjoner= defisjoner;
        this.antDef=defisjoner.length;
    }

    public String getOrd(){
        return ord;
    }
    public String[] getDefisjoner(){
        return defisjoner;
    }
    public boolean equals(Object o){
        boolean ok=false;
        if(!(o instanceof Ord)){
            return ok;
        }
        if(o==this){
            return true;
        }
        Ord input=(Ord)o;
        if(this.getOrd().toLowerCase().equals(input.getOrd().toLowerCase())){
            return true;
        }
        return ok;
    }
    public String toString() {
        String res= ord+"\n";
        for(int i=0; i<defisjoner.length; i++){
            res += defisjoner[i]+"\n";
        }
        return res;
    }
    private void utvidTab(){
        String[] kopi=new String[defisjoner.length+1];
        for(int i=0; i<defisjoner.length; i++){
            kopi[i]=defisjoner[i];
        }
        defisjoner=kopi;
    }
    public boolean leggTilDef(String nyDefisjon){
        boolean ok=false;
        if(nyDefisjon==null){
            return ok;
        }
        for(int i=0; i<defisjoner.length; i++){
            if(defisjoner[i].equals(nyDefisjon)){

            }
            return ok;
        }
        utvidTab();
        defisjoner[defisjoner.length -1]=nyDefisjon;
        return true;
    }
    public int compareTo(String ny){
        if(this.getOrd().compareTo(ny)<0){
            return -1;
        }
        if(this.getOrd().compareTo(ny)>0){
            return 1;
        }
        return 0;
    }
}
