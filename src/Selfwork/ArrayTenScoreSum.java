package Selfwork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTenScoreSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        for (int count = 0 ; count < array.length ; count++){
            System.out.println("enter your score");
            array[count] = input.nextInt();
            sum += array[count];
        }
        System.out.println(sum);

    }
}
