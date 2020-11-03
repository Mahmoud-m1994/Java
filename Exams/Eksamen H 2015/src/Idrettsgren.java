// klassen er laget etter prinsippet komposisjon fordi
// Dersom den klassen slettes, SÅ slettes klassen Ovelse.

public class Idrettsgren {
    private String navn;
    private Ovelse [] øvelser;
    private int MAKS=5;

    public Idrettsgren ( String navn, int MAKS){
        this.navn=navn;
        this.øvelser =new Ovelse [MAKS];
    }
    public Idrettsgren( String navn,Ovelse[] øve){
        this.navn= navn;
        Ovelse [] ny= new Ovelse[MAKS];
        for(int i=0; i<øve.length; i++){
            ny[i]= new Ovelse (øve[i].getBeskrivelse(), øve[i].getKjønn());
            MAKS++;
        }
        this.øvelser=ny;
    }

    public String getNavn() {
        return navn;
    }

    public String toString(){
        String temp=""+ navn;
        for(int i=0; i<øvelser.length; i++){
            temp += "\n"+ øvelser[i]+"\n";
        }
        return temp;
    }
    public boolean reg(Ovelse o){
        boolean ok=false;
        if(øvelser.length==MAKS ){
            return ok;
        }
        for(int i=0; i< øvelser.length; i++){
            if(øvelser[i].equals(o))
            return ok;
        }
        øvelser[øvelser.length-1]=new Ovelse(o.getBeskrivelse(),o.getKjønn());
        return true;
    }
}
