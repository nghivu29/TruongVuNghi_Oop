package lab3.bai1;
import static java.lang.Math.*;

public class TamGiac extends Hinh{
    private double a, b, c;

    public TamGiac(double a, double b, double c){
        super("tam giac");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhDienTich() {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }
}
