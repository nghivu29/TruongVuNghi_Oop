package btlthdt.module1.bai_6;

import java.time.LocalDate;

public class RoomBill extends Bill {
    private String customerName;
    private double price;
    private int codeOfRoom;

    public RoomBill(long code, LocalDate date, Customer customer, double price, int codeOfRoom) {
        super(code, date);
        this.customerName = customer.getName();
        this.price = price;
        this.codeOfRoom = codeOfRoom;

        customer.addBill(this);
    }


    @Override
    public double calculate() {
        return price;
    }
}
