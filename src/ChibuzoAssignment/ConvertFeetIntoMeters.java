package ChibuzoAssignment;

import java.util.Scanner;

public class ConvertFeetIntoMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER A NUMBER : ");
        double userInput = input.nextDouble();


        double feet = userInput * 0.305;
        System.out.println(userInput+ " FEET IS " +feet+ " METERS ");
    }
}
