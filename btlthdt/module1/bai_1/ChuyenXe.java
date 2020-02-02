package btlthdt.module1.bai_1;

public abstract class ChuyenXe {
    private String maSo, hoTenTaiXe, soXe;

    abstract double tinhDoanhThu();

    public ChuyenXe(String maSo, String hoTenTaiXe, String soXe) {
        this.maSo = maSo;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
    }

    public ChuyenXe() {
    }
}
