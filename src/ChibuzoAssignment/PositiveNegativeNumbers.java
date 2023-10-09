package ChibuzoAssignment;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0 ;
        int count = 0;

        System.out.println("ENTER A NUMBER OR [-2] TO QUIT ");
        int userInput = input.nextInt();
        while(userInput != -2){
            if(userInput > 0 ) {
                positiveNumber++;
            }
           else if(userInput < 0) {
                negativeNumber++;
            }
            else {
                zeroNumber++;
            }
            count ++;
            System.out.println("ENTER A NUMBER OR [-2] TO QUIT ");
            userInput = input.nextInt();

        }
        System.out.printf("THE NUMBER OF POSITIVE NUMBERS ENTERED IS : %d%n",positiveNumber);
        System.out.printf("THE NUMBER OF NEGATIVE NUMBERS ENTERED IS : %d%n",negativeNumber);
        System.out.printf("THE NUMBER OF ZERO NUMBERS ENTERED IS : %d%n",zeroNumber);

    }
}
