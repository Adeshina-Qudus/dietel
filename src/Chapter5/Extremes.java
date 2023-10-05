package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int sum = 0;
        int minimum = 0;
        int maximum = 0;

        for (int count = 1 ; count <= 4 ; count++){
            System.out.println("ENTER A NUMBER ");
            int userInput = input.nextInt();
            if (count == 1){
                maximum = userInput;
                minimum = userInput;
            }else {
                if (userInput > maximum) {
                    maximum = userInput;
                    sum += maximum;
                }
                if (userInput < minimum) {
                    minimum = userInput;
                    sum += maximum;
                }
            }

        }
        System.out.println(maximum+ "maximum");
        System.out.println(minimum+ "minimum");
        System.out.println(sum);
    }
}
