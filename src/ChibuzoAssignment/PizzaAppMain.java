package ChibuzoAssignment;

import java.util.Scanner;

public class    PizzaAppMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalBox;
        int totalSlices;
        int haveLeft;
        int price;
        System.out.println("""
          ***********************************************
          *      WHAT SIZE OF PIZZA YOU WANT TO GET ?   *
          *      FOR BIG SIZE [ENTER : LARGE]           *
          *      FOR MEDIUM SIZE [ENTER : MEDIUM]       *
          *      FOR SMALL SIZE [ENTER : SMALL]         *
          ***********************************************
                """);
        String userInput = input.next().toUpperCase();
        while (!(userInput.equals("LARGE")) && (!(userInput.equals("MEDIUM"))) && (!(userInput.equals("SMALL")))){
            System.out.println("ENTER A VALID SIZE OF PIZZA )> ");
            userInput = input.next().toUpperCase();
        }
            System.out.println("HOW MANY HUNGRY PEOPLE ");
            int hungry = input.nextInt();
            System.out.println("HOW MANY SEMI-HUNGRY PEOPLE ");
            int semiHungry = input.nextInt();
            System.out.println("HOW MANY CLASSIC PEOPLE ");
            int classic = input.nextInt();
            if (userInput.equals("LARGE")) {
                totalSlices = PizzaApp.totalSlices(hungry, semiHungry, classic);
                totalBox = PizzaApp.recommendLargeSize(hungry, semiHungry, classic);
                haveLeft = PizzaApp.LargePizzaSlicesLeft(totalSlices, totalBox);
                price = PizzaApp.largePizzaAmountRecommended(totalBox);
                System.out.println("total slices " + totalSlices);
                System.out.println("have left " + haveLeft);
                System.out.println("total box " + totalBox);
                System.out.println("price " + price);
            }
            if (userInput.equals("MEDIUM")) {
                totalSlices = PizzaApp.totalSlices(hungry, semiHungry, classic);
                totalBox = PizzaApp.recommendMediumSize(hungry, semiHungry, classic);
                haveLeft = PizzaApp.mediumPizzaSlicesLeft(totalSlices, totalBox);
                price = PizzaApp.mediumPizzaAmountRecommended(totalBox);
                System.out.println("total slices " + totalSlices);
                System.out.println("have left " + haveLeft);
                System.out.println("total box " + totalBox);
                System.out.println("price " + price);
            }
            if (userInput.equals("SMALL")) {
                totalSlices = PizzaApp.totalSlices(hungry, semiHungry, classic);
                totalBox = PizzaApp.recommendSmallSize(hungry, semiHungry, classic);
                haveLeft = PizzaApp.smallPizzaSlicesLeft(totalSlices, totalBox);
                price = PizzaApp.smallPizzaAmountRecommended(totalBox);
                System.out.println("total slices " + totalSlices);
                System.out.println("have left " + haveLeft);
                System.out.println("total box " + totalBox);
                System.out.println("price " + price);
            }

        }

    }

