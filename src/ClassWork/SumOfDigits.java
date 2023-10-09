package ClassWork;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(345));
    }
    public static int sumDigits(int number) {
        int digit = number;
        int sum = 0;
        int divide = 0;
        while (digit != 0) {
            divide = digit % 10;
            sum += divide;
            digit /= 10;
        }
        return sum;
    }
}