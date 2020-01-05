package lab2.bai3;

import java.time.LocalDate;
import java.util.Scanner;

public class BangDia extends SanPham {
    private float thoiGianPhat; //đơn vị phút

    public BangDia() {
    }

    public BangDia(String ten, String maSP, String moTa, LocalDate ngaySX, double giaBan) {
        super(ten, maSP, moTa, ngaySX, giaBan);
    }

    @Override
    public void nhapSanPham(Scanner sc) {
        super.nhapSanPham(sc);
        System.out.print("Nhap thoi gian phat: ");
        setThoiGianPhat(sc.nextFloat());
    }



    //các phương thức getter và setter

    public float getThoiGianPhat() {
        return thoiGianPhat;
    }

    @Override
    public String toString() {
        return "BangDia{" +
                "thoiGianPhat=" + thoiGianPhat +
                ", ten='" + getTen() + '\'' +
                ", maSP='" + getMaSP() + '\'' +
                ", moTa='" + getMaSP() + '\'' +
                ", ngaySX=" + getNgaySX() +
                ", giaBan=" + getGiaBan() +
                '}';
    }

    public void setThoiGianPhat(float thoiGianPhat) {
        this.thoiGianPhat = Math.abs(thoiGianPhat);
    }
}
