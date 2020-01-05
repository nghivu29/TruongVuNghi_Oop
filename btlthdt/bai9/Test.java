package btlthdt.bai9;

import myexceptions.myExceptions;

public class Test {
    public static void main(String[] args) throws myExceptions{
        //khoi tao danh sach
        DanhSachCongNhan list = new DanhSachCongNhan(9);

        //them
        list.add(new CongNhan(1111, "Le", "Thi Diem", 300));
        list.add(new CongNhan(2222, "Nguyen", "Thi Thu", 200));
        list.add(new CongNhan(3333, "Le", "Loi", 160));
        list.add(new CongNhan(4444, "Pham", "Toi", 250));

        //tinh so luong cong nhan
        System.out.println("So luong cong nhan trong danh sach la: "+ list.countCongNhan());

        //danh sach cong nhan tren 200 san pham
        System.out.println("\nDanh sach cong nhan tren 200 san pham:");
        list.display200();

        //danh sach toan bo cong nhan
        System.out.println("\nDanh sach cong nhan truoc khi sap xep:");
        list.display();

        //danh sach cong nhan sau khi sap xep
        list.sepGiamDanSoSanPham();
        System.out.println("\nDanh sach cong nhan sau khi sap xep:");
        list.display();

    }
}
