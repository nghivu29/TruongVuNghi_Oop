package btlthdt.module0.bai3;

public class Triangle {
    private double ma, mb, mc;

    //constructor va get, set

    public Triangle(double ma, double mb, double mc) {
        if ((ma + mb <= mc) || (ma + mc <= mb) || (mb + mc <= ma)){
            this.ma = this.mb = this.mc = 0;
        }else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public Triangle(){}

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        if (ma <= 0)
            return;
        this.ma = ma;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        if (mb <= 0)
            return;
        this.mb = mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        if (mc <= 0)
            return;
        this.mc = mc;
    }

    //phuong thuc tinh chu vi va dien tich
    public double perimeter(){
        return ma + mb + mc;
    }

    public double square(){
        double p = (ma + mb + mc) / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }

    //cac phuong thuc de kiem tra mot tam giac

    private double canhLon, canhNho1, canhNho2;
    public double timCanhLon(double a, double b, double c){
        canhLon = c; canhNho1 = b; canhNho2 = a;

        if ( canhLon < b) { canhLon = b; canhNho1 = c; canhNho2 = a; }
        if ( canhLon < a) { canhLon = a; canhNho1 = c; canhNho2 = b; }

        return canhLon;
    }

    public boolean kiemTraLaTamGiac(){
        timCanhLon(ma, mb, mc);
        if ( canhLon < canhNho1 + canhNho2 && canhLon != 0)
            return true;
        return false;
    }

    public boolean kiemTraTamGiacVuong(){
        if (kiemTraLaTamGiac() == true){
            if ( canhLon == Math.sqrt(canhNho1*canhNho1 + canhNho2*canhNho2) )
                return true;
        }
        return false;
    }

    public boolean kiemTraTamGiacDeu(){
        if (kiemTraLaTamGiac() == true)
            if (ma == mb && ma == mc && mb == mc)
                return true;
        return false;
    }

    public boolean kiemTraTamGiacCan(){
        if (kiemTraTamGiacDeu() == false)
            if (ma == mb || ma == mc || mb == mc)
                return true;
        return false;
    }

    public String type(){
        if (ma == 0 && mb == 0 && mc == 0) return "khong phai tam giac";
        if (kiemTraTamGiacVuong()) return "tam giac vuong";
        if (kiemTraTamGiacDeu()) return "tam giac deu";
        if (kiemTraTamGiacCan()) return "tam giac can";
        if (kiemTraLaTamGiac()) return "tam giac thuong";

        return "khong phai tam giac";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "ma=" + ma +
                ", mb=" + mb +
                ", mc=" + mc +
                ", type=" + type() +
                ", square=" + square() +
                ", perimeter=" + perimeter() +
                '}';
    }

    //xuat theo dang bang
    public void display(){
        System.out.printf("%15.2f%15.2f%15.2f   %-25s%15.2f%15.2f\n", ma, mb, mc, type(), square(), perimeter());
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 6); // tam giac thuong
        Triangle t2 = new Triangle(4, 4, 6); // tam giac can
        Triangle t3 = new Triangle(4, 4, 4); // tam giac deu
        Triangle t4 = new Triangle(3, 4, 9); // khong tao duoc tam giac tu dong cac bien ve 0
        Triangle t5 = new Triangle(5, 4, 8); // tam giac se bi doi canh
        t5.setMa(-4); // gan gia tri am cach khong tay doi

        System.out.printf("%15s%15s%15s   %-25s%15s%15s\n", "ma", "mb", "mc", "kieu tam giac", "dien tich", "chu vi");
        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();

    }
}


