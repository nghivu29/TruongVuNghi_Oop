package lab2.bai2;

public class HinhChuNhat {
    private double dai, rong;

    public double tinhChuVi() {
        return (dai + rong) * 2;
    }

    public double tinhDienTich() {
        return dai * rong;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat"+
                "\nDien tich: " + tinhDienTich() +
                "\nChu vi: " + tinhChuVi();
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public HinhChuNhat(double dai, double rong) {
        setDai(dai);
        setRong(rong);
    }
}
