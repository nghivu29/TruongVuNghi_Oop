package btlthdt.module1.bai_1;

public class ChuyenNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDi;

    @Override
    double tinhDoanhThu() {
        //tinh doanh thu cua chuyen noi thanh
        return 1;
    }

    public ChuyenNgoaiThanh(String maSo, String hoTenTaiXe, String soXe, String noiDen, int soNgayDi) {
        super(maSo, hoTenTaiXe, soXe);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public ChuyenNgoaiThanh() {
    }
}
