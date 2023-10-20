package ProgramizArrayQuestions;

import java.util.Scanner;

public class SmallestElementInAnArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] numbers = new int[5];
        int smallest = numbers[0];
        for (int count = 0; count < numbers.length ; count++){
            System.out.println("Enter number "+ (count + 1));
            numbers[count] = input.nextInt();
            if (numbers[count] < smallest){
                smallest = numbers[count];
            }
        }
        System.out.println("Smallest number is "+smallest);
    }
}
