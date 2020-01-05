package lab2.bai3;

import java.time.LocalDate;
import java.util.Scanner;

public class Sach extends SanPham{
    private int soTrang;

    public Sach(){}

    public Sach(String ten, String maSP, String moTa, LocalDate ngaySX, double giaBan, int soTrang) {
        super(ten, maSP, moTa, ngaySX, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public void nhapSanPham(Scanner sc) {
        super.nhapSanPham(sc);
        System.out.print("Nhap so trang: ");
        setSoTrang(sc.nextInt());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "soTrang=" + soTrang +
                ", ten='" + getTen() + '\'' +
                ", maSP='" + getMaSP() + '\'' +
                ", moTa='" + getMoTa() + '\'' +
                ", ngaySX=" + getNgaySX() +
                ", giaBan=" + getGiaBan() +
                '}';
    }

    //các phương thức getter và setter

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = Math.abs(soTrang);
    }
}
