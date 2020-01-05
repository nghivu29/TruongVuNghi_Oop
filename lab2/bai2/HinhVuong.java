package lab2.bai2;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh){
        super(canh, canh);
    }

    @Override
    public String toString() {
        return "Hinh vuong"+
                "\nDien tich: " + tinhDienTich() +
                "\nChu vi: " + tinhChuVi();
    }
}
