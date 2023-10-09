package chapter3;

import java.util.Scanner;

public class HealthRecordTest {
    public static void main(String[] args) {

        HealthRecord health = new HealthRecord("qudus","lekan","male","july",6,2001,12.4,34.2);
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER YOUR FIRST NAME : ");
        String name = input.nextLine();
        health.setFirstName(name);

        System.out.println("ENTER YOUR LAST NAME : ");
        String lastName = input.nextLine();
        health.setLastName(lastName);

        System.out.println("ENTER YOUR GENDER : ");
        String gender = input.nextLine();
        health.setGender(gender);

        System.out.println("ENTER YOUR MONTH OF BIRTH : ");
        String month = input.nextLine();
        health.setMonthOfBirth(month);

        System.out.println("ENTER YOUR DAY OF BIRTH : ");
        int day = input.nextInt();
        health.setDayOfBirth(day);

        System.out.println("ENTER YEAR OF BIRTH : ");
        int year = input.nextInt();
        health.setYearOfBirth(year);

        System.out.println("ENTER HEIGHT IN INCHES : ");
        double height = input.nextDouble();
        health.setHeightInInches(height);

        System.out.println("ENTER WEIGHT IN POUNDS : ");
        double weight = input.nextDouble();
        health.setWeightInPounds(weight);


        System.out.println();

        System.out.println("FIRST NAME IS : "+health.getFirstName());
        System.out.println("LAST NAME IS : "+health.getLastName());
        System.out.println("GENDER IS : "+health.getGender());
        System.out.println("DATE OF BIRTH IS : "+health.getMonthOfBirth()+" "+health.getDayOfBirth()+" "+health.getYearOfBirth());
        System.out.println("Age in year is: " + health.getAge());
        System.out.println("MAXIMUM HEARTH RATE IS : "+health.getMaximumHeartRate());
        System.out.println("TARGET HEARTH RATE FOR (50%) IS : "+health.getTargetHeartRateOne());
        System.out.println("TARGET HEARTH RATE FOR (85%) IS : "+health.getTargetHeartRateTwo());
        System.out.println("BMI IS : "+health.getBmi());
    }
}
