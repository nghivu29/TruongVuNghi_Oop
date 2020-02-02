package btlthdt.module1.bai_10;

public class XeOtoKhach extends Xe {
    private int soCho;

    public XeOtoKhach(String tenXe, double gia, int soCho) {
        super(tenXe, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }
}
