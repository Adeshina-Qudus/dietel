package GreeksForGreeks.levelOne;

public class CountNumberOfOccurrencesFunction {

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
