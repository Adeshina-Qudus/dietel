package ChibuzoTask;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

//        char [] [] games = { {'x','0','x'} , {'x','x','o'} , {'o','x','x'} };
//        for (int number = 0; number  < games.length; number ++) {
//            for (int count  = 0; count  < games.length ; count ++) {
//                System.out.print(games[number] [count] +" , ");
//            }
//            System.out.println();
//        }

        String [][] character = {{"A","M","C"} , {"W","I","T"}};
        String one = Arrays.toString(new String[]{character[0][0]});
        String two = Arrays.toString(new String[]{character[1][0]});
        String three = Arrays.toString(new String[]{character[0][1]});
        String four = Arrays.toString(new String[]{character[1][1]});
        String five = Arrays.toString(new String[]{character[0][2]});
        String six  = Arrays.toString(new String[]{character[1][2]});
        System.out.print(one+two+three+four+five+six);

    }
}
