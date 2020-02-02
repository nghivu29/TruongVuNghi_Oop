package btlthdt.module0.bai6;
import myexceptions.*;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    final private double RATE = 0.035;

    public Account(){
        accountNumber = 999999;
        balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) throws myExceptions{
        this(accountNumber, name);

        if (balance < 50)
            throw new myExceptions("so du it nhat la 50");
        this.balance = balance;
    }

    public Account(long accountNumber, String name) throws myExceptions{
        if (accountNumber < 0)
            throw new myExceptions("so tai khooang < 0 khong hop le.");

        if (name.trim().compareTo("") == 0)
            throw new myExceptions("ten tai khoang rong");

        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            balance += amount;
            return true;
        }else return false;
    }

    public boolean withdraw(double amount, double fee){
        if (amount > 0 && amount + fee <= balance){
            balance -= amount - fee;
            return true;
        }else return false;
    }

    public double addInterest(){
        balance  += balance * RATE;
        return balance;
    }

    public boolean tranfer(Account acc2, double amount) throws myExceptions {
        if (amount > 0 && acc2.getBalance() > amount) {
            this.deposit(amount);
            acc2.withdraw(amount, 0);
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

        return "Account Number: " + accountNumber + '\n' +
                "Name: " + name + '\n' +
                "Balance: " + formatter.format(balance) + '\n';
    }

    public static void main(String[] args) {

    }
}
