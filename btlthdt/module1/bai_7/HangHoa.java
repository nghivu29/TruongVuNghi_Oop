package btlthdt.module1.bai_7;

public abstract class HangHoa implements VAT{
    private long maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTon;

    public HangHoa(long maHang, String tenHang, double donGia) throws NgoaiLeSoAm {
        this.maHang = maHang;
        setDonGia(donGia);
        this.donGia = donGia;
    }

    public HangHoa(long maHang) throws NgoaiLeSoAm {
        this(maHang, "xxx", 0);
    }

    public long getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang.isBlank())
            tenHang = "xxx";
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) throws NgoaiLeSoAm{
        if (donGia < 0)
            throw new NgoaiLeSoAm();
        this.donGia = donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) throws NgoaiLeSoAm{
        if (soLuongTon < 0)
            throw new NgoaiLeSoAm();
        this.soLuongTon = soLuongTon;
    }
}
