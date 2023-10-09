package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        int count = 1;
        for (int number = 1; number <= userInput; number++) {
            count = count * number;
        }
        System.out.println(count);
    }
}
