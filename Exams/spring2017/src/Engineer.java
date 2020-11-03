class Engineer extends Person{
    public Engineer(int persNR, String navn, double timelønn, int ansettelse_år) {
        super(persNR, navn, timelønn, ansettelse_år);
    }
    public double beregnKostnad(int timer){
        int insietteten= getInsessieten();
        if(insietteten>0&&insietteten==2){
            return  1.6*getTimelønn()*timer;
        }
        if( insietteten>=3&&insietteten<=5){
            return 1.8*getTimelønn()*timer;
        }
        return 2.1*getTimelønn()*timer;  // else
    }
}
class Admin extends Person{
    public Admin(int persNR, String navn, double timelønn, int ansettelse_år) {
        super(persNR, navn, timelønn, ansettelse_år);
    }
    public double beregnKostnad(int timer){
        return 1.4*getTimelønn()*timer;  // else
    }
}


