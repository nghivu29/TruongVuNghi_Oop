package btlthdt.module1.bai_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QLChuyenXe {
    private List<ChuyenXe> list;
    {
        list = new ArrayList<>();
    }

    public boolean add(ChuyenXe chuyenXe){
        return list.add(chuyenXe);
    }

    public boolean remove(String maSo){return false;}

    public double tinhTongDoanThu(){
        double tong = 0;
        Iterator<ChuyenXe> it = list.iterator();
        while (it.hasNext()){
            tong += it.next().tinhDoanhThu();
        }
        return tong;
    }

    public List<ChuyenXe> getList() {
        return list;
    }
}
