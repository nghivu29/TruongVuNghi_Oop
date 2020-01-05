package lab3.bai1;
import static java.lang.Math.*;

public class Ellipse extends Hinh {
    private double trucLon, trucNho;


    public Ellipse(double lon, double nho){
        super("e-lip");
        trucLon = lon;
        trucNho = nho;
    }

    @Override
    public double tinhChuVi() {
        return 2 * PI * sqrt( (pow(trucLon, 2) + pow(trucNho, 2)) / 2 );
    }

    @Override
    public double tinhDienTich() {
        return PI * trucNho * trucLon;
    }
}
