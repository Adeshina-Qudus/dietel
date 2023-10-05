package ChibuzoAssignment;
import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter balance ");
        int balance = input.nextInt();

        System.out.println("enter annualInterest ");
        double annualInterest = input.nextDouble();

        double interest = balance * (annualInterest / 1200);

        System.out.printf("interest for the next month : %f%n", interest); ;



    }
}
