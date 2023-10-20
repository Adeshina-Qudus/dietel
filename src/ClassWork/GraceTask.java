package ClassWork;

import java.util.ArrayList;

public class GraceTask {

    public static void main(String[] args) {
        System.out.println(dominant(new int[]{9,3,10,7,4}));
    }

    public static boolean reverse(String input) {

        StringBuilder reverse = new StringBuilder();
        for (int count = input.length() -1  ; count >= 0; count--){
            reverse.append(input.charAt(count));
        }
        return reverse.toString().equals(input);
    }

    public static int[] duplicate(int[] arrayNumbers) {

        int change = 0;
        int firstCheck = 0;
        int [] result = new int[arrayNumbers.length / 4] ;
        for (int count = 0 ; count < arrayNumbers.length ;) {
            for (int arrayNumber : arrayNumbers) {
                boolean condition = true;
                while (condition) {
                    firstCheck = arrayNumbers[count];
                    count++;
                    condition = false;
                }
                if (firstCheck == arrayNumber)
                    result[change] = firstCheck;
                change++;
            }
            System.out.println(firstCheck);
            }
        return result;
    }


    public static ArrayList<Integer> dominant(int[] arrayNumbers ) {

        ArrayList<Integer> list = new ArrayList<>();

        int check = 0;


        return list;
}
}
