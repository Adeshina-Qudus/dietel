package tdd;

import chapter4.CreditLimit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitCalculatorTest {

    @Test
    public void testThatCreditLimitExist(){
        CreditLimit credit = new CreditLimit();
        assertNotNull(credit);

    }
    @Test
    public void testThatCustomerHaveAccountNumber(){
        CreditLimit credit = new CreditLimit();
        credit.setAccountNumber(2126903496);
        assertEquals(2126903496,credit.getAccountNumber());
    }

    @Test
    public void testThatCustomerHaveBalance(){
        CreditLimit credit = new CreditLimit();
        double balance =  credit.getBalance();
        assertEquals(0,balance);
    }
    @Test
    public void testThatItemChargedByTheCustomerThisMonth(){
        CreditLimit credit = new CreditLimit();

    }
}
