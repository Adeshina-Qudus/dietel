package Selfwork;
import java.util.Scanner;
public class StudentGradeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        StudentGrade grade = new StudentGrade("udeme joy",45);
        System.out.println("ENTER YOUR NAME ");
        String name = input.nextLine();
        grade.setName(name);
        System.out.println();
        System.out.println("ENTER YOUR AVERAGE ");
        double average = input.nextDouble();
        grade.setAverage(average);
        System.out.println();

        StudentGrade grade1 = new StudentGrade("joy joseph",20);
        System.out.println("ENTER YOUR NAME ");
        String name1 = input.next();
        grade1.setName(name1);
        System.out.println();
        System.out.println("ENTER YOUR AVERAGE ");
        double average1 = input.nextDouble();
        grade1.setAverage(average1);


        System.out.println("STUDENT NAME IS : " +grade.getName());
        System.out.println("STUDENT AVERAGE IS : " +grade.getLetterGrade());
        System.out.println();

        System.out.println("STUDENT NAME IS : " +grade1.getName());
        System.out.println("STUDENT AVERAGE IS : " +grade1.getLetterGrade());
    }

}
