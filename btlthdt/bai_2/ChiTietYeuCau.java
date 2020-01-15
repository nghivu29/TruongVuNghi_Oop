package btlthdt.bai_2;

public class ChiTietYeuCau implements ThanhTien {
    private int soLuong;
    private Sach sach;

    public ChiTietYeuCau(Sach sach, int soLuong) {
        this.soLuong = soLuong;
        this.sach = sach;
    }

    //tính tổng thành tiền cho từng loại
    @Override
    public double tinhTien() {
        return soLuong * sach.tinhTien();
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    @Override
    public String toString() {
        return sach.toString();
    }
}
