package Selfwork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO FIND THE FACTORIAL : ");
        int userInput = input.nextInt();

int total = 1;
for (int count = 1; count <= userInput; count++){
   total =  total * count;
}
        System.out.println("THE FACTORIAL OF " +userInput+ " IS "+total);
    }
}
