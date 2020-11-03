class Prosjektfase {
    private final double budsjett=100000;
    private java.util.ArrayList<Activity> activities = new java.util.ArrayList<Activity>();

    // hvor mye er igjen av budsjettet for denne prosjektfasen?
    // denne metoden skal du programmere etterhvert }
    public double finnRestBudsjett() {
        double cost=0;
        for (int i=0;i<activities.size();i++){
            cost+=activities.get(i).getSum();
        }
        return budsjett-cost;
    }
}