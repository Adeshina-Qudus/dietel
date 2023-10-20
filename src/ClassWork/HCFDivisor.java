package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class HCFDivisor {

    public static void main(String[] args) {
        System.out.println(hcfDivisor(30,60));
    }


    public static ArrayList<Integer> hcfDivisor(int ...numbers){

        ArrayList<Integer> divisorNumber = new ArrayList<>();
        int counter = 0;
        for (int count : numbers) {
            for (int divisor = 2 ; divisor < 20; divisor++){
                if (count % divisor == 0){
                    counter++;
                }
                if (count % divisor != 0){
                    divisor++;
                }
                if (counter == numbers.length){
                    divisorNumber.add(count);
                }
            }
        }
        return divisorNumber;
    }
}



