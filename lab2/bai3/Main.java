package lab2.bai3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SanPham a = new SanPham();
//        a.nhapSanPham(new Scanner(System.in));
//        System.out.println(a.toString());

        Scanner sc = new Scanner(System.in);

        DsSanPham dsSanPham = new DsSanPham();
        dsSanPham.themSanPham(new SanPham("Aaa", "1111", "adaf", LocalDate.of(2019, 10, 1), 20));
        dsSanPham.themSanPham(new SanPham("Bbb", "2222", "adafda", LocalDate.of(2016, 10, 1), 19));
        dsSanPham.themSanPham(new SanPham("CCc", "3333", "adafs", LocalDate.of(2014, 5, 1), 32));
        dsSanPham.themSanPham(new SanPham("ddd", "4444", "adafaa", LocalDate.of(2016, 3, 1), 5));

//        SanPham sp1 = new SanPham();
//        try {
//            sp1.nhapSanPham(sc);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        SanPham sp2 = new Sach();
        try {
            sp2.nhapSanPham(sc);
        }catch (DateTimeParseException e){
            System.out.println(e.getMessage());
        }
        dsSanPham.themSanPham(sp2);
        dsSanPham.hienThi();

    }
}
