import java.util.ArrayList;

class Konferansesenteret{
    private ArrayList<Rom> rommene= new ArrayList<Rom>();

    // reserverer et ledig rom med angitt antall persoenr

    public boolean reserver(Tidspunkt fra,Tidspunkt til,String navn,String tlf,int antPersoner){
        for(int i=0;i<rommene.size();i++){
            if(rommene.get(i).getStørrelse()>=antPersoner && rommene.get(i).erReservert(fra,til)){
                rommene.get(i).regReservasjon(new Reservasjon(fra,til,new Kunde(navn,tlf)));
                return true;
            }
        }
        return false;
    }

    // registrerer et nytt rom
    public boolean regNyttRom(int romNr, int kapasitaet){
        for(int i=0; i<rommene.size();i++){
            if(rommene.get(i).getNummer()==romNr){
                return false;
            }
        }
        rommene.add(new Rom(romNr,kapasitaet));
        return true;
    }

    // finner antall rom
    public int antallRom(){
        return rommene.size();
    }

    // finner et bestemt rom med angitt indeks
    public Rom bestemtRom(int indeks){
        if(indeks<0){
            return null;
        }
        return rommene.get(indeks);
    }

    // finner et bestemt rom med angitt romnummer
    public Rom spesefikkRom(int nummer){
        Rom o=null;
        for(int i=0; i<rommene.size();i++){
            if(rommene.get(i).getNummer()==nummer){
                o= rommene.get(i);
            }
        }
        return o;
    }
    public String allIno(int indeks){
        String ser= "antall registrerte rom er " + antallRom()+ bestemtRom(indeks);
        return ser;
    }

}
