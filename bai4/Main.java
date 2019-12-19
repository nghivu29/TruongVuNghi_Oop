package bai4;

public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Future Neo" ,"Nguyen thu Loan", 35000000, 100);
        Vehicle xe2 = new Vehicle("Ford Ranger", "Le Minh Tin", 250000000, 3000);
        Vehicle xe3 = new Vehicle("Landscape", "Nguyen Minh Triet", 1000000000, 1500);

        System.out.printf("%-30s%-30s%10s%30s%30s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
