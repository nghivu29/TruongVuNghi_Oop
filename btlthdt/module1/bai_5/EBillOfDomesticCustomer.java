package btlthdt.module1.bai_5;

import java.time.LocalDate;

public class EBillOfDomesticCustomer extends ElectricityBill{
    private double dinhMuc; // định mức

    public EBillOfDomesticCustomer(int code, LocalDate dayTrading, double price, DomesticCustomer domesticCustomer, double kWh, double dinhMuc) {
        super(code, dayTrading, price, domesticCustomer, kWh);
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double calculate() {
        if(getkWh() <= dinhMuc)
            return super.calculate();
        else
            return super.calculate()*dinhMuc - (getkWh()-dinhMuc)*getPrice()*2.5;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
}
