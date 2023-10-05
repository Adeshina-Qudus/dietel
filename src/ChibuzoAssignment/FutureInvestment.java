package ChibuzoAssignment;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER INVESTMENT AMOUNT : ");
        double investmentAmount = input.nextDouble();
        System.out.println("ENTER ANNUAL INTEREST RATE :");
        double annualInterest = input.nextDouble();
        System.out.println("ENTER NUMBER OF YEARS :");
        int numberOfYears = input.nextInt();


        double monthlyInvestmentRate = annualInterest / (12*100);
        double futureInvestment = investmentAmount * Math.pow((1 + monthlyInvestmentRate) ,  numberOfYears);

        System.out.printf("ACCUMULATED VALUE IS %.1f" , futureInvestment);
    }
}
