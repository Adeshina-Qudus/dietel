package MrChibuzoAssignment;

public class CreditCardValidatorServer {

    public static int cardLength(String digits) {
        if (digits.length() < 13 || digits.length() > 16) {
            return 0;
        }
        return digits.length();
    }

    public static int visaCardFirstDigit(String digit) {
        String firstDigit = String.valueOf(digit.charAt(0));
        int number = Integer.parseInt(firstDigit);
        if (number != 4){
            return 0;
        }
        return number;
    }


    public static int masterCardFirstDigit(String digit) {
        String firstDigit = String.valueOf(digit.charAt(0));
        int number = Integer.parseInt(firstDigit);
        if (number != 5){
            return 0;
        }
        return number;
    }

    public static int americaExpressCardsFirstDigit(String digit) {
        String firstDigit = String.valueOf(digit.charAt(0));
        String secondDigit =  String.valueOf(digit.charAt(1));
        int answer = 0;
        int firstNumber = Integer.parseInt(firstDigit);
        int secondNumber = Integer.parseInt(secondDigit);
        if ( firstNumber == 3 && secondNumber == 7){
            String number = firstDigit + secondDigit;
            answer = Integer.parseInt(number);
        }
        return answer;
    }

    public static int discoverCardsFirstDigit(String digit) {
        String firstDigit = String.valueOf(digit.charAt(0));
        int number = Integer.parseInt(firstDigit);
        if (number != 6){
            return 0;
        }
        return number;
    }

    public static int evenPlace(String digit) {
        int total = 0;
        String sum = " ";
        String number = String.valueOf(digit.length());
        int num = Integer.parseInt(number);
        for(int count = num -2;count >= 0; count -=2){
            sum = String.valueOf(digit.charAt(count));
            int change = Integer.parseInt(sum);
            int multiply = change * 2;
            if (multiply > 9){
                int divide = multiply / 10;
                int mod = multiply % 10;
                multiply = divide + mod;
            }
            total += multiply;
        }
        return total;
    }
    public static int oddPlace(String digit) {
        int total = 0;
        String sum = " ";
        String number = String.valueOf(digit.length());
        int num = Integer.parseInt(number);
        for (int count = num - 1; count >= 0 ; count -= 2){
            sum = String.valueOf(digit.charAt(count));
            int change = Integer.parseInt(sum);
            total += change;
        }
        return total;
    }
    public static int sumOddAndEven(String digit) {
        return oddPlace(digit) + evenPlace(digit);
    }

    public static void validOrInvalid(String digit) {
        if (sumOddAndEven(digit) % 10 == 0){
            System.out.println("VALID");
        }else {
            System.out.println("INVALID");
        }
    }

    public static void cards(String digit){
        if (visaCardFirstDigit(digit) == 4){
            System.out.print("VISA CARD");
        }
        else if (masterCardFirstDigit(digit) == 5){
            System.out.print("MASTER CARD");
        }
        else if (americaExpressCardsFirstDigit(digit) == 37){
            System.out.print("AMERICAN EXPRESS CARD");
        }
        else if ((discoverCardsFirstDigit(digit) == 6)){
            System.out.println("DISCOVER CARD");
        }else {
            System.out.println("INVALID CARD");
        }
    }
}
