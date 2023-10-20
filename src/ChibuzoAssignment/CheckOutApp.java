package ChibuzoAssignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {

        ArrayList<String> userBought  = new ArrayList<>();
        ArrayList<Integer> pieces = new ArrayList<>();
        ArrayList<Double> unites = new ArrayList<>();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String format = dateTime.format(date);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = input.nextLine();
        boolean condition = true;
        int whileLoopCounter = 0;
        while (condition) {
        System.out.println("What did you buy ? ");
        String bought = input.next();
        userBought.add(bought);
        System.out.println("How many pieces ");
        int piece = input.nextInt();
        while (piece < 0) {
            System.out.print("enter a valid number piece : ");
            piece = input.nextInt();
        }
        pieces.add(piece);
        System.out.println("How much per unit ");
        double unit = input.nextDouble();
        while (unit < 0) {
            System.out.print("enter a valid unit : ");
            unit = input.nextInt();
        }
            unites.add(unit);
        System.out.println("Add more item ? [yes or no]");
            String item = input.next();
            if (item.equalsIgnoreCase("no")){
                condition = false;
            }
            whileLoopCounter++;
        }
        System.out.println("Cashiers name ");
        String cashier = input.next();
        System.out.println("How many discount will he get ");
        double discount = input.nextDouble();

        System.out.println();
        System.out.println();
System.out.printf("""
                SEMICOLON STORES\s
                MAIN BRANCH
                LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 09079447913
                Date:  %s
                Cashier:  %s
                customer Name : %s
                ===========================================================%n""",format,cashier,name);
       System.out.println("""
                       ITEM          QTY        PRICE          TOTAL(NGN)
                ------------------------------------------------------------
                                                                                """);
       double subTotal = 0;
       for(int count = 0  ; count < whileLoopCounter; count++) {
           subTotal += unites.get(count)*pieces.get(count);
           System.out.println("\t\t" + userBought.get(count) + "\t\t " + pieces.get(count) + "\t\t " + unites.get(count) + "\t\t\t" + unites.get(count) * pieces.get(count));
       }
       double discountResult = discount / 100 * subTotal;
       double vat = 17.50 / 100 * subTotal;
       double billTotal = subTotal - discountResult + vat;
        System.out.println("""
                -----------------------------------------------------------""");
          System.out.printf("""
                          \t                   Sub Total:         %.2f
                          \t                   Discount:          %.2f
                          \t                  VAT @ 17.50:        %.2f
                   ========================================================
                                              Bill Total:         %.2f
                   ========================================================
                     THIS IS NOT AN RECEIPT KINDLY PAY            %.2f                                                  \\s
                   ========================================================
                                                           """,subTotal,discountResult,vat,billTotal,billTotal);
        double balance = 0;
        double amountPaid = 0;
        System.out.println("KINDLY PAY ");
        double totalBil = input.nextDouble();
        System.out.println("How much did the customer give you "+totalBil);
        while (totalBil < billTotal){
            System.out.println("PAY YOUR TOTAL BILL!!!!");
            totalBil = input.nextDouble();
            if (totalBil == billTotal) {
                amountPaid = totalBil;
                balance = billTotal - totalBil;
            } else if (totalBil > billTotal) {
                amountPaid = totalBil;
                balance = billTotal - totalBil;
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("""
                SEMICOLON STORES\s
                MAIN BRANCH
                LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 09079447913
                Date:  %s
                Cashier:  %s
                customer Name : %s
                ===========================================================%n""",format,cashier,name);
        System.out.println("""
                       ITEM          QTY        PRICE          TOTAL(NGN)
                -----------------------------------------------------------
                                                                                """);
        for(int count = 0  ; count < whileLoopCounter; count++) {
            System.out.println("\t\t" + userBought.get(count) + "\t\t " + pieces.get(count) + "\t\t " + unites.get(count) + "\t\t\t" + unites.get(count) * pieces.get(count));
        }
        System.out.println("""
                -----------------------------------------------------------""");
        System.out.printf("""
                          \t                   Sub Total:         %.2f
                          \t                   Discount:          %.2f
                          \t                  VAT @ 17.50:        %.2f
                   ========================================================
                                              Bill Total:         %.2f
                                             Amount Paid:         %.2f
                                                 Balance:         %.2f
                   ========================================================
                                    THANK YOU FOR YOUR PATRONAGE
                   ========================================================
         
                                                           """,subTotal,discountResult,vat,billTotal,amountPaid,balance);


    }
}

