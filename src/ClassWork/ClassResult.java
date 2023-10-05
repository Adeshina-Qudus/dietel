package classwork;



    /* collect user score
       if user  score is grater than 90 or equals to 100
                print A
        if user  score is grater than 80 or equals to 89
                 print B
        if user  score is grater than 70 or equals to 79
                   print C
        if user  score is  grater than 60 or equals to 69
                   print D
        if user  score is less than 60
                   print F
     */

import java.util.Scanner;

public class ClassResult {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your score :");

        int score = Input.nextInt();

        if (score >= 90 || score == 100) {
            System.out.println("A");
        }
        else if
        (score >= 80 || score == 89) {
            System.out.println("B");
        }
        else if
        (score >= 70 || score == 79 ) {
            System.out.println("C");
        }
        else if
        (score >= 60 || score == 69 ) {
            System.out.println("D");
        }
        else if
        (score < 60 ) {
            System.out.println("F");
        }

    }
}


