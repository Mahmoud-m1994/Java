import java.util.ArrayList;

class Rom {
    private final int nummer;
    private final int størrelse;
    private ArrayList<Reservasjon> reservasjoner = new ArrayList<Reservasjon>();

    public Rom(int nummer,int størrelse){
        if(nummer<=0||størrelse<=0){
            throw new IllegalArgumentException("Størrelsen eller romnummeret kan ikke være null");
        }
        this.nummer=nummer;
        this.størrelse=størrelse;
    }

    public int getNummer() {
        return nummer;
    }

    public int getStørrelse() {
        return størrelse;
    }


    // metoden skjekker om rommet er reservert i en viss tid
    public boolean erReservert(Tidspunkt fraTid, Tidspunkt tilTid){
        boolean ok=true;
        for(int i=0; i<reservasjoner.size();i++){
            if(reservasjoner.get(i).getFraTid().getTidspunkt()>fraTid.getTidspunkt() && reservasjoner.get(i).getFraTid().getTidspunkt()<tilTid.getTidspunkt()){
                return ok;
            }
            if(reservasjoner.get(i).getTilTid().getTidspunkt()>fraTid.getTidspunkt() &&reservasjoner.get(i).getTilTid().getTidspunkt()<tilTid.getTidspunkt()){
                return ok;
            }
        }

        ok=false;
        return ok;
    }



    public boolean regReservasjon(Reservasjon input){

        if(erReservert(input.getFraTid(),input.getTilTid())){
            return false;
        }

        reservasjoner.add(input);
        return true;
    }

    public String toString(){
        String alt="Rommet nummer "+ getNummer() +" med kapasitet til "+ getStørrelse() +" personer er registrert\n";
        for (int i=0; i<reservasjoner.size();i++){
            alt+= reservasjoner.get(i)+"\n";
        }
        return alt;
    }


    // tester klasse Rom

    public static void main(String [] args){
        Tidspunkt fraTid= new Tidspunkt(201901201200L);
        Tidspunkt tilTid= new Tidspunkt(201901201400L);
        Kunde kunde= new Kunde("Mahmoud","41453991");
        Rom rom = new Rom(1,10);
        Reservasjon reservasjon= new Reservasjon(fraTid,tilTid,kunde);
        rom.regReservasjon(reservasjon);

        System.out.println(rom.toString());

    }

}
