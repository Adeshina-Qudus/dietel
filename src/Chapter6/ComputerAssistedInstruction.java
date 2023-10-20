package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    public static void main(String[] args) {
        generateQuestion();
    }
    public static int randomNumber() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(1,10);
    }
    public static void generateQuestion() {
        Scanner input = new Scanner(System.in);
        int firstNumber = randomNumber();
        int secondNumber = randomNumber();
        boolean condition = true;
        while (condition) {
            System.out.println("How much is " + firstNumber + " times " + secondNumber);
            int answer = input.nextInt();
            if (answer == firstNumber * secondNumber) {
                System.out.println("very good ");
                newQuestion(firstNumber,secondNumber,answer);
                condition = false;
            } else {
                System.out.println("no please try again ");
            }
        }
    }

    public static void newQuestion(int firstNumber , int secondNumber , int answer){
        firstNumber = randomNumber();
        secondNumber = randomNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("How much is "+firstNumber +" times "+secondNumber);
        answer = input.nextInt();
        while (answer == firstNumber * secondNumber){
            System.out.println("How much is "+firstNumber +" times "+secondNumber);
            answer = input.nextInt();
            firstNumber = randomNumber();
            secondNumber = randomNumber();
        }
        }

}