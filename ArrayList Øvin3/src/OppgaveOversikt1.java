import java.util.ArrayList;

public class OppgaveOversikt1{
    private ArrayList <Student> studenter = new ArrayList<Student>();
    private int antStud=0;

    public boolean RegNyttStud(String navnet){
        boolean ok=false;
        for(int i=0; i<studenter.size(); i++){
            if(studenter.get(i).equals(navnet)){
                return ok;
            }
        }
        if(navnet==null){
            return ok;
        }
        studenter.add(new Student(navnet));
        antStud++;
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
            for(int i=0; i<studenter.size(); i++){
                if(studenter.get(i).getNavn().equals(navn)){
                    hjelp=studenter.get(i).getAntOppg();
                }
            }
            return hjelp;
        }
        return -1;
    }
    private Student finnStud(String navn){
        Student o=null;
        for(int i=0; i<studenter.size();i++){
            if(studenter.get(i).getNavn().equals(navn.toLowerCase())){
                o=studenter.get(i);
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
        String ser[]= new String[studenter.size()];
        for(int i=0; i<studenter.size(); i++){
            ser[i]= studenter.get(i).getNavn();

        }
        return ser;
    }

    @Override
    public String toString(){
        String sum ="";
        for(int i=0; i<studenter.size(); i++){
            sum= studenter.get(i).toString()+"\n";
        }
        return sum;
    }
}
