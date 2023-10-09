package chapter3;

import java.util.Scanner;

public class TargetHeartRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TargetHeart rate = new TargetHeart("Qudus","adeshina",2004);

        System.out.println("ENTER FIRST NAME : ");
        String firstName = input.next();
        input.nextLine();
        rate.setFirstName(firstName);

        System.out.println("ENTER LAST NAME : ");
        String lastName = input.next();
        input.nextLine();
        rate.setLastName(lastName);

        System.out.println("ENTER BIRTH YEAR : ");
        int birthYear = input.nextInt();
        rate.setBirthYear(birthYear);


        System.out.println("THE FIRST NAME IS : "+rate.getFirstName());
        System.out.println("THE LAST NAME IS : "+rate.getLastName());
        System.out.println("THE BIRTH-YEAR IS : "+rate.getBirthYear());
        System.out.println("THE CALCULATE MAX HEART RATE IS : "+rate.calculateMaxHeartRate());
        System.out.println("THE TARGET HEART RATE OF 50% IS : "+rate.getTargetHeartRateOne());
        System.out.println("THE TARGET HEART RATE OF 85% IS :"+rate.getTargetHeartRateTwo());


    }
}
