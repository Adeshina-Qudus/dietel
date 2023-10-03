package Chapter4;

public class AnotherDangling {
    public static void main(String[] args) {
        int x = 4;
        int y = 11;
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        }
         else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
