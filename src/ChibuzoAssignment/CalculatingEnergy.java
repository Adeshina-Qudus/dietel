package ChibuzoAssignment;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER AMOUNT OF WATER IN KILOGRAMS : ");
        double amountOfWater = input.nextDouble();
        System.out.println("ENTER THE FINAL TEMPERATURE :");
        double finalTemperature = input.nextDouble();
        System.out.println("ENTER THE INITIAL TEMPERATURE :");
        double initialTemperature = input.nextDouble();

        double Q = amountOfWater  * (finalTemperature - initialTemperature) * 4184;
        System.out.printf("THE ENERGY NEEDED IS %.1f",Q);
    }
}
