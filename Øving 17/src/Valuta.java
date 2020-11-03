class Valuta {
    private String valutaNavn;
    private double kurs_MN;
    private double enhet;


    public Valuta(String valutaNavn, double kurs_MN, double enhet){
        this.valutaNavn=valutaNavn;
        this.kurs_MN=kurs_MN;
        this.enhet=enhet;
    }

    public String getValutaNavn() {
        return valutaNavn;
    }

    public double getKurs_MN() {
        return kurs_MN;
    }

    public double getEnhet() {
        return enhet;
    }
    public double veksling1(double tall) {
        if (getEnhet() == 1) {
            return tall * getKurs_MN();
        }
        if (getEnhet() == 100) {
            return (tall*getKurs_MN()) *100;
        }
        return 0;
    }
    public double veksling2(double tall) {
        if (getEnhet() == 1) {
            return tall / getKurs_MN();
        }
        if (getEnhet() == 100) {
            return (tall / getKurs_MN()) / 100;
        }
        return 0;
    }
}
