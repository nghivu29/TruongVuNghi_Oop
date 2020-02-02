package btlthdt.module0.bai9;
import myexceptions.*;

public class CongNhan {
    private long maCN;
    private String mHo, mTen;
    private int mSoSanPham;

    //cac phuong thuc khoi tao

    public long getMaCN() {
        return maCN;
    }

    public void setMaCN(long maCN) {
        this.maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSanPham() {
        return mSoSanPham;
    }

    public void setmSoSanPham(int mSoSanPham) throws myExceptions {
        if (mSoSanPham <= 0)
            throw new myExceptions("soSanPham > 0");
        this.mSoSanPham = mSoSanPham;
    }

    public CongNhan() {
    }

    public CongNhan(long maCN, String mHo, String mTen, int mSoSanPham) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;

        try {
            setmSoSanPham(mSoSanPham);
        }catch (myExceptions e){
            e.getMassage();
        }
    }

    public double tinhLuong(){
        if (mSoSanPham < 200)
            return mSoSanPham * 0.5;
        else if (mSoSanPham < 400)
            return mSoSanPham * 0.55;
        else if (mSoSanPham < 600)
            return mSoSanPham * 0.6;
        else return mSoSanPham *0.65;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "maCN=" + maCN +
                ", mHo='" + mHo + '\'' +
                ", mTen='" + mTen + '\'' +
                ", mSoSanPham=" + mSoSanPham +
                '}';
    }
}
