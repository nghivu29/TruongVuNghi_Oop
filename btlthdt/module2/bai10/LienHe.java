package btlthdt.module2.bai10;

import java.util.List;

public class LienHe {
    private String diaChi;
    private List<Long> dsSoDienThoai;

    public LienHe(String diaChi, List<Long> dsSoDienThoai) {
        this.diaChi = diaChi;
        this.dsSoDienThoai = dsSoDienThoai;
    }

    public LienHe(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean themSoDienThoai(long soDienThoai){
        if (dsSoDienThoai.contains(soDienThoai))
            return false;
        return dsSoDienThoai.add(soDienThoai);
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<Long> getDsSoDienThoai() {
        return dsSoDienThoai;
    }

    public void setDsSoDienThoai(List<Long> dsSoDienThoai) {
        this.dsSoDienThoai = dsSoDienThoai;
    }
}
