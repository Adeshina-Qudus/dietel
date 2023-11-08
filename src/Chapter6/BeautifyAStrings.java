package Chapter6;
import java.util.Scanner;

public class BeautifyAStrings {

    public static String addFullStop(String words) {
        int indexOf = words.length() - 1;
        char lastCharacter = words.charAt(indexOf);

        boolean stringContains = lastCharacter != '.';
        if (stringContains) return words + ".";
        return words;
    }

    public static String capitalizedFirstWord(String words) {
        return ((words.charAt(0) + "").toUpperCase()) + words.substring(1);
    }

    public static String addFullStopCapitalizedFirstWord(String words) {
        return addFullStop(capitalizedFirstWord(words));
    }
}