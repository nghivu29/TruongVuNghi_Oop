package btlthdt.module1.bai_7;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh; //tháng
    private double congSuat;

    @Override
    protected boolean vanDe() {
        return getSoLuongTon() < 3;
    }

    public HangDienMay(long maHang) throws NgoaiLeSoAm {
        super(maHang);
    }

    public HangDienMay(long maHang, String tenHang, int soLuongTon) throws NgoaiLeSoAm {
        super(maHang, tenHang, soLuongTon);
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
        return vanDe();
    }

    @Override
    public String toString() {
        return String.format("%-20s", "hàng điện máy") + super.toString() + String.format("%-15s%-15s", "BH: "+ thoiGianBaoHanh, "Công suất: "+ congSuat);
    }
}
