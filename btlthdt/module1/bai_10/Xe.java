package btlthdt.module1.bai_10;

public abstract class Xe {
    private String tenXe;
    private String moTa;
    private double gia;

    public Xe(String tenXe, double gia) {
        this.tenXe = tenXe;
        this.gia = gia;
    }

    public String getTenXe() {
        return tenXe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


}
