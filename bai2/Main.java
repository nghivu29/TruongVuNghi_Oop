package bai2;

import myexceptions.myExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1111, "Le Van A", 3, 6);
        Student student2 = new Student(2222, "Vu Thi B", 4, 9);
        Student student3 = new Student();

        Scanner sc = new Scanner(System.in);

        // neu nhap thong tin khong hop le chuong trinh van se chay kem mot thong bao loi
        try {
            System.out.print("Nhap ma sinh vien 2: ");
            student3.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhap ten sinh vien 2: ");
            student3.setName(sc.nextLine());
            System.out.print("Nhap diem ly thuyet sinh vien 2: ");
            student3.setTheoScore(sc.nextFloat());
            System.out.print("Nhap diem thuc hanh sinh vien 2: ");
            student3.setPracScore(sc.nextFloat());

        }catch (myExceptions e){
            System.out.println(e.getMassage());
            e.printStackTrace();
        }


        System.out.println("\ntruoc thay doi sinh vien 3");
        System.out.printf("%-30s%-30s%20s%20s%20s\n", "ma sinh vien", "ten sinh vien", "diem LT", "diem TH", "diem TB");
        student1.display();
        student2.display();
        student3.display();

        System.out.println("\nsau thay doi sinh vien 3");
        student3 = new Student(3333, "Nguyen Anh C", 2, 4);
        System.out.printf("%-30s%-30s%20s%20s%20s\n", "ma sinh vien", "ten sinh vien", "diem LT", "diem TH", "diemTB");
        student1.display();
        student2.display();
        student3.display();
    }
}
