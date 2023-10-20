package Selfwork;

import java.util.Scanner;

public class ArrayTenScoresAverageOfEvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        int average = 0;
        int counter = 0;
        for (int count = 0 ; count < array.length ; count++){
            System.out.println("enter your score");
            array[count] = input.nextInt();
            if (array[count] % 2 == 0) {
                sum += array[count];
                counter++;
            }
        }
        average = sum / counter;
        System.out.println(average);
        System.out.println(sum);

    }
}
