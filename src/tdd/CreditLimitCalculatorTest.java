package tdd;

import Chapter4.CreditLimitCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CreditLimitCalculatorTest {

    @Test
    public void testThatCreditLimitCalculatorExist(){
        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        assertNotNull(creditLimit);
    }

    @Test
    public void testThatCustomerHaveAccountNumber(){

        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        int accountNumber = 1049151109;
        creditLimit.setAccountNumber(accountNumber);
    }

    @Test
    public void testCustomerBalanceAtTheBeginningOfTheMonth(){

        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        int balance = 30_000;
        creditLimit.balance(balance);
        assertEquals(30_000, creditLimit.getBalance());
    }

    @Test
    public void testTotalOfAllItemsChargeByCustomerThisMonth(){

        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        int totalItemCharged = 10_000;
        creditLimit.totalItemCharged(totalItemCharged);
        assertEquals(10_000,creditLimit.getTotalItemCharged());
    }

    @Test
    public void testTotalOfAllCreditAppliedToCustomerAccount(){

        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        int totalCreditApplied = 20_000;
        creditLimit.totalCreditApplied(totalCreditApplied);
        assertEquals(20_000,creditLimit.getTotalCreditApplied());
    }

    @Test
    public void testAllowedCreditLimit(){

        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        int allowedCreditLimit = 10_000;
        creditLimit.allowedCreditLimit(allowedCreditLimit);
        assertEquals(10_000,creditLimit.getAllowedCreditLimit());
    }

    @Test
    public void testNewBalance(){

        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        creditLimit.balance(30_000);
        creditLimit.totalItemCharged(10_000);
        creditLimit.totalCreditApplied(20_000);
        assertEquals(20_000, creditLimit.getNewBalance());
    }

    @Test
    public void testCreditLimitExceeded(){
        CreditLimitCalculator creditLimit = new CreditLimitCalculator();
        creditLimit.balance(30_000);
        creditLimit.totalItemCharged(10_000);
        creditLimit.totalCreditApplied(20_000);
        assertEquals(20_000, creditLimit.getNewBalance());
        assertEquals(creditLimit.getNewBalance(), creditLimit.creditLimitExceeded());
    }

}
