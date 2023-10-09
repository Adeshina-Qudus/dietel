package MrChibuzoAssignment;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        System.out.println("""
                ENTER YOUR CREDIT CARD NUMBER [NUMBER MUST BE 13 TO 16 DIGIT!!!]
                VISA CARDS MUST START WITH [4]
                MASTER CARDS MUST START WITH [5]
                AMERICAN EXPRESS CARDS MUST START WITH [37]
                DISCOVER CARDS MUST START WITH [6]
                
                HELLO, KINDLY ENTER YOUR CARD DETAILS TO VERIFY \s
                                          \s
                """);
        Scanner input = new Scanner(System.in);
           String creditCardNumbers = input.nextLine();
           String length = String.valueOf(creditCardNumbers.length());
           int len = Integer.parseInt(length);
           while (len < 13 || len > 16) {
               System.out.println("ENTER A VALID CARD NUMBER ");
               creditCardNumbers = input.nextLine();
               length = String.valueOf(creditCardNumbers.length());
               len = Integer.parseInt(length);
           }
               if (len >= 13 && len <= 16) {
                   System.out.println("*************************************************************");
                   System.out.print("**CREDIT CARD TYPE : ");
                   CreditCardValidatorServer.cards(creditCardNumbers);
                   System.out.println();
                   System.out.println("**CREDIT CARD NUMBER : " + creditCardNumbers);
                   System.out.println("**CREDIT CARD DIGIT LENGTH : " + creditCardNumbers.length());
                   System.out.print("**CREDIT CARD VALIDITY STATUS : ");
                   CreditCardValidatorServer.validOrInvalid(creditCardNumbers);
                   System.out.println("*************************************************************");
               }
           }
    }





