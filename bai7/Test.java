package bai7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap lan luot toa do tam O (x, y) va ban kinh: ");
        HinhTron hinhTron = new HinhTron(new ToaDo("O" ,sc.nextFloat(), sc.nextFloat()), sc.nextFloat());

        System.out.println(hinhTron.toString());
    }
}
