package GreeksForGreeks.levelOne;
import static GreeksForGreeks.levelOne.SortArray.*;
public class CountNumberOfOccurrences {

    public static void main(String[] args) {
        occurrences(new int[]{1, 1, 2, 2, 2, 2, 3,},2);

    }

    public static void occurrences(int [] numbers, int occurrencesNumber){

        int counter = 0;
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] == occurrencesNumber){
                counter++;
            }
        }
        System.out.println(occurrencesNumber+" occurs "+counter+" times");
    }
}
