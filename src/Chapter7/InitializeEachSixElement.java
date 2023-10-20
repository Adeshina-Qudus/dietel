package Chapter7;

import java.util.Arrays;

public class InitializeEachSixElement {
    public static void main(String[] args) {

        int [] array = new int[6];
        Arrays.fill(array, -1);
        System.out.println(Arrays.toString(array));
    }
}
