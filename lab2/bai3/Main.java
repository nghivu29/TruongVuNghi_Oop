package lab2.bai3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Thêm sản phẩm.\n" +
                "2.Xoá sản phẩm, các phương thức cho phép truyền vào đối tượng sản phẩm hoặc chỉ là mã sản phẩm để xoá. \n" +
                "3.Cập nhật sản phẩm tên sản phẩm, mô tả sản phẩm hoặc giá sản phẩm dựa trên mã sản phẩm. \n" +
                "4.Tìm kiếm sản phẩm theo mã sản phẩm, tên sản phẩm hoặc khoảng giá bán.\n" +
                "5.Sắp xếp các sản phẩm giảm dần theo giá.\n" +
                "6.Xem danh sách sản phẩm.\n" +
                "7.Thoát.");
        DsSanPham list = new DsSanPham();



        while (true) {
            System.out.print("Bạn chọn: ");

            switch (sc.nextInt()) {
                case 1:
                    list = case1();
                    System.out.println("đã thêm mặc định");
                    break;

                case 2://xóa sách 3 theo mã
                    list.xoaSanPham("3");
                    System.out.println("đã xóa /'sach3/'");
                    break;

                case 3://cập nhập cho sách 1
                    System.out.println("cập nhật cho sách 1");
                    list.capNhapSanPham("1", "sach1 cap nhap", "new", 10);
                    break;

                case 4:
                    System.out.println("kết quả tìm kiếm theo mã \"1\": " + list.timKiem("1"));
                    System.out.println("kết quả tìm kiếm theo tên \"sach2\": " + list.timKiemTen("sach2"));
                    System.out.println("kết quả tìm kiếm theo khoảng giá từ 20 đến 40 : " + list.timKiem(20, 40));
                    break;

                case 5:
                    list.sapXep();
                    System.out.println("đã sắp xếp");
                    break;

                case 6:
                    System.out.println("danh sách hiện có: ");
                    list.hienThi();
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }

    //tạo sẳn 4 sản phẩm
    static DsSanPham case1(){
        DsSanPham list = new DsSanPham();
        list.themSanPham(new Sach("sach1", "1", "1", LocalDate.now(), 10, 10));
        list.themSanPham(new Sach("sach2", "2", "2", LocalDate.now(), 10, 1));
        list.themSanPham(new Sach("sach3", "3", "3", LocalDate.now(), 10, 100));
        list.themSanPham(new BangDia("dia1", "4", "4", LocalDate.now(), 10));
        list.themSanPham(new BangDia("dia2", "5", "5", LocalDate.now(), 20));
        list.themSanPham(new BangDia("dia3", "6", "6", LocalDate.now(), 30));
        return list;
    }
}
