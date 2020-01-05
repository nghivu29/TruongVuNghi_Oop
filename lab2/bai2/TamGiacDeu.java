package lab2.bai2;

public class TamGiacDeu extends TamGiacCan {
    public TamGiacDeu(double canh) {
        super(canh, canh);
    }

    @Override
    public String toString() {
        return "Hinh tam giac deu" +
                "\nDien tich = "+ tinhDienTich() +
                "\nTinh chu vi = "+ tinhChuVi();
    }
}
