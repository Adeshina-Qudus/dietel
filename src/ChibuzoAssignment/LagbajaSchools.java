package ChibuzoAssignment;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.beans.PropertyWrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LagbajaSchools {
    public static void main(String[] args) {

      student();
       scoreTable();
    //System.out.println(Arrays.toString(lastDigit(new int[]{12, 21})));
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
                if(scoreTable[row][column] < 0){
                    scoreTable[row][column] = 0;
                }
                while (scoreTable[row][column] > 100){
                    System.out.println("ENTER A VALID SCORE FROM 0 TO 100 ");
                    scoreTable[row][column] = input.nextInt();
                }
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
        System.out.println("========================================================");
        System.out.println("STUDENT     "+ empty +  "TOT    AVE      POS" );
        System.out.println("========================================================");
        int counter = 0 ;
        double average = 0 ;
        int change = 0 ;

        int[] total = total(scoreTable);
        double [] averagePos = new double[numberOfStudent];
        for (int row = 0 ; row < scoreTable.length ; row++) {
            System.out.print("STUDENT "+(counter + 1)+"\t");
            for (int column = 0; column < scoreTable[row].length; column++) {
                System.out.print(column + "\t\t");
                average = (double) total[change] / numberOfSubject;
                averagePos[change] = average;
                System.out.print((returnInt(new int[]{total[change]})) + "\t\t");
                System.out.printf("%.2f", average);
                System.out.print("\t\t" + (returnInt(averagePos(total))));
            }
                counter++;
                change++;
            System.out.println();
        }
   }
   public static int[] averagePos(int [] array){
        int [] newArray = new int[array.length];
        Arrays.fill(newArray, 1);
        for (int outter = 0; outter < array.length ; outter++){
            for (double v : array) {
                if (array[outter] < v) {
                    newArray[outter] += 1;
                }
            }
        }
        return newArray;
   }
   public static int[] total(int [][] scoreTable){
        int []total = new int[numberOfStudent];
        int change = 0;
       for (int[] row : scoreTable) {
           for (int column : row) {
               total[change] += column;
           }
           change++;
           }
       return total;
   }


   public static int returnInt(int [] array){
        StringBuilder string = new StringBuilder();
       for (int i : array) {
           string.append(i);
       }
        return Integer.parseInt(string.toString());
   }

//    public static  int [] lastDigit(int[]digits) {
//        int [] newArray = new int[digits.length];
//        int number = Integer.parseInt(String.valueOf("1" + "0".repeat(digits.length - 1)));
//        for (int counter = 0 ; counter < digits.length; counter++){
//           newArray[counter] = digits[counter] % number;
//        }
//
//        return newArray;
//    }


}
