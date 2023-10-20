package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {
        guessNumber();
    }


    public static void guessNumber(){

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        boolean condition = true;
        while (condition){
            System.out.println("Guess a number between 1 and 1000");
            int userInput = input.nextInt();
            int randomNumbers = 1 + random.nextInt(10);
            if (userInput < randomNumbers){
                System.out.println("Too low   Try again !!!! ");
            }if (userInput > randomNumbers) {
                System.out.println("Too High  Try again !!!!! ");
            }
            else if (userInput != randomNumbers){
                System.out.println("Enter your next guess ");
                userInput = input.nextInt();
            }
            if (userInput == randomNumbers ){
                System.out.println("Congratulation you guessed the number !");
            System.out.println("Do you wish to play again ");
            String playAgain = input.next();
            if (playAgain.equalsIgnoreCase("no")){
                condition = false;
            }
            }
        }
    }
}
