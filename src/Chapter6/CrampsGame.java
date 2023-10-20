package Chapter6;

import java.util.Scanner;

public class CrampsGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a wager ");
        double userInput = input.nextDouble();

        double bankBalance = 1000;
        while (userInput > bankBalance){
            System.out.println("Enter a valid wager");
            userInput = input.nextDouble();
        }

    }
}
