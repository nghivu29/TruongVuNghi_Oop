package btlthdt.module0.bai7;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;

    //tinh chu vi va dien tich
    public double chuVi(){
        return Math.PI * 2 * banKinh;
    }

    public double dienTich(){
        return Math.PI * banKinh * banKinh;
    }

    //constructor
    public HinhTron(){}

    public HinhTron(ToaDo tam, double banKinh){
        this.tam = tam;
        this.banKinh = banKinh;
    }

    //get set

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam){
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron co tam " + tam.toString() + " với bán kính " + banKinh +
                " có diện tích và chu vi lần lượt là " + String.format("%.2f", dienTich()) + " va " + String.format("%.2f", chuVi()) + '.';
    }
}
