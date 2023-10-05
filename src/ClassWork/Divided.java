package classwork;

import java.util.Scanner;

public class Divided {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER AN INTEGER : ");
        int userInput = input.nextInt();
        int reminder = userInput % 10;
        int sum = userInput + reminder;

        System.out.println(sum);
    }
}
