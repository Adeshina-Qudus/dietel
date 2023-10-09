package ChibuzoTask;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfTenScores {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int largest = scores[0];
        Scanner input = new Scanner(System.in);
        for (int count = 0 ; count < scores.length ; count++){
            System.out.println("Enter your score ");
            scores[count] = input.nextInt();
            if (scores[count] > largest){
                largest = scores[count];
            }
            }
        System.out.println("LARGEST SCORE IS "+largest);

        }
    }

