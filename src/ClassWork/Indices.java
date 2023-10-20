package ClassWork;

public class Indices {

    public static boolean indices(int number , int index1 , int index2, int target){
        String num = String.valueOf(number);
        int length = num.length();
        String indices = String.valueOf(num.charAt(index1));
        int value1 = Integer.parseInt(indices);
        String indices2 = String.valueOf(num.charAt(index2));
        int value2 = Integer.parseInt(indices2);
        return value1 < target && value2 > target;
    }
}
