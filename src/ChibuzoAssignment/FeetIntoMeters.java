package ChibuzoAssignment;

import java.util.Scanner;

public class FeetIntoMeters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A VALUE FOR FEET :");
        double inputFeet = input.nextDouble();

        double feet = inputFeet * 0.305;
        System.out.println(feet);
    }
}
