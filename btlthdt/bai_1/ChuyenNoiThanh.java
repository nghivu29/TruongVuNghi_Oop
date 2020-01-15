package btlthdt.bai_1;

public class ChuyenNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKmDi;

    @Override
    double tinhDoanhThu() {
        //tinh doanh thu cua chuyen ngoai thanh
        return 1;
    }

    public ChuyenNoiThanh(String maSo, String hoTenTaiXe, String soXe, int soTuyen, double soKmDi) {
        super(maSo, hoTenTaiXe, soXe);
        this.soTuyen = soTuyen;
        this.soKmDi = soKmDi;
    }

    public ChuyenNoiThanh() {
    }
}
