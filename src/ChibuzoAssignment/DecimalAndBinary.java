package ChibuzoAssignment;

public class DecimalAndBinary {


    public static void main(String[] args) {
        System.out.println(decimalToBinary(13));
    }
    public static String decimalToBinary(int decimal) {

        int division = 0 ;
        StringBuilder binary = new StringBuilder();
        StringBuilder binary1 = new StringBuilder();
        int divide = 0;
        boolean condition = true;
        while (condition) {
            division = decimal % 2;
            binary.append(division);
            divide = decimal / 2;
            decimal = divide;
            if (divide == 0){
                condition = false;
            }
        }
        for (int count = binary.length() - 1; count >= 0 ; count--){
                 binary1.append(binary.charAt(count));
        }
        return binary1.toString();
    }






    public static int binaryToDecimal(String decimal) {
        int counter = 0;
        char charAt = 0;
        int sum = 0;
        int number = 0;
        for (int count = decimal.length() - 1; count >= 0; count--) {
            charAt = decimal.charAt(count);
            if (charAt == '1') {
                number = 1;
            }
            if (charAt == '0') {
                number = 0;
            }
            sum += number * (int) Math.pow(2, counter);
            counter++;
        }
        return sum;
    }
}
