package btlthdt.module1.bai_5;

import java.time.LocalDate;

public class EBillOfForeignCustomer extends ElectricityBill{

    public EBillOfForeignCustomer(int code, LocalDate dayTrading, double price, ForeignCustomer foreignCustomer, double kWh) {
        super(code, dayTrading, price, foreignCustomer, kWh);
    }


    @Override
    public double calculate() {
        return super.calculate();
    }
}
