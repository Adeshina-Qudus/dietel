package chapter2;
import java.util.Scanner;

public class BodyMassIndexCalculation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds :");
        int userInputInPounds = input.nextInt();
        System.out.println("Enter height in inches :");
        int userInputInHeight = input.nextInt();

        int weightInPounds = userInputInPounds * 703;
        int heightInInches = userInputInHeight * userInputInHeight;


        int bmi = weightInPounds / heightInInches;

        System.out.printf(" Bmi is : %d " , bmi);
    }
}
