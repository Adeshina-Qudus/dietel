package Chapter4;

public class Triangle {
    public static void main(String[] args) {
        fiveTriangle();
        secondTriangle();

    }

    public static void fiveTriangle() {
        for (int first_loop = 1; first_loop <= 5; first_loop++) {
            for (int second_loop = 1; second_loop <= first_loop; second_loop++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void secondTriangle() {
        for (int first_loop = 1; first_loop <= 4; first_loop++) {
            for (int second_loop = first_loop; second_loop <= 4; second_loop++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
