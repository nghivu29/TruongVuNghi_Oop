package btlthdt.module1.bai_5;

import btlthdt.module1.quanlycacgiaodich.Trading;

import java.time.LocalDate;

public class ElectricityBill extends Trading {
    private Customer customer;
    private double kWh;

    public ElectricityBill(int code, LocalDate dayTrading, double price, Customer customer, double kWh) {
        super(code, dayTrading, price);
        this.customer = customer;
        this.kWh = kWh;
    }

    @Override
    public double calculate() {
        return kWh * getPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getkWh() {
        return kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }


}
