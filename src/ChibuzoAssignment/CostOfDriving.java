package ChibuzoAssignment;
import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("enter miles per gallon:");
        double miles = input.nextDouble();

        System.out.print("enter price per gallon:");
        double gallon = input.nextDouble();


        double costOfDriving = (distance / miles) * gallon;

        System.out.printf("the cost of the driving is: " + costOfDriving);


    }




    }
