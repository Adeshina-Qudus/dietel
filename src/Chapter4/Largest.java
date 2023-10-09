package chapter4;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        int largest = number;

        for (int i = 1; i <= 10; i++) {

            System.out.println("ENTER NUMBER OF UNIT YOU SOLD : ");
            number = input.nextInt();
            counter++;
            System.out.println(counter+ " INPUTTED");
            System.out.println();

            if (number > largest){
                largest = number;
            }
        }

        System.out.println("LARGEST IS "+largest);
    }
}
