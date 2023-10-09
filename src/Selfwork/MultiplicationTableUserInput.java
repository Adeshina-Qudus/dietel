package Selfwork;

import java.util.Scanner;

public class MultiplicationTableUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBEInt(R : ");
        int userInput = input.nextInt();

        int count = 1;

        for (count = 1; count <= 12 ; count++){

            int total = userInput * count;
            System.out.println(userInput+ " *  " +count+ " = " +total);

        }

    }

}