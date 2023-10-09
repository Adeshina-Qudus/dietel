package ChibuzoAssignment;

import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {

                Scanner input = new Scanner (System.in);

               do{  System.out.println("ENTER FIRST NUMBER :");
                    int firstUserInput = input.nextInt();
                    System.out.println("ENTER SECOND NUMBER:");
                    int secondUserInput = input.nextInt();
                    int sum = firstUserInput + secondUserInput;
                    System.out.println("SUM OF USER INPUT IS " +sum);
                    System.out.println();
                    System.out.println(""" 
                                            DO YOU WISH TO PERFORM THIS OPERATION AGAIN ? 
                                            
                                            YOU WANT TO CONTINUE ? 
                                                      PRESS 
                                                       [1]
                                            YOU WANT TO TERMINATE ?  
                                                      PRESS
                                                       [2]              """);
                    int userInput = input.nextInt();

                    if (userInput == 1) continue;

                    if (userInput == 2 ) break;


               }while  (true);



    }
}
