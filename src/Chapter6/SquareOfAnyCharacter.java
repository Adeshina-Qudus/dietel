package Chapter6;

import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW AND COLUMNS ");
        int rowColumn = input.nextInt();
        System.out.println("ENTER A CHARACTER ");
        char fill = input.next().charAt(0);
        square(rowColumn,fill);

    }
    public static void square(int numberOfRowAndColumns, char fillCharacter) {

        for (int row = 1; row <= numberOfRowAndColumns; row++) {
            for (int column = 1; column <= numberOfRowAndColumns; column++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}