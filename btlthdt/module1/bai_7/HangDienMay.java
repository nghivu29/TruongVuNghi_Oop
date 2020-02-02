package btlthdt.module1.bai_7;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh; //tháng
    private double congSuat;

    public HangDienMay(long maHang) throws NgoaiLeSoAm {
        super(maHang);
    }

    public HangDienMay(long maHang, int thoiGianBaoHanh, double congSuat) throws NgoaiLeSoAm {
        super(maHang);
        setThoiGianBaoHanh(thoiGianBaoHanh);
        setCongSuat(congSuat);
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) throws NgoaiLeSoAm{
        if (thoiGianBaoHanh < 0)
            throw new NgoaiLeSoAm();
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) throws NgoaiLeSoAm{
        if (congSuat < 0)
            throw new NgoaiLeSoAm();
        this.congSuat = congSuat;
    }

    @Override
    public double getVAT() {
        return 0.1;
    }

    public boolean coBanDuoc(){
        return getSoLuongTon() < 3;
    }
}
