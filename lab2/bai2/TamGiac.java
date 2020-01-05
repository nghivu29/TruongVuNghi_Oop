package lab2.bai2;

public class TamGiac {
    private double a, b, c;

    public double tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = (a+b+c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    public TamGiac(double a, double b, double c){
        if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a)
            return;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Hinh tam giac " +
                "\nDien tich = "+ tinhDienTich() +
                "\nTinh chu vi = "+ tinhDienTich();

    }
}
