package ChibuzoTask;

import java.util.Scanner;

public class CollectTenScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] scores = new int[3];
        int average = scores[0];
        int total = scores[0];
        int minimum = scores.length;
        int maximum = scores[0];

        int count;
        for (count = 0; count < scores.length; count++) {
            System.out.println("ENTER YOUR SCORE ");
            scores[count] = input.nextInt();
            total += scores[count];
             minimum = scores[count];

            if (scores[count] > maximum) {
                maximum = scores[count];
            } else if (scores[count] < minimum ){
                minimum = scores[count];
            }
        }

            average = total / scores.length;
            System.out.println("AVERAGE IS " + average);
            System.out.println("TOTAL IS " + total);
            System.out.println("MINIMUM IS " + minimum);
            System.out.println("MAXIMUM IS " + maximum);
        }

    }

