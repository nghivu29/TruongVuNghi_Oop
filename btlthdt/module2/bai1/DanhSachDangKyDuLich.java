package btlthdt.module2.bai1;

import java.util.ArrayList;
import java.util.List;

public class DanhSachDangKyDuLich {
    private DanhSachNhanVien DSDangKy;
    private DanhSachNhanVien DSLoai;
    private DanhSachNhanVien DSChot;
    private int luongDi;

    public void chotDanhSach(int soLuong){
        luongDi = soLuong;
        DSChot.danhSach = DSDangKy.danhSach.subList(0, soLuong-1);
        DSLoai.danhSach = DSDangKy.danhSach.subList(luongDi, DSDangKy.danhSach.size()-1);
    }

    public boolean themNhanVienDangKy(NhanVien nhanVien){
        return DSDangKy.them(nhanVien);
    }

    public boolean huyDangKy(NhanVien nhanVien){
        boolean b1 = DSDangKy.danhSach.remove(nhanVien);
        boolean b2 = DSLoai.danhSach.remove(nhanVien);
        boolean b3 = DSChot.danhSach.remove(nhanVien);

        for (int i = 0; DSChot.danhSach.size() < luongDi; i++)
            DSChot.them(DSLoai.danhSach.get(i));

        return b1 || b2 || b3;
    }

}
