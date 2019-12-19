package bai6;

public class Account {
    private long accountNumber;
    String name;
    double balance;
    final double RATE = 0.035;

    public Account(){}

    public Account(long accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }


}
