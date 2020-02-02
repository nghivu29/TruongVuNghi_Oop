package btlthdt.module1.bai_7;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;


    public HangSanhSu(long maHang) throws NgoaiLeSoAm {
        super(maHang);
    }

    public HangSanhSu(long maHang, String nhaSanXuat) throws NgoaiLeSoAm {
        super(maHang);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        if (ngayNhapKho.isAfter(LocalDate.now()))
            ngayNhapKho = LocalDate.now();
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double getVAT() {
        return 0.1;
    }

    public boolean coBanCham(){
        return getSoLuongTon() > 50 && ngayNhapKho.plusDays(10).isAfter(LocalDate.now());
    }

}
