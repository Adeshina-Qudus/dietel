package ChibuzoTask;

import java.util.Scanner;

public class KeepAskingUntilTenValidScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10 ;){
            System.out.println("ENTER A YOUR SCORE ");
            int userInput = input.nextInt();
            if (userInput >= 1 && userInput <= 100){
                sum += userInput;
                count++;
            }
        }
        System.out.println("sum of score is "+sum);
}
}
