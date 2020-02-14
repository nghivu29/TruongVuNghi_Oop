package btlthdt.module2.bai10;

import java.util.ArrayList;
import java.util.List;

public class DanhBa {
    private List<LienHe> list = new ArrayList<>();

    public boolean themLienHe(LienHe lienHe){
        if (list.contains(lienHe))
            return false;
        return list.add(lienHe);
    }

    public LienHe traCuu(String diaChi){
        return list.stream().filter(lienHe -> lienHe.getDiaChi().equals(diaChi)).findFirst().get();
    }

    public LienHe traCuu(long soDienThoai){
        return list.stream().filter(lienHe -> lienHe.getDsSoDienThoai().contains(soDienThoai)).findFirst().get();
    }
}
