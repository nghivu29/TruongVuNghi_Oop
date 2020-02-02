package btlthdt.module0.bai6demo;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
        accountNumber = 999999;
        name = "chưa xác định";
        balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) {
        if (accountNumber < 0)
            this.accountNumber = 999999;
        else this.accountNumber = accountNumber;

        if (name.isBlank())
            this.name = "chua xac dinh";
        else this.name = name;

        if (balance < 50000)
            this.balance = 50000;
        this.balance = balance;
    }

    public Account(long accountNumber, String name) {
        this(accountNumber, name, 50000);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //gởi thêm số tiền vào tài khoản
    public boolean deposit(double amount){
        if (amount < 0)
            return false;
        balance += amount;
        return true;
    }

    //rút tiền từ tài khoản
    public boolean withdraw(double amount, double fee){
        if (amount <= 0 && amount+fee > balance)
            return false;
        balance -= amount + fee;
        return true;
    }

    //tính tiền lãi
    public void addInterest(){
        balance += balance*RATE;
    }

    public boolean transfer(Account acc2, double amount){
        if (!this.withdraw(amount, 0))
            return false;
        acc2.deposit(amount);
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", RATE=" + RATE +
                '}';
    }
}
