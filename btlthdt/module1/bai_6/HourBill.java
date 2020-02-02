package btlthdt.module1.bai_6;

import java.time.LocalDate;

public class HourBill extends RoomBill {
    private double hour;

    public HourBill(long code, LocalDate date, Customer nameOfCustomer, double price, int codeOfRoom, double hour) throws Exception{
        super(code, date, nameOfCustomer, price, codeOfRoom);
        if (hour > 30)
            throw new Exception("không đùng loại hóa đơn theo giờ");
        this.hour = hour;
    }

    @Override
    public double calculate() {
        if (hour > 24 && hour <= 30)
            return super.calculate() * 24;
        return super.calculate() * hour;
    }

}
