package Selfwork;

public class MultiplicationTableOneToTwentyFour {
    public static void main(String[] args) {
        for (int first_loop = 1; first_loop <= 12; first_loop++) {
            for (int second_loop  = 1; second_loop  <= 24 ; second_loop ++) {
                int multiply = second_loop * first_loop;
                System.out.print(second_loop+ " * " +first_loop+ " = " +multiply+" ");
            }
            System.out.println();

        }
    }
}
