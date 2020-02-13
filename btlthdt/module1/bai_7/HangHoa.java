package btlthdt.module1.bai_7;

public abstract class HangHoa implements VAT{
    private long maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTon;

    abstract protected boolean vanDe();

    public HangHoa(long maHang, String tenHang, double donGia, int soLuongTon) throws NgoaiLeSoAm {
        this.maHang = maHang;
        setDonGia(donGia);
        setTenHang(tenHang);
    }

    public HangHoa(long maHang) throws NgoaiLeSoAm {
        this(maHang, "xxx", 0);
    }

    //constructor sử dụng để test cho nhanh
    public HangHoa(long maHang, String tenHang, int soLuongTon) throws NgoaiLeSoAm {
        this.maHang = maHang;
        setTenHang(tenHang);
        setSoLuongTon(soLuongTon);
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

    @Override
    public String toString() {
        return String.format("%-15d%-15s%-15.2f%-15d", maHang, tenHang, donGia, soLuongTon);
    }
}
