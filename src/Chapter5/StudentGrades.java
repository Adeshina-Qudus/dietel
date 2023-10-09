package Chapter5;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
           // System.out.println("""
               //     STUDENT GRADE\s
             //       """);
            int gradeA = 0;
            int gradeB = 0;
            int gradeC = 0;
        System.out.println("ENTER YOUR NAME ");
        String name = input.nextLine();
        for (int count = 1 ; count <= 5 ; count++) {
            System.out.println("ENTER YOUR GRADE ");
            String userInput = input.nextLine();
            switch (userInput) {
                case "A":
                    gradeA++;
                    break;
                case "B":
                    gradeB++;
                    break;
                case "C":
                    gradeC++;
                    break;
                default:
                    System.out.println("INVALID GRADE");
            }
        }
        System.out.println(name);
        System.out.println("THE NUMBER OF STUDENT WHO EARNED GRADE A IS "+gradeA);
        System.out.println("THE NUMBER OF STUDENT WHO EARNED GRADE B IS "+gradeB);
        System.out.println("THE NUMBER OF STUDENT WHO EARNED GRADE B IS "+gradeC);

    }
}
