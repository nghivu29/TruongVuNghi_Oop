package lab2.bai2;

public class TamGiacCan extends TamGiac {
    public TamGiacCan(double cachDinh, double cachDay) {
        super(cachDinh, cachDay, cachDay);
    }

    @Override
    public String toString() {
        return "Hinh tam giac can" +
                "\nDien tich = "+ tinhDienTich() +
                "\nTinh chu vi = "+ tinhChuVi();
    }
}
