package lab1.bai_4;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Tao phan so 1 la 9/3");
        PhanSo phanSo1 = new PhanSo(9, 3);

        System.out.println("Tao phan so 2 la 6/12");
        PhanSo phanSo2 = new PhanSo(6, 12);

        System.out.print("Hien thi 9/3 sau khi rut gon: ");
        phanSo1.rutGon().display();

        System.out.println("So sanh phan so 1 voi phan so 2 (> la 1, < la -1, = la 0): "+ phanSo1.soSanhVoi(phanSo2));

        System.out.print("Tong 2 phan so tren: ");
        phanSo1.cong(phanSo2).display();
        System.out.print("Hien 2 phan so tren: ");
        phanSo1.tru(phanSo2).display();
        System.out.print("Tich 2 phan so tren: ");
        phanSo1.nhan(phanSo2).display();
        System.out.print("Thuong 2 phan so tren: ");
        phanSo1.chia(phanSo2).display();


    }
}
