package FMassignment;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER : ");
        int firstUserInput = input.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int secondUserInput = input.nextInt();

        if (firstUserInput == secondUserInput){
            System.out.println("0");
        } else if (firstUserInput > secondUserInput) {
            System.out.println("1");
        }else {
            System.out.println("-1");
        }
    }
}
