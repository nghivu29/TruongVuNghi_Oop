package lab2.bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SanPham {
    private String ten, maSP, moTa;
    private LocalDate ngaySX;
    private double giaBan;

    public SanPham() {
    }

    public SanPham(String ten, String maSP, String moTa, LocalDate ngaySX, double giaBan) {
        setTen(ten);
        setMaSP(maSP);
        setMoTa(moTa);
        this.ngaySX = ngaySX;
        setGiaBan(giaBan);
    }

    public void nhapSanPham(Scanner sc) {
        System.out.print("Nhap ma san pham: ");
        setMaSP(sc.nextLine());
        System.out.print("Nhap ten san pham: ");
        setTen(sc.nextLine());
        System.out.print("Nhap mo ta san pham: ");
        setMoTa(sc.nextLine());
        System.out.print("Nhap ngay san xuat: ");

        try {
            try {
                ngaySX = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("input: dd/MM/yyyy", "your input", 1);
            }
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Nhap gia ban: ");
        giaBan = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ten='" + ten + '\'' +
                ", maSP='" + maSP + '\'' +
                ", moTa='" + moTa + '\'' +
                ", ngaySX=" + ngaySX +
                ", giaBan=" + giaBan +
                '}';
    }

    //các phương thức getter và setter

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten.trim();
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP.trim();
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public LocalDate getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(LocalDate ngaySX) {
        this.ngaySX = ngaySX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = Math.abs(giaBan);
    }
}
