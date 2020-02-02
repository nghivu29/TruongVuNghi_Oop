package btlthdt.module1.bai_12;

public class Account {
    private double balance;
    private String acct_id;

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    //rút tiền từ tài khoảng
    public boolean withraw(double amount){
        if (amount > balance)
            return false;
        balance -= amount;
        return true;
    }


    public void deposit(){

    }
}
