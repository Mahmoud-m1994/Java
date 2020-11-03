public class OppgaveOversikt {
    private Student[] studenter = new Student[5];
    private int antStud=0;

    public boolean RegNyttStud(String navnet){
        boolean ok=false;
        for(int i=0; i<antStud; i++){
            if(studenter[i].getNavn().equals(navnet)){
                return ok;
            }
        }
        if(navnet==null){
            return ok;
        }
        if(antStud==5) {
            utvidTabell();
        }
        studenter[antStud]=new Student(navnet);
        antStud++;
        return true;
    }
    private boolean utvidTabell(){
        Student[] nyTab= new Student[studenter.length+5];
        for(int i=0; i<antStud; i++){
            nyTab[i]=studenter[i];
        }
        studenter=nyTab;
        return true;
    }

    // finner antall registrerte studenter

    public int finnAntStud() {
        return antStud;
    }
    // finner antall oppg til en bestemt person

    public int finnAntOppgaver(String navn){
        int hjelp=0;
        if(navn!=null){
            for(int i=0; i<antStud; i++){
                if(studenter[i].getNavn().equals(navn)){
                    hjelp=studenter[i].getAntOppg();
                }
            }
            return hjelp;
        }
        return -1;
    }
    private Student finnStud(String navn){
        Student o=null;
        for(int i=0; i<antStud;i++){
            if(studenter[i].getNavn().toLowerCase().equals(navn.toLowerCase())){
                o=studenter[i];
            }
        }
        return o;
    }
    // øker antOppgaver til for en bestemt person
    public boolean økAntOppg(String navn , int øking){
        if(navn==null|| øking==0){
            return false;
        }
        finnStud(navn).setAntOppg(øking);
        return true;
    }
    public String [] finnAlleNavn(){
        String ser[]= new String[studenter.length];
        for(int i=0; i<antStud; i++){
            ser[i]= studenter[i].getNavn();

        }
        return ser;
    }

    @Override
    public String toString(){
        String sum ="";
        for(int i=0; i<antStud; i++){
            sum= studenter[i].toString()+"\n";
        }
        return sum;
    }
}