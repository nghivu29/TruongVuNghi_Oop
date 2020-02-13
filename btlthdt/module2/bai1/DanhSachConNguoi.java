package btlthdt.module2.bai1;

import java.util.ArrayList;
import java.util.List;

public abstract class DanhSachConNguoi <T extends ConNguoi> {
    protected List<T> danhSach = new ArrayList<>();

    public boolean them(T t){
        return danhSach.add(t);
    }

    public void setDanhSach(List<T> danhSach) {
        this.danhSach = danhSach;
    }
}
