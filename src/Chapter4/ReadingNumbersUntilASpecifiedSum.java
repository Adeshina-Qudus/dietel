package Chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int userInput = input.nextInt();
        int sum = 0;

        while (userInput >= sum){
            System.out.println("ENTER A NUMBER ");
            int userInputSum = input.nextInt();
            sum += userInputSum;
        }
        System.out.println(sum);

    }
}
