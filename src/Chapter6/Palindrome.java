package Chapter6;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome(12321));

    }

    public static String palindrome(int number){

        String digit = String.valueOf(number);
        String reverse = "";
        for (int count = digit.length() ; count > 0 ; count ++){
            reverse = String.valueOf(count);
        }
        return reverse;
    }
}
