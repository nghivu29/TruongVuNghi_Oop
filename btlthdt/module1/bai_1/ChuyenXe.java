package btlthdt.module1.bai_1;

public abstract class ChuyenXe {
    private String maSo, hoTenTaiXe, soXe;

    abstract double tinhDoanhThu();

    public ChuyenXe(String maSo, String hoTenTaiXe, String soXe) {
        this.maSo = maSo;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
    }

    public ChuyenXe(String maSo) {
        this.maSo = maSo;
    }



    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }
}
