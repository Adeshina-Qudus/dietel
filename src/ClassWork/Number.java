package classwork;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");

        int userInput = input.nextInt();

        while (userInput > 6) {
            System.out.println("INVALID ENTER A CORRECT NUMBER ");
            userInput = input.nextInt();

        }

        if (userInput == 0) {
            System.out.println("SUNDAY");
        } else if (userInput == 1) {
            System.out.println("MONDAY");
        } else if (userInput == 2) {
            System.out.println("TUESDAY");
        } else if (userInput == 3) {
            System.out.println("WEDNESDAY");
        } else if (userInput == 4) {
            System.out.println("THURSDAY");
        } else if (userInput == 5) {
            System.out.println("FRIDAY");
        } else if (userInput == 6) {
            System.out.println("SATURDAY");
        }


    }
}
