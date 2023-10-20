package ProgramizArrayQuestions;

import java.util.Scanner;

public class PercentageMarksOfStudent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double [] studentMark = new double[8];
        double sum = 0;
        double average = 0;

        for (int count = 0; count < studentMark.length ; count++){
            System.out.println("enter mark "+ (count + 1));
            studentMark[count] = input.nextDouble();
            sum += studentMark[count];
        }
            average = sum / studentMark.length;
        System.out.println(average);

    }
}
