class Prosjektfase {
    private java.util.ArrayList<Aktivitet> aktiviteter = new java.util.ArrayList<Aktivitet>();

    public double finnRestBudsjett() {
        double sum=0.0;
        for (Aktivitet akt: aktiviteter){
            sum+=(akt.finnTotalKostnadIng()-akt.totalEstimert());
        }
        return sum;
    }
}