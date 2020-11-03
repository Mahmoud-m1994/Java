import javafx.scene.Scene;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args){
        double x = 0;
        double y=3;
        double dy=6*Math.pow(x,2)-3*Math.pow(x,2)*3;
        double dx=0;

        Scanner in =new Scanner(System.in);
        dx=in.nextDouble();

        for(double i= x; i<=1; i+=dx){
            y=dy*dx+y;
            System.out.println(y);
            x+=dx;
            dy = (6 * Math.pow(x, 2)) - (3 * Math.pow(x, 2) * 3);
        }
    }
}
