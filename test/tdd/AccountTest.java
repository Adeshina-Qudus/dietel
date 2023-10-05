package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account();

        account.deposit(5000);
        assertEquals(5000, account.getBalance());
    }

        @Test
        public void testWithdraw() {
            Account account = new Account();
            account.deposit(5000);
            assertEquals(5000, account.getBalance());
            account.withdraw(3500);
            assertEquals(1500, account.getBalance());
        }


        @Test
        public void testDepositThreeTimes() {
            Account account = new Account ();
            account.deposit(1000);
            assertEquals(1000,account.getBalance());
            account.deposit(1000);
            assertEquals(2000,account.getBalance());
            account.deposit(1000);
            assertEquals(3000,account.getBalance());
            account.withdraw(2000);
            assertEquals(1000,account.getBalance());
            }


            }



