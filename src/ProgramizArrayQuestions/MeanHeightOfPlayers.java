package ProgramizArrayQuestions;

import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;
        for (int count = 0; count < height.length; count++){
            System.out.println("Enter height ");
            height[count] = input.nextDouble();
            sum += height[count];
        }
        double mean = sum / height.length;
        System.out.println("The mean height is "+mean);
    }
}
