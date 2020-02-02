package btlthdt.module1.bai_2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        YeuCau yc = new YeuCau();
        yc.themLoaiSach(new SachThamKhao("1", LocalDate.of(2010, 3, 4), 10, "K", 5), 1);
        yc.themLoaiSach(new SachThamKhao("2", LocalDate.of(2004, 3, 4), 10, "Ha noi", 5), 2);
        yc.themLoaiSach(new SachThamKhao("3", LocalDate.of(2012, 3, 4), 10, "Ha noi", 5), 3);
        yc.themLoaiSach(new SachGiaoKhoa("4", LocalDate.of(2012, 3, 4), 10, "K", TinhTrang.MOI), 5);
        yc.themLoaiSach(new SachGiaoKhoa("5", LocalDate.of(2016, 3, 4), 10, "GD", TinhTrang.CU), 2);
        yc.themLoaiSach(new SachGiaoKhoa("6", LocalDate.of(2019, 3, 4), 10, "K"), 2);

        System.out.println("\nTong thanh tien cua sach giao khoa: "+ yc.tinhTienSGK());
        System.out.println("\ntong thanh tien cua sach tham khoa: "+ yc.tinhTienSTK());

        System.out.println("\nTrung binh cong don gia cua cac sach tham khao: "+ yc.averageSTK());

        //xuất ra các sách giáo khoa của nhà xuất bản K
        System.out.println("\nCac sach giao khoa cua nha xuat ban K: ");
        yc.showSGK("K");

    }
}
