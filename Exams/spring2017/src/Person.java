abstract class Person {
    private final int persNR;
    private String navn;
    private double timelønn;
    private final int ansettelse_år;
    private int[] timeListe;

    public Person(int persNR,String navn,double timelønn, int ansettelse_år){
        this.navn=navn;
        this.persNR=persNR;
        this.timelønn=timelønn;
        this.ansettelse_år=ansettelse_år;
    }

    public int getPersNR() {
        return persNR;
    }

    public String getNavn() {
        return navn;
    }

    public double getTimelønn() {
        return timelønn;
    }
    public int getInsessieten(){
        return 2017-ansettelse_år;
    }

    public int getAnsettelse_år() {
        return ansettelse_år;
    }

    public int[] getTimeListe() {
        return timeListe;
    }

    public void setTimeListe(int ukenummer,int timer) {
         timeListe[ukenummer]+= timer;
    }
    public int getAntallTimer(){
        int antall=0;
        for (int i=0;i<timeListe.length;i++){
            antall+=timeListe[i];
        }
        return antall;
    }

    abstract double beregnKostnad(int timer);

}
