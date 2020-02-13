package btlthdt.module0.bai5;
import myexceptions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {

    private String maHang = "000", tenHang = "xxx";
    private float donGia;
    private LocalDate ngaySanXuat = LocalDate.now(), ngayHetHan = ngaySanXuat;

    public HangThucPham(String maHang) throws myExceptions {
        setMaHang(maHang);
    }

    //nhap ngay ngan cac nhau boi dau '/' vd: 1/1/2019
    public HangThucPham(String maHang, String tenHang, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws myExceptions {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    private void setMaHang(String maHang) throws myExceptions {
        if (maHang.trim().compareTo("") == 0)
            throw new myExceptions("Ma hang khong duoc rong");
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) throws myExceptions {
        if (tenHang.trim().compareTo("") == 0)
            throw new myExceptions("Ten hang khong duoc rong");
        this.tenHang = tenHang;
    }

    public void setDonGia(float donGia) throws myExceptions {
        if (donGia < 0)
            throw new myExceptions("gia tien phai >= 0");
        this.donGia = donGia;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(LocalDate.now()))
            this.ngaySanXuat = ngaySanXuat;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isBefore(ngaySanXuat))
            ngayHetHan = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }


    public boolean coHetHan(){
        if (ngayHetHan.isBefore(LocalDate.now()))
            return true;
        return false;
    }

    @Override
    public String toString() {
        String ghiChu = coHetHan() ? "Hang het han" : "";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-15s%-15s%-15.2f%-15s%-15s%-30s", maHang, tenHang, donGia, f.format(ngaySanXuat), f.format(ngayHetHan), ghiChu);
    }
}
