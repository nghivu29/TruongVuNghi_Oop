package lab3.bai2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        QLGiangVien ql = new QLGiangVien();
        GiangVien gv1 = new GVCoHuu("A", "", "", LocalDate.EPOCH, LocalDate.EPOCH, 2, 3);
        GiangVien gv2 = new GVThinhGiang("B", "", "", LocalDate.EPOCH, LocalDate.EPOCH, "");
        GiangVien gv3 = new GVCoHuu("C", "", "", LocalDate.EPOCH, LocalDate.EPOCH, 6, 3);
        GiangVien gv4 = new GVThinhGiang("D", "", "", LocalDate.EPOCH, LocalDate.EPOCH, "");
        GiangVien gv5 = new GVThinhGiang("E", "", "", LocalDate.EPOCH, LocalDate.EPOCH, "");
        GiangVien gv6 = new GVCoHuu("F", "", "", LocalDate.EPOCH, LocalDate.EPOCH, 4, 3);
        GiangVien gv7 = new GVCoHuu("G", "null", "null", LocalDate.EPOCH, LocalDate.EPOCH, 20, 3);


        /*thêm giảng viên*/
        ql.them(gv1);
        ql.them(gv2);
        ql.them(gv3);
        ql.them(gv4);
        ql.them(gv5);
        ql.them(gv6);
        ql.them(gv7);
        System.out.println("...đã thêm mặc định 7 giảng viên...");

        /*xóa giảng viên*/
        ql.xoa(gv1);
        System.out.println("...đã xóa gv1...");

        /*Hiển thị ds*/ ql.hienThi();

        /*Tra cứu thông tin*/
        System.out.println("Kết quả tra theo từ khóa \"G\": "+ ql.traCuu("G"));

        /*Thực hiện phương thức tính tiền lương*/
        System.out.println("\n\n\n\n...Bắt đầu thực hiện phương thức tính tiền lương...");
        ql.tinhTienLuong();
    }
}
