package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {

    public static void main(String[] args) {

        GuessTheNumberModify();
    }


    public static void  GuessTheNumberModify(){

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();


        int counter = 0;
        boolean condition = true;
        while (condition){
            System.out.println("Guess a number between 1 and 1000");
         int userInput = input.nextInt();
         counter++;
            int randomNumbers = 1 + random.nextInt(10);
            if (userInput < randomNumbers){
                System.out.println("Too low   Try again !!!! ");
            }if (userInput > randomNumbers) {
                System.out.println("Too High  Try again !!!!! ");
            }
            else if (userInput != randomNumbers){
                System.out.println("Enter your next guess ");
                userInput = input.nextInt();
                counter++;
            }
            if (userInput == randomNumbers ){
                if (counter < 10){
                    System.out.println("Either  you know the secret or you got lucky! ");
                }else if (counter == 10){
                    System.out.println("Aha! You know the secret");
                }else{
                    System.out.println("You should be able to do better!");
                }
                System.out.println("Congratulation you guessed the number !");
                System.out.println("Do you wish to play again [yes |or| no]");
                String playAgain = input.next();
                if (playAgain.equalsIgnoreCase("no")){
                    condition = false;
                }
            }
    }
}
}
