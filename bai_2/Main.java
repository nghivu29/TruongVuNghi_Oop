package bai_2;

import bai_1.Diem;

public class Main {
    public static void main(String[] args) {
        DoanThang AB = new DoanThang(new Diem(0, 0), new Diem(5, 0));

        System.out.println("Doan thang AB: "+ AB.toString());
        System.out.println("Do dai doan thang AB: "+ AB.lenght());
        System.out.println("Trung diem I"+ AB.midpoint().toString());

        DoanThang CD = new DoanThang(new Diem(0, 2), new Diem(6, 2));
        System.out.println("Doan thang moi CD"+ CD.toString());
        System.out.println("Doan thang AB co song song voi CD hay khong: "+ AB.parallel(CD));
    }
}
