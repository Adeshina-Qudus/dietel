package Chapter4;

public class Checkerboard {
    public static void main(String[] args) {

        for (int first_loop = 1; first_loop <= 8; first_loop++) {
            if (first_loop % 2 == 0) System.out.print(" ");
            for (int second_loop = 1; second_loop <= 8; second_loop++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();


    }
}
