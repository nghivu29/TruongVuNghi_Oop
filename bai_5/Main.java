package bai_5;

import bai_4.PhanSo;

public class Main {
    public static void main(String[] args) {
        DanhSachPhanSo list = new DanhSachPhanSo();
        list.add(new PhanSo(1, 4));
        list.add(new PhanSo(1, 8));
        list.add(new PhanSo(1, 3));
        list.add(new PhanSo(1, 5));
        list.add(new PhanSo(1, 2));
        list.add(new PhanSo(-1, 2));

        System.out.println("***Hien thi danh sach phan so:");
        list.display();

        System.out.println("\n***Xoa phan so -1/2:");
        list.deleted(new PhanSo(1, -2));
        list.display();

        System.out.print("\n***Tong cua cac phan so trong danh sach:");
        list.sumAll().display();

        System.out.println("\n***Danh sach phan so sau khi sap xep: ");
        list.sort();
        list.display();
    }
}
