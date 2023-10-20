package ChibuzoAssignment;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.beans.PropertyWrapper;

import java.util.Arrays;
import java.util.Scanner;

public class LagbajaSchools {
    public static void main(String[] args) {
        student();
        scoreTable();
    }

    static int numberOfStudent;
    static int numberOfSubject;
    static int[][] scoreTable = new int[numberOfStudent][numberOfSubject];
    public static  void student() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you have?");
        numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer?");
        numberOfSubject = input.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        scoreTable = new int[numberOfStudent][numberOfSubject];
        subjectStudentSaving();
    }

    public static void subjectStudentSaving(){

        Scanner input = new Scanner(System.in);
        for (int row = 0 ; row < scoreTable.length ; row++){
            for (int column = 0 ; column < scoreTable[row].length ; column++){
                System.out.printf("""
                                    Entering score for student %d
                                    Enter score for subject %d
                                    """, (row + 1),(column + 1));
                scoreTable[row][column] = input.nextInt();
                System.out.println("""
                                    Saving >>>>>>>>>>>>>>>>>>>>>
                                    Saved Successfully
                                    """);
                System.out.println();
            }
        }
    }
    public static void scoreTable(){
        StringBuilder empty = new StringBuilder();
        for (int count = 0 ; count < numberOfSubject; count++){
            empty.append("SUB").append(count + 1).append("\t");
        }
      //  StringBuilder emptyStudent = new StringBuilder();
//        for (int count = 0 ; count < numberOfStudent ; count++){
//            emptyStudent.append("STUDENT").append(count + 1).append("\n");
//        }
        System.out.println("=============================================");
        System.out.println("STUDENT "+ empty +  "TOT    AVE     POS" );
        System.out.println("=============================================");
       // System.out.print(emptyStudent);

        for (int[] row : scoreTable) {
            for (int column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
   }
}
