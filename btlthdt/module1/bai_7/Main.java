package btlthdt.module1.bai_7;

public class Main {
    public static void main(String[] args) throws NgoaiLeSoAm {
        System.out.println("-Khởi tạo danh sách n phần tử.(n = 3)");
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa(3);

        System.out.println("\n-Thêm hàng hóa vào danh sách (thêm thành công nếu không bị trùng mã hàng).");
        System.out.println("Thêm hàng hóa 1: "+ danhSachHangHoa.them(new HangDienMay(1, "d", 4)));
        System.out.println("Thêm hàng hóa trùng mã hàng 1: "+ danhSachHangHoa.them(new HangSanhSu(1)));
        System.out.println("Thêm hàng hóa 2: "+ danhSachHangHoa.them(new HangThucPham(2, "a", 3)));
        System.out.println("Thêm hàng hóa 3: "+ danhSachHangHoa.them(new HangSanhSu(3, "f", 1)));
        System.out.println("Thêm hàng hóa thứ 4 vượt quá n: "+ danhSachHangHoa.them(new HangThucPham(4)));

        System.out.println("\n-In toàn bộ danh sách: ");
        danhSachHangHoa.inToanBo();

        System.out.println("\n-In từng loại hàng hóa. (vd: loại hàng sành sứ)");
        danhSachHangHoa.inDSHangSanhSu();

        System.out.println("\n-Tìm kiếm hàng hóa khi biết mã hàng (trả về hàng hóa tìm thấy). (vd maHang = 2)");
        System.out.println("Kết quả tìm kiếm:\n "+ danhSachHangHoa.timKiem(2));

        System.out.println("\n-Sắp xếp hàng hóa theo tên hàng tăng dần.");
        danhSachHangHoa.sapXepTheoTen();
        System.out.println("Hiển thị lại danh sách:");
        danhSachHangHoa.inToanBo();

        System.out.println("\n-Sắp xếp hàng hóa theo số lượng tồn kho giảm dần dần.");
        danhSachHangHoa.sapXepTheoLuongTon();
        System.out.println("Hiển thị lại danh sách:");
        danhSachHangHoa.inToanBo();

        System.out.println("\n-Xuất các hàng thực phẩm khó bán");
        danhSachHangHoa.hangThucPhamKhoBan().inToanBo();

        System.out.println("\n-Xóa hàng hóa khi biết mã hàng: (vd: mã hàng = 2)");
        danhSachHangHoa.xoa(2);

        System.out.println("\n-Sửa thông tin đơn giá của hàng hóa khi biết mã hàng.(vd: mã hàng = 1)");
        danhSachHangHoa.capNhap(1, 123);

        System.out.println("\n#Xuất lại thông tin sau khi cập nhập: ");
        danhSachHangHoa.inToanBo();
    }
}
