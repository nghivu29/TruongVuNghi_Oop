package btlthdt.module2.bai1;

public class ChonTenSanPham {
    private NhanVien nhanVien;
    private String tenChon;

    public ChonTenSanPham(NhanVien nhanVien, String tenChon) {
        this.nhanVien = nhanVien;
        this.tenChon = tenChon;
    }

    public String getTenChon() {
        return tenChon;
    }

    public void setTenChon(String tenChon) {
        this.tenChon = tenChon;
    }
}
