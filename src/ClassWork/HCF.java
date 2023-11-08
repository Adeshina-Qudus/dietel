package ClassWork;

import Chapter6.GreatestCommonDivisor;

import java.util.Arrays;

public class HCF {

    public static void main(String[] args) {

        System.out.println(hcf(6,12,18 ));

        System.out.println(hcf(50,70,90,23));

    }

    public static int hcf(int ... numbers) {
        if (numbers.length == 2){
            String number1 = String.valueOf(numbers[0]);
            int number = Integer.parseInt(number1);
            String number2 = String.valueOf(numbers[1]);
            int number3 = Integer.parseInt(number2);
           return GreatestCommonDivisor.greatestCommonDivisor(number,number3);
        }
            int reminder = 0;
            int firstNumber = numbers[0];
            int secondNumber = numbers[1];
            int anyNumber = 0;
            for (int pickNumber = 2; pickNumber < numbers.length; ) {
                anyNumber = numbers[pickNumber];
                pickNumber++;
                boolean condition = true;
                while (condition) {
                    reminder = firstNumber % secondNumber;
                    if (reminder == 0) {
                        reminder = anyNumber;
                        condition = false;
                    }
                    firstNumber = secondNumber;
                    secondNumber = reminder;

                }
            }
            return firstNumber;
        }

}
