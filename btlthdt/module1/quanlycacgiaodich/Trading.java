package btlthdt.module1.quanlycacgiaodich;

import java.time.LocalDate;

public abstract class Trading implements IntoMoney {
    private int code;
    private LocalDate dayTrading;
    private double price;

    public Trading(int code, LocalDate dayTrading, double price) {
        this.code = code;
        this.dayTrading = dayTrading;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public void setDayTrading(LocalDate dayTrading) {
        this.dayTrading = dayTrading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "code=" + code;
    }


}
