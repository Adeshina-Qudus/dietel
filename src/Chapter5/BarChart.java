package Chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int count = 1; count <= 5 ; count++) {
            System.out.println("ENTER A NUMBER BETWEEN ONE AN THIRTY ");
            int userInput = input.nextInt();
            while (userInput < 1 || userInput > 30 ){
                System.out.println("ENTER A VALID NUMBER FROM ONE TO THIRTY");
                userInput = input.nextInt();
                if (userInput >= 1 || userInput <= 30){
                    break;
                }
            }
            for (int counter = 1;counter <= userInput; counter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
