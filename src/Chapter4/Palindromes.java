package Chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("ENTER A NUMBER CONSISTING FIVE DIGIT");
        int userInput = input.nextInt();

        int total = userInput;
        int reverse = 0;
        int count = 0;
        if (userInput >= 10000 && userInput < 99999) {
            while (userInput != 0) {
                count = userInput % 10;
                reverse = reverse * 10 + count;
                userInput /= 10;
            }
        }else {
                    System.out.println("ENTER A VALID DIGIT");
                    userInput = input.nextInt();
                }
        if (total == reverse){
            System.out.println("THIS IS A PALINDROME");
        }

    }
}
