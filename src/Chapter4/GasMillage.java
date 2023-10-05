package chapter4;

import java.util.Scanner;

public class GasMillage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mgp = 0;
        int count = 0;
        double average = 0;


        int userInputMiles = 0;
        int userInputGallons = 0;



        while (userInputMiles != -1) {

            System.out.println("ENTER MILES DRIVEN OR PRESS -1 TO QUIT : ");
            userInputMiles = input.nextInt();
            System.out.println("ENTER GALLONS USED OR PRESS -1 TO QUIT : ");
            userInputGallons = input.nextInt();

             mgp = userInputMiles / userInputGallons;
            average+=mgp;
            count++;

        }
        double average2 = average / count;
            System.out.println("MILES PER GALLON OBTAINED FOR EACH TRIP IS: " + mgp);
            System.out.println("THE COMBINED MILES PER GALLON IS : " + average);
        System.out.println("TOTAL AVERAGE OF ALL MILES IS : " + average2);
    }
    }

