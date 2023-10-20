package ProgramizArrayQuestions;

import java.util.Scanner;

public class CompareFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[6];
        int first = numbers[0];
        int second = numbers[5];
        for (int count = 0 ; count < numbers.length ; count++) {
            System.out.println("enter number ");
              numbers[count] = input.nextInt();
        }
        if (first == second){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
