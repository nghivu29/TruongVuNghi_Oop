package btlthdt.module1.bai_2;

public class Thue {
    private double thuePhaiNop;

    public Thue (double thueDauRa, double thueDauVaoDuocKhauTru){
        thuePhaiNop = thueDauRa - thueDauVaoDuocKhauTru;
    }

    public Thue (double thuePhaiNop){
        this.thuePhaiNop = thuePhaiNop;
    }

    public double getThuePhaiNop() {
        return thuePhaiNop;
    }

    public void setThuePhaiNop(double thuePhaiNop) {
        this.thuePhaiNop = thuePhaiNop;
    }

    @Override
    public String toString() {
        return String.valueOf(thuePhaiNop);
    }
}
