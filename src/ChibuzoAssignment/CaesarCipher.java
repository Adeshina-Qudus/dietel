package ChibuzoAssignment;

import java.security.SecureRandom;

public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(encrypt("example" , 3));
    }
    public static String encrypt(String word , int shiftKey){

        String[] charArray = new String[word.length()];
        StringBuilder encryptLetters = new StringBuilder();
            for (int count = 0; count < charArray.length; count++) {
                char letters = word.charAt(count);

                charArray[count] =  String.valueOf(letters + shiftKey);
                if (letters > 26) {
                    charArray[count] = String.valueOf(letters + shiftKey % 26);
                    encryptLetters.append(charArray[count]);
                }
            }
        return String.valueOf(encryptLetters);
    }
}
