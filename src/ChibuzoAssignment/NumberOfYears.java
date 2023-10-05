package ChibuzoAssignment;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {


        // 60 MINUTES MAKE 1 HOUR
        // 60 * 24 WE HAVE 1440 MINUTES IN A DAY
        //1440 * 365 == 525,600
        //


        Scanner input = new Scanner(System.in);
        System.out.println("ENTER MINUTES : ");
        long userInput = input.nextLong();

        long days = userInput / 1440;
        long years = userInput / days;

        System.out.println(userInput+ " minutes is approximately " +years+ " years  and " +days+ "days");

    }
}

