package ProgramizArrayQuestions;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int [] array = {9,12,21,11,14};
        System.out.println(calculateSD(new int[]{4, 5, 6, 78, 3, 2, 4}));
    }

    public static double calculateSD(int[] param){
       double sum = 0;
       double mean = 0;
       double difference = 0;
       double squareDifference = 0;
       double variance = 0;
       double result = 0;
       double sd = 0 ;
        for (int count : param) {
            sum += count;
        }
        mean = sum / param.length;
        for (int counter : param) {
        difference = mean - counter;
        squareDifference = Math.pow(difference, 2);
        result += squareDifference;
        }
        variance += result / param.length;
        sd = Math.sqrt(variance);
        return sd;
    }

}
