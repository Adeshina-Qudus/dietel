package ClassWork;

public class FmFunction {
    public static boolean isPalindrome(String characters) {

        StringBuilder reverse = new StringBuilder();

        for (int count = characters.length() - 1; count >= 0 ; count--){
            reverse.append(characters.charAt(count));
        }
        return characters.contentEquals(reverse.toString());
    }

    public static boolean compare(String first, String second) {

        String  one =  first.toUpperCase();
        String two = second.toUpperCase();

        int count = 0;
        for (count = 0; count < one.length(); count++) {


            }
        return false;
    }
}
