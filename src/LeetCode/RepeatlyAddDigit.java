package LeetCode;

public class RepeatlyAddDigit {


    public static void main(String[] args) {

        System.out.println(addDigit(String.valueOf(5678 )));
    }


    public static int addDigit(String digits){
        StringBuilder numbers = getStringBuilder(digits);
        int number = Integer.parseInt(String.valueOf(numbers));
        int digit = Integer.parseInt((digits));
        int sum = 0 ;
        boolean condition = true;
        sum = getSum(condition, digit, number, sum);
        return sum;

    }

    private static int getSum(boolean condition, int digit, int number, int sum) {
        String digits;
        int modulo;
        int divide;
        while (condition) {
            divide = digit / number;
            modulo = digit % number;
            sum = divide + modulo;
            if (sum <= 9) {
                condition = false;
            }
            digits = String.valueOf(sum);
            StringBuilder num = getBuilder(digits);
            number = Integer.parseInt(String.valueOf(num));
            digit = sum;
        }
        return sum;
    }

    private static StringBuilder getBuilder(String digits) {
        StringBuilder num = new StringBuilder("1");
        for (int count = 0; count < digits.length() ; count++){
            if (count > 0){
                num.append(0);
            }
        }
        return num;
    }

    private static StringBuilder getStringBuilder(String digits) {
        StringBuilder numbers = new StringBuilder("1");
        for (int count = 0; count < digits.length() ; count++){
            if (count > 0){
                numbers.append(0);
            }
        }
        return numbers;
    }
}
