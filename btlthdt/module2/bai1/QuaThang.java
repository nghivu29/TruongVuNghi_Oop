package btlthdt.module2.bai1;

import java.time.YearMonth;

public class QuaThang {
    private YearMonth thangNhanQua = YearMonth.now();
    private NhanVien nhanVienNhanQua;
    private Qua qua;

    public QuaThang(YearMonth namThangNhanQua){
        thangNhanQua = namThangNhanQua;
    }

    public QuaThang(){}

    public NhanVien chonNguoiNhan(DanhSachNhanVien danhSachNhanVien){
        return danhSachNhanVien.random1NhanVien();
    }
}

class Qua{
    private String ten;
    private String mota;
}