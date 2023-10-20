package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class SetElement {
    public static void main(String[] args) {
        int multiply = 2;
        int [] array = new int[20];
        int bestScores = array[0];
        SecureRandom random = new SecureRandom();
        System.out.println("BEST SCORES!!!");
        for (int count = 0 ; count < array.length ; count++){
            array[count] = random.nextInt(1,100);
            if (count >= 10 && count <= 20){
                array[count] = 0;
            }if (array[count] < 1){
                break;
            }
            if (array[count] >= bestScores){
                array[count] *= multiply;
                System.out.println(array[count]);
            }
        }
    }
}
