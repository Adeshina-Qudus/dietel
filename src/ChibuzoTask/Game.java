package ChibuzoTask;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        char [] [] games = { {'x','0','x'} , {'x','x','o'} , {'o','x','x'} };
        for (int number = 0; number  < games.length; number ++) {
            for (int count  = 0; count  < games.length ; count ++) {
                System.out.print(games[number] [count] +" , ");

            }
            System.out.println();
        }

    }
}
