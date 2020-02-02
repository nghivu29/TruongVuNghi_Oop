package btlthdt.module1.bai_4;

import java.time.LocalDate;

public class EstateTrading extends Trading {
    private double area;

    public EstateTrading(int code, LocalDate dayTrading, double price, double area) {
        super(code, dayTrading, price);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calculate() {
        return getPrice() * area;
    }
}
