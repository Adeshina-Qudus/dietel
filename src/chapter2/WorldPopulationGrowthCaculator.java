package chapter2;
import java.util.Scanner;
public class WorldPopulationGrowthCaculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current world population :");

        long userInputWorldPopulation = input.nextInt();

        System.out.println("Enter annul growth rate :");

        double userInputGrowthRate = input.nextDouble();

        System.out.println("Enter number of year :");
        int userInputYear = input.nextInt();

        long worldPopulation = (long) (userInputWorldPopulation * (1 + userInputGrowthRate / 100));
        double finalWorldPopulation = (Math.pow(worldPopulation , userInputYear));

        System.out.printf("world population is %f ", finalWorldPopulation);











    }
}
