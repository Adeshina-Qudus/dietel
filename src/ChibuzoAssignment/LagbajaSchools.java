package ChibuzoAssignment;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.beans.PropertyWrapper;

import java.util.Arrays;
import java.util.Scanner;

public class LagbajaSchools {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer?");
        int numberOfSubject = input.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int[] studentScore = {};

        int[][] scoreTable = new int[numberOfStudent][numberOfSubject];
        int row = 0;
        int column = 0;
        for (row = 0; row < scoreTable.length; row++) {
            for (column = 0; column < scoreTable[row].length; column++) {
                System.out.printf("""
                        Entering score for student  %d
                        Enter score for subject %d
                                """, row + 1, column + 1);
                studentScore = new int[]{input.nextInt()};
                System.out.println("""
                        Saving >>>>>>>>>>>>>>>>>>>>>>>
                        Saved successfully
                        """);
                }

            }
        for (; row < scoreTable.length ; row++){
            for (; column < scoreTable[row].length ; column++){


            }
        }


    }
}
