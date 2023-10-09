package Selfwork;

public class AsterickStar {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            for (int space = 1; space <= 5; space++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("$ ");
            }
            for (int space2 = 1 ; space2 <= 5; space2++){
                System.out.print(" ");
            }
            for (int r = i; r <= 5; r++) {
                System.out.print("& ");
            }
            for (int space3 = 1; space3 <= 5; space3++){
                System.out.print(" ");
            }
            for (int t = 1; t <= i; t++){
                System.out.print("% ");
            }
            System.out.println();
        }
    }
}