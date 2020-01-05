package lab2.bai2;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(2, 4);
        HinhVuong hv = new HinhVuong(2);
        TamGiac tg = new TamGiac(4, 5, 6);
        TamGiacCan tgc = new TamGiacCan(3, 5);
        TamGiacDeu tgd = new TamGiacDeu(3);

        System.out.println(hcn.toString() +"\n\n"+ hv.toString() +"\n\n"+ tg.toString() +"\n\n"+ tgc.toString() +"\n\n"+ tgd.toString());;
    }
}
