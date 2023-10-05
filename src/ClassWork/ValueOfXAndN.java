package classwork;

import java.util.Scanner;

public class ValueOfXAndN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number ");
        int userInputX = input.nextInt();
        System.out.println("enter second number ");
        int userInputN = input.nextInt();

        int multiplyN = (int) Math.pow(userInputX,userInputN);
        System.out.println(multiplyN);
    }
}
