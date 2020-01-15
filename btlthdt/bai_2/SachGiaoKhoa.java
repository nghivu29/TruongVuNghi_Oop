package btlthdt.bai_2;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
    //mặc định tình trạng là mới
    private TinhTrang tinhTrang = TinhTrang.MOI;

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, String nhaXuatBan, TinhTrang tinhTrang) {
        super(maSach, ngayNhap, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, String nhaXuatBan) {
        super(maSach, ngayNhap, donGia, nhaXuatBan);
    }

    public TinhTrang getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(TinhTrang tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    //tính giá thật được bán củ một cuốn sách giáo khoa
    @Override
    public double tinhTien() {
        if (tinhTrang == TinhTrang.CU)
            return getDonGia() / 2;
        return getDonGia();
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" + super.toString() +
                ", tinhTrang=" + tinhTrang +
                '}';
    }
}
