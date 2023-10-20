package Chapter4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {

            System.out.println("ENTER RESULT (1 = PASS, 2 = FAIL): ");
            int userInputResult = input.nextInt();

            if (userInputResult == 1) {
                passes = passes + 1;
            } else if (userInputResult == 2) {
                failures = failures + 1;
            } else {
                System.out.println("ENTER A VALID RESULT : ");
                continue;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.println("PASSED "+passes);
        System.out.println("FAILURE "+failures);
        if (passes > 8){
            System.out.println("BONUS TO THE INSTRUCTOR!!");
        }
      }

    }

