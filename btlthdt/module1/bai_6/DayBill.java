package btlthdt.module1.bai_6;

import java.time.LocalDate;

public class DayBill extends RoomBill {
    private int day;

    public DayBill(long code, LocalDate date, Customer customer, double price, int codeOfRoom, int day) {
        super(code, date, customer, price, codeOfRoom);
        this.day = day;
    }

    @Override
    public double calculate() {
        if (day > 7)
            return super.calculate() * ( 7 + (day - 7)*0.8);
        return super.calculate() * day;
    }
}
