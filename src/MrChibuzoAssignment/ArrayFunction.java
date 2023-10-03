package MrChibuzoAssignment;

import java.util.Arrays;

public class ArrayFunction {

    public static int[] oddPosition(int[] element) {

        int[] odd = new int[element.length / 2];
        int oddPosition = 0;
        for (int count = 1; count < element.length; count += 2) {
            odd[oddPosition] = element[count];
            oddPosition++;
        }
        return odd;
    }

    public static int[] evenPosition(int[] element) {
        int[] even;
        if (element.length % 2 == 0) {
            even = new int[element.length / 2];
        } else {
            even = new int[element.length / 2 + 1];
        }
        int evenPosition = 0;
        for (int count = 0; count < element.length; count += 2) {
            even[evenPosition] = element[count];
            evenPosition++;
        }
        return even;
    }

    public static int largestElement(int[] element) {
        int largest = element[0];
        for (int count = 1; count < element.length; count++) {
            if (element[count] > largest) {
                largest = element[count];
            }
        }
        return largest;
    }


    public static boolean ifAnElementOccurs(int[] list, int element) {
        for (int count = 0; count < list.length; count++) {
            if (list[count] == element)
                return true;
        }
        return false;
    }

    public static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        int change = 0;
        for (int count = list.length - 1; count >= 0; count--) {
            reverse[change] = list[count];
            change++;
        }
        return reverse;
    }

    public static int[] sum(int[] list) {
        int sum = 0;
        for (int count = 0; count < list.length; count++) {
            sum += list[count];
        }
        return new int[]{sum};
    }


    public static int[] sumDoWhile(int[] list) {
        int sum = 0;
        int count = 0;
        do {
            sum += list[count];
            count++;
        } while (count < list.length);
        return new int[]{sum};
    }

    public static int[] sumWhile(int[] list) {
        int sum = 0;
        int count = 0;
        while (count < list.length) {
            sum += list[count];
            count++;
        }
        return new int[]{sum};
    }

    public static String[] concantenation(char[] listOne, int[] listTwo) {
        char lengthOne = (char) listOne.length;
        int lengthTwo = listTwo.length;
        String[] concatenation = new String[lengthOne + lengthTwo];
        int concatenate = 0;
        for (int count = 0; count < listOne.length; count++) {
            concatenation[concatenate] = String.valueOf(listOne[count]);
            concatenate++;
        }
        for (int counter = 0; counter < listTwo.length; counter++) {
            concatenation[concatenate] = String.valueOf(listTwo[counter]);
            concatenate++;
        }
        return concatenation;
    }

    public static String[] combineList(char[] listOne, int[] listTwo) {
        char lengthOne = (char) listOne.length;
        int lengthTwo = listTwo.length;
        String[] concatenation = new String[lengthOne + lengthTwo];
        int concatenate = 0;
        for (int count = 0; count < concatenation.length; count++) {
            if (count < listOne.length)
                concatenation[concatenate] = String.valueOf(listOne[count]);
            concatenate++;
            if (count < listTwo.length)
                concatenation[concatenate] = String.valueOf(listTwo[count]);
            concatenate++;
        }
        return concatenation;
    }


//    public static int[] numberAndReturnDigit(int[] number) {
//        int[] digit = number;
//        int[] seperate = {0};
//        int counter = 0;
//        for (int count = 0; count < number.length; count++) {
//            seperate = new int[number.length % 10];
//            digit = new int[digit.length / 10];
//            seperate[counter] = number[count];
//        }
//
//        return seperate;
//    }

    public static boolean stringPalindrome(String[] letters) {
        String [] reverse = new String[]{String.valueOf(letters.length)};
        int change = 0;
        for (int count = 0; count < letters.length / 2; count++) {
            if (reverse[change].equals(letters[count])) {
                return true;
            }
            change++;
        }
        return false;
    }
}