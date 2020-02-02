package btlthdt.module1.bai_3;

import java.time.LocalDate;

public class MoneyTrading extends Trading{
    private double exchangeRate;
    private MoneyType moneyType;

    public MoneyTrading(int code, LocalDate dayTrading, double price, double exchangeRate, MoneyType moneyType) {
        super(code, dayTrading, price);
        this.exchangeRate = exchangeRate;
        this.moneyType = moneyType;
    }

    @Override
    public double calculate() {
        if (moneyType.equals(MoneyType.VN))
            return getPrice();
        return getPrice() * exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    @Override
    public String toString() {
        return "MoneyTrading{"+ super.toString() +'}';
    }
}

enum MoneyType{
    VN("Viet Nam dong"), USD("do la My"), EUR("Euro");

    private MoneyType(String euro) {
    }
}
