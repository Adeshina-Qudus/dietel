package ChibuzoAssignment;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");

        int firstUserInput = input.nextInt();
        int secondUserInput = input.nextInt();

        int count = 1;
        for(int num = 1; num <= secondUserInput; num++){
            count *= firstUserInput;

        }
        System.out.println(count);

    }
}



