package lab2.bai1;

import myexceptions.NotNegativeException;

public class Circle extends Ellipse{
    public Circle(double bk) throws NotNegativeException {
        setBkTrucLon(bk);
        setBkTrucNho(bk);
    }

    @Override
    public String toString() {
        return "Hinh " + getClass().getSimpleName() +
                "\nDien tich: " + tinhDienTich() +
                "\nChu vi: " + tinhChuVi();
    }


}
