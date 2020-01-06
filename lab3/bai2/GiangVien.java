package lab3.bai2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiangVien {
    private String hoTen, hocHam, hocVi;
    private LocalDate ngaySinh, ngayBatDau;

    public GiangVien(String hoTen, String hocHam, String hocVi, LocalDate ngaySinh, LocalDate ngayBatDau) {
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngaySinh = ngaySinh;
        this.ngayBatDau = ngayBatDau;
    }

    public abstract double tinhTienLuong(double soGio);

    @Override
    public String toString() {
        return  "Ho ten: " + hoTen + '\n' +
                "Ngay sinh: " + ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + '\n' +
                "Hoc ham: " + hocHam + '\n' +
                "Hoc vi: " + hocVi + '\n' +
                "Ngay bat dau: " + ngayBatDau.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) ;

    }


    public String getHoTen() {
        return hoTen;
    }

    public String getHocHam() {
        return hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }
}
