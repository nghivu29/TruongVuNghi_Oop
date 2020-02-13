package btlthdt.module2.bai1;

import java.util.Random;

public class DanhSachNhanVien extends DanhSachConNguoi<NhanVien> {

    public NhanVien random1NhanVien(){
        return danhSach.get(new Random().nextInt(danhSach.size()-1));
    }


}
