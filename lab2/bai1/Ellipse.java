package lab2.bai1;
import static java.lang.Math.*;
import myexceptions.NotNegativeException;

public class Ellipse {
    private double bkTrucLon, bkTrucNho;

    public double tinhDienTich(){
        return PI * bkTrucLon * bkTrucNho;
    }

    public double tinhChuVi(){
        return 2 * PI * sqrt((pow(bkTrucLon, 2) * pow(bkTrucNho, 2)) / 2);
    }

    @Override
    public String toString() {
        return "Hinh " + getClass().getSimpleName() +
                "\nDien tich: " + tinhDienTich() +
                "\nChu vi: " + tinhChuVi();
    }

    //getter va setter

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) throws NotNegativeException {
        if (bkTrucLon < 0)
            throw new NotNegativeException();
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) throws NotNegativeException {
        if (bkTrucNho < 0)
            throw new NotNegativeException();
        this.bkTrucNho = bkTrucNho;
    }

    public Ellipse(double bkTrucLon, double bkTrucNho) throws NotNegativeException {
        setBkTrucLon(bkTrucLon);
        setBkTrucNho(bkTrucNho);
    }

    public Ellipse() {
    }
}
