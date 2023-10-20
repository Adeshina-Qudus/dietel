package Chapter6;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        square(10);
    }

    public static void square(int numberOfRowAndColumns){

        for (int row = 1; row <= numberOfRowAndColumns ; row++){
            for(int column = 1 ; column <= numberOfRowAndColumns ; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
