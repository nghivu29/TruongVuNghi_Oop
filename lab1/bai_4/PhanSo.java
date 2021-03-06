package lab1.bai_4;

public class PhanSo {
    private int tu, mau;

    private static int UCLN(int a, int b){
        while (a != b){
            if (a > b) a -= b;
            else b -= a;
        }

        return a;
    }

    //phương thức khởi tạo với ngoại lệ mẫu khác không
    public PhanSo(int tu, int mau)  {
        setTu(tu);
        try {
            setMau(mau);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //phương thức khởi tạo không tham số
    public PhanSo(){
        tu = 0;
        mau = 1;
    }

    public PhanSo rutGon(){
        if (tu == 0) return this;

        int UCLN = UCLN(tu, mau);
        tu = tu / UCLN;
        mau = mau / UCLN;
        return this;
    }

    public void display(){
        if (tu == 0) {
            System.out.println(0);
            return;
        }

        if (mau == 1){
            System.out.println(tu);
            return;
        }

        System.out.println(tu +"/"+ mau);
    }

    public PhanSo nhan(PhanSo phanSoKhac)  {
        return new PhanSo(tu * phanSoKhac.tu, mau * phanSoKhac.mau).rutGon();
    }

    public PhanSo cong(PhanSo phanSoKhac)  {
        return new PhanSo(tu*phanSoKhac.mau + phanSoKhac.tu*mau, mau * phanSoKhac.mau).rutGon();
    }

    public PhanSo chia(PhanSo phanSoKhac) throws Exception{
        if (phanSoKhac.tu == 0)
            throw new Exception("Loi: chia 0");
        return new PhanSo(tu * phanSoKhac.mau, mau * phanSoKhac.tu).rutGon();
    }

    public PhanSo tru(PhanSo phanSoKhac) {
        return new PhanSo(tu*phanSoKhac.mau - phanSoKhac.tu*mau, mau * phanSoKhac.mau).rutGon();
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        if (tu == 0){
            this.tu = 0;
            this.mau = 1;
        }else this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) throws Exception{
        if (mau == 0)
            throw new Exception("Loi: mau = 0");
        this.mau = mau;
    }

    public int soSanhVoi(PhanSo phanSoKhac){
        if (tu * phanSoKhac.mau - phanSoKhac.tu * mau > 0)
            return 1;
        else if (tu * phanSoKhac.mau - phanSoKhac.tu * mau < 0)
            return -1;
        else return 0;
    }


}
