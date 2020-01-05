package lab1.bai_1;

public class Main {
    public static void main(String[] args) {
        Diem A = new Diem(4, 7);
        Diem B = new Diem(6, 5);

        System.out.println("Toa do A"+ A.toString());
        System.out.println("Toa do B"+ B.toString());
        System.out.println("Khoang cach tu A den B: "+ A.khoangCach(B));
    }
}
