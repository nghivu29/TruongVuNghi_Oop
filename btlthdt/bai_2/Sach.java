package btlthdt.bai_2;

import java.time.LocalDate;

public class Sach implements ThanhTien{
    private String maSach = "S";
    private LocalDate ngayNhap;
    private double donGia;
    private String nhaXuatBan;

    public Sach(String maSach, LocalDate ngayNhap, double donGia, String nhaXuatBan) {
        this.maSach += maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
    }



    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public double tinhTien() {
        return donGia;
    }

    @Override
    public String toString() {
        return  "maSach='" + maSach + '\'' +
                ", ngayNhap=" + ngayNhap +
                ", donGia=" + donGia +
                ", nhaXuatBan='" + nhaXuatBan + '\'' ;

    }
}
