package classwork;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    public static void main(String[] args){

        Account account = new Account();


        account.deposit (100000);
        account.withdraw (70000);




        System.out.println(" balance is  :  "  + account.balance());






    }
}