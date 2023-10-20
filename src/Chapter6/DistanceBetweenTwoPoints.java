package Chapter6;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the points ");
        System.out.println("Enter [x1]");
        int x1 = input.nextInt();
        System.out.println("Enter [y1]");
        int y1 = input.nextInt();
        System.out.println("Enter [x2]");
        int x2 = input.nextInt();
        System.out.println("Enter [y2]");
        int y2 = input.nextInt();
        System.out.println(distanceBetweenTwoPoints(x1, y1, x2, y2));
    }


    public static double distanceBetweenTwoPoints(double x1,double y1, double x2 , double y2){

        double power = Math.pow(x2 -  x1, 2) + Math.pow(y2 - y1 , 2);
        return Math.sqrt(power);
    }


}
