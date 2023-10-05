package Chapter5;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

       for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.print(" ");
            for (int space = i; space <= 10; space++) {
                System.out.print(" ");
            }
                 System.out.print(" ");
            for (int q = i ; q <= 10; q++ ) {
                System.out.print("*");
            }
           System.out.print(" ");
            for (int h = 1; h <= i ; h++ ){
                System.out.print(" ");
            }
                System.out.print(" ");
            for (int y = 1; y <= i ; y++){
                System.out.print(" ");
            }
                System.out.print("");
            for (int z = i; z <= 10 ; z++){
                System.out.print("*");
            }
                System.out.print(" ");
            for (int a = i; a <= 10 ; a++){
                System.out.print(" ");
            }
                System.out.print(" ");
            for (int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
                System.out.println();
        }

    }
}