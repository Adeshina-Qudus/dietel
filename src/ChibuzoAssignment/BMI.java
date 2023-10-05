package ChibuzoAssignment;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" ENTER WEIGHT IN POUNDS : ");
        double weight = input.nextDouble();

        System.out.println(" ENTER HEIGHT IN INCHES : ");
        double height = input.nextDouble();


        double constantKg = 0.45359237;
        double constantM  = 0.0254;
        double heightInInches = height * constantM ;
        double weightInPounds = constantKg * weight;
        double heightInInches2 = heightInInches * heightInInches;

        double bmi = weightInPounds /heightInInches2;

        System.out.printf(" BMI IS : %.4f" ,bmi);
    }
}
