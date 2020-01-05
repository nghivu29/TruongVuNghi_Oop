package lab3.bai1;

public class Main {
    public static void main(String[] args) {
        QLHinh qlHinh = new QLHinh();
        Hinh hv = new HinhVuong(3);
        Hinh hv2 = new HinhVuong(5);
        Hinh hcn = new HinhChuNhat(2, 4);
        Hinh tron = new HinhTron(3);
        Hinh tgd = new TamGiacDeu(2);
        Hinh tgc = new TamGiacCan(3, 4);

        //them hinh
        System.out.println("\n###Bat dau them hinh");
        qlHinh.them(hv);
        qlHinh.them(hcn);
        qlHinh.them(tron);
        qlHinh.them(tgd);
        qlHinh.them(tgc);
        qlHinh.them(hv2);
        qlHinh.them(new Ellipse(5, 3));

        //hien thi
        System.out.println("\n###Hien thi danh sach da them");
        qlHinh.hienThi();

        //xoa
        System.out.println("\n###Bat dau xoa");
        System.out.println("\tXoa phan tu ton tai: \nTra ve: "+ qlHinh.xoa(tgc));
        System.out.println("\tXoa phan tu cuoi cung: \nTra ve: "+ qlHinh.xoa(qlHinh.getList().size()-1));
            //hien thi danh sach sau khi xoa
        System.out.println("\n##Danh sach sau khi xoa:");
        qlHinh.hienThi();

        //lay danh sach cac hinh cu the
        System.out.println("\n###Bat dau lay danh sach cac hinh vuong: ");
        QLHinh qlHinhVuong = qlHinh.layHinhVuong();
            //hien thi danh sach da lay duoc
        System.out.println("\n##Danh sach hinh vuong da lay duoc");
        qlHinhVuong.hienThi();

        //xap xep danh sach tang dan theo dien tich
        System.out.println("\n###Bat dau sap xep tang dan theo dien tich");
        qlHinh.sapXepTangTheoS();
        System.out.println("\tHien thi danh sach da sap xep");
        qlHinh.hienThi();

        //xap xep danh sach giam dan theo chu vi
        System.out.println("\n###Bat dau sap xep giam dan theo chu vi");
        qlHinh.sapXepGiamTheoC();
        System.out.println("\tHien thi danh sach da sap xep");
        qlHinh.hienThi();
    }
}
