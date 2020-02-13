package btlthdt.module2.bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanhSachTenSanPhamCungCap {
    List<ChonTenSanPham> DSTenSanPham = new ArrayList<>();

    public ChonTenSanPham chon(int index){
        return DSTenSanPham.get(index);
    }

    public boolean them (NhanVien nhanVien, String tenChon){
        if (DanhSachTenSanPhamDaCo.DSTen.stream().anyMatch(chonTenSanPham -> chonTenSanPham.getTenChon().equals(tenChon)))
            return false;
        return DSTenSanPham.add(new ChonTenSanPham(nhanVien, tenChon));
    }

    //chưa viết phương thức này
    public ChonTenSanPham layTenPhoBien(){
        return new ChonTenSanPham(new NhanVien(),"ten pho bien");
    }
}
