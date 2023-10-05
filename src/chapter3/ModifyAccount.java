package chapter3;

public class ModifyAccount {

        private int withdraw;
        private int balance;

    public void balance(int balance){
            this.balance  = balance ;
        }
        public int getBalance(){
            return balance;
        }

        public void withdraw(int withdraw){
        if(withdraw < balance)
            this.withdraw = balance - withdraw;
        else{
                    System.out.println("withdrawal amount exceeded account balance");
                }
        }
        public int getWithdraw(){
            return balance;
        }
}
