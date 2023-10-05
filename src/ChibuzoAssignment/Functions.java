package ChibuzoAssignment;

public class Functions {
    public static boolean even(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primeNumber(int number) {

        int counter = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber - firstNumber;
        }
        return firstNumber - secondNumber;
    }
    public static int factor(int number) {
        int counter = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean square(int number) {
        int counter = 0;
        int result = 1;
        for (int count = 1; count <= number; count++) {
            result = count * count;

            if (result == number) {
                counter++;
            }
        }
        if (counter == 1) {
                return true;
            }
            else {
                return false;
            }
        }


    public static int factorial(int number) {
        int total = 1;
        for(int count = 1 ; count <= number ; count ++){
            total = total * count;
        }
        return total;
    }
}





