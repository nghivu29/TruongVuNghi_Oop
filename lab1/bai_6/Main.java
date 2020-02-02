package lab1.bai_6;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, NgoaiLeDiem {

        /*Phần kiểm tra nhập xuất*/
//        HocVien kiemTraNhapXuat = new HocVien();
//
//        Scanner sc = new Scanner(System.in);
//        kiemTraNhapXuat.nhapThongTin(sc);
//        kiemTraNhapXuat.nhapDiem(sc);
//        kiemTraNhapXuat.hienThi();

        /*thêm những thông tin cơ bản vào danh sách quản lý (không bao gồm điểm số)*/
        QLHocVien quanLy = new QLHocVien();
        quanLy.themHocVien(new HocVien("Aaa", new Date(), GioiTinh.NAM));
        quanLy.themHocVien(new HocVien("Bbb", new Date(), GioiTinh.NU));
        quanLy.themHocVien(new HocVien("Ccc", new Date(), GioiTinh.NU));
        quanLy.hienThi();
        System.out.println();

//        /*thêm vào thông tin điểm số ( 0 < điểm < 10 )*/
//        quanLy.nhapDiem();
//        System.out.println();
//        //hiển thị lại sau khi nhập điểm
//        quanLy.hienThi();
//        System.out.println();

//        /*Lấy danh sách học bổng và hiển thị lại*/
//        quanLy.layDSHocBong().hienThi();
//        System.out.println();

//        /*tìm kiểm theo tên*/
//        quanLy.timKiem("c").hienThi();
//        System.out.println();

//        /*Xắp xếp ds theo điểm*/
//        quanLy.sapXep();
//        quanLy.hienThi();

    }
}
