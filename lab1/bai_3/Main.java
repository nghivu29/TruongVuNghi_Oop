package lab1.bai_3;

import lab1.bai_1.Diem;

public class Main {
    public static void main(String[] args) {
        //tao mot hinh chu nhat
        HinhChuNhat ABCD = new HinhChuNhat(new Diem(0, 3), new Diem(5, 0));
        System.out.println(ABCD.toString());
    }
}
