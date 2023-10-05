package classwork;

public class Account {

    private int balance ;

    public void deposit (int deposit){
        balance = balance + deposit ;

    }
    public int deposit() {

        return balance ;
    }

    public void balance (int balance){

    }

    public int balance () {

        return balance ;
    }
    public void withdraw(int withdraw) {

                balance = balance - withdraw ;
    }
    public int withdraw() {

        return balance ;
    }
    public int checkBalance(){
        return balance ;
    }
}

