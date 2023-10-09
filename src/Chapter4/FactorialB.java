package chapter4;

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int userInput = input.nextInt();
        double multiply = 1;
        double divide = 1;
        double add = 1;
        for (int number = 1; number <= userInput;number++){
            multiply = multiply * number;
            double calculate = divide/ multiply;
            add += calculate;
        }
        System.out.println(add);
    }
}
