package bai_6;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException, NgoaiLeDiem {
//        HocVien a = new HocVien();
//
//        Scanner sc = new Scanner(System.in);
//        a.nhapThongTin(sc);
//        a.nhapDiem(sc);
//        a.hienThi();

        QLHocVien quanLy = new QLHocVien();
        quanLy.themHocVien(new HocVien("Aaa", new Date(), GioiTinh.NAM));
        quanLy.themHocVien(new HocVien("Bbb", new Date(), GioiTinh.NU));
        quanLy.themHocVien(new HocVien("Ccc", new Date(), GioiTinh.NU));

        quanLy.hienThi();

        System.out.println();

        quanLy.nhapDiem();
        System.out.println();
//
//        quanLy.hienThi();
//        System.out.println();
//
//        quanLy.layDSHocBong().hienThi();
//        System.out.println();
//
//        quanLy.timKiem("c").hienThi();
//        System.out.println();

        quanLy.sapXep();
        quanLy.hienThi();

//        quanLy.xoaHocVien();
    }
}
