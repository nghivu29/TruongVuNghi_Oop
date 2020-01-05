package lab3.bai1;

public class HinhChuNhat extends Hinh {
    private double dai, rong;

    public HinhChuNhat(double dai, double rong) {
        super("hinh chu nhat");
        this.rong = rong;
        this.dai = dai;
    }

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }

    @Override
    public double tinhChuVi() {
        return (dai + rong) * 2;
    }

}
