package lab3.bai1;

public abstract class Hinh{
    private String ten;

    public Hinh(String ten) {
        this.ten = ten;
    }


    public abstract double tinhDienTich();

    public abstract double tinhChuVi();

    @Override
    public String toString() {
        return getTen() + "\nDien tich: "+ tinhDienTich() + "\nChu vi: "+ tinhChuVi();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}