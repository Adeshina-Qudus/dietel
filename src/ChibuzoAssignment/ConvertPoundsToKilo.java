package ChibuzoAssignment;


import java.util.Scanner;

public class ConvertPoundsToKilo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" ENTER A NUMBER IN POUNDS : ");

        double pounds = input.nextDouble();

        double constantKg = 0.45359237;

        double poundsInKilo = pounds * constantKg;

        System.out.printf("%.3f",poundsInKilo,"KILOGRAMS");

    }
}
