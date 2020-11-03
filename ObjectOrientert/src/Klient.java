public class Klient {
    public static void main(String[]args){
        Resturant a= new Resturant("Egon",1987,10);
        System.out.println(a.alder());  // metoden
        System.out.println(a.ledigeBord());
        System.out.println(a.reserver(3,"Jan"));
        System.out.println(a.ledigeBord());
        System.out.println(a.reserverteBord());
        int [] tab=a.getReserverte("Jan");
        for(int i=0; i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
