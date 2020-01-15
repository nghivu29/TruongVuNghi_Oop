package btlthdt.bai_2;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
    private Thue thue;

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, String nhaXuatBan, double thuePhaiNop) {
        super(maSach, ngayNhap, donGia, nhaXuatBan);
        this.thue = new Thue(thuePhaiNop);
    }

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, String nhaXuatBan) {
        super(maSach, ngayNhap, donGia, nhaXuatBan);
    }

    public Thue getThue() {
        return thue;
    }

    public void setThue(Thue thue) {
        this.thue = thue;
    }

    @Override
    public double tinhTien() {
        return getDonGia() + thue.getThuePhaiNop();
    }

    @Override
    public String toString() {
        return "SachThamKhao{" + super.toString() +
                ", thue=" + thue +
                '}';
    }
}
