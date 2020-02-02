package btlthdt.module1.bai_7;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private String nhaCungCap;
    private LocalDate ngaySanXuat, ngayHetHan;

    public HangThucPham(long maHang, String nhaCungCap) throws NgoaiLeSoAm {
        super(maHang);
        this.nhaCungCap = nhaCungCap;
    }

    public HangThucPham(long maHang) throws NgoaiLeSoAm {
        super(maHang);
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(LocalDate.now()))
            this.ngaySanXuat = LocalDate.now();
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isBefore(ngaySanXuat))
            this.ngayHetHan = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    @Override
    public double getVAT() {
        return 0.05;
    }

    public boolean coKhoBan(){
        return getSoLuongTon() > 0 && ngayHetHan.isBefore(LocalDate.now());
    }
}
