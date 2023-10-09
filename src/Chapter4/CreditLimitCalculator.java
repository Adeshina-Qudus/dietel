package Chapter4;

public class CreditLimitCalculator {

    private int balance;
    private int totalItemCharged;
    private int totalCreditApplied;
    private int newBalance;
    private int allowedCreditLimit;


    public void setAccountNumber(int accountNumber) {

    }
    public void balance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void totalItemCharged(int totalItemCharged) {
        this.totalItemCharged = totalItemCharged;
    }
    public int getTotalItemCharged() {
        return totalItemCharged;
    }
    public void totalCreditApplied(int totalCreditApplied) {
        this.totalCreditApplied = totalCreditApplied;
    }
    public int getTotalCreditApplied() {
        return totalCreditApplied;
    }
    public void allowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }
    public int getAllowedCreditLimit() {
        return 10_000;
    }
    public int getNewBalance() {
        newBalance = balance + totalItemCharged - totalCreditApplied;
        return newBalance;
    }
    public int creditLimitExceeded(){
        if (newBalance > allowedCreditLimit){
            System.out.println( "Credit limit exceeded");
        }
        return allowedCreditLimit;
    }

}
