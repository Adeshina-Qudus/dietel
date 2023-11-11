package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {


    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int sum = 0;
        int[] arrayNumbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] array = new int[11];
        for (int runTime = 0; runTime < 36000000; runTime++) {
            int firstRandom = random.nextInt(1, 7);
            int secondRandom = random.nextInt(1, 7);
            sum = firstRandom + secondRandom;
            for (int count = 0; count < arrayNumbers.length; count++) {
                if (sum == arrayNumbers[count]) {
                    array[count] += 1;
                }
                if (runTime == 36000000 - 1) {
                    System.out.println(arrayNumbers[count] + " is sum " + array[count] + " times ");
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
