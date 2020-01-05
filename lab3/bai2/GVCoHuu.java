package lab3.bai2;

import java.time.LocalDate;

public class GVCoHuu extends GiangVien {
    private double luongCb;
    private float heSo;

    public GVCoHuu(String hoTen, String hocHam, String hocVi, LocalDate ngaySinh, LocalDate ngayBatDau, double luongCb, float heSo) {
        super(hoTen, hocHam, hocVi, ngaySinh, ngayBatDau);
        this.luongCb = luongCb;
        this.heSo = heSo;
    }

    @Override
    public double tinhTienLuong(double soGio) {
        return 0;
    }

    @Override
    public String toString() {
        return "GVCoHuu{" +
                "luongCb=" + luongCb +
                ", heSo=" + heSo +
                '}';
    }
}
