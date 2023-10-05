package chapter3;

public class ModifyAccountTest {

        public static void main(String[] args){

            ModifyAccount account = new ModifyAccount();

            account.balance(5000);
            account.withdraw(7000);


                    System.out.println(account.getWithdraw());

    }


}
