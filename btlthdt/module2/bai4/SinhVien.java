package btlthdt.module2.bai4;

import java.time.LocalDate;

public class SinhVien {
    private long ma;
    private String hoTen;
    private LocalDate ngaySinh;

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s", ma, hoTen, ngaySinh);
    }

    public long getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public SinhVien(long ma, String hoTen, LocalDate ngaySinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }
}
