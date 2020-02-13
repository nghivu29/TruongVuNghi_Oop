package btlthdt.module1.bai_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScoreException {
        /*Khởi tạo danh sách*/
        Management management = new Management();

        Scanner sc = new Scanner(System.in);


        Person person;

        while (true){
            System.out.print("1.Thêm một người vào danh sách.\n" +
                    "2.Xóa một người khỏi danh sách (nhận thông số là họ tên của người cần xóa).\n" +
                    "3.Sắp xếp danh sách theo thứ tự họ tên.\n" +
                    "4.Xuất danh sách.\n" +
                    "5.Thoát.\n" +
                    "Bạn chọn: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    person = chon1();
                    management.add(person);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Nhập tên người cần xóa: ");
                    boolean b = management.deleted(sc.nextLine());
                    System.out.println("Có xóa được: "+ b);
                    break;

                case 3:
                    management.sort();
                    System.out.println("Đã sắp sếp");
                    break;

                case 4:
                    management.display();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }



    private static Person chon1() throws ScoreException {
        System.out.print("-Thêm 1 người vào danh sách:\n" +
                "Chọn đối tượng cần thêm:\n" +
                "1. Sinh viên\n" +
                "2. Nhân viên\n" +
                "3. Khách hàng\n" +
                "Bạn chọn: ");
        String s = "";
        float f1, f2;
        double d;

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên: ");
        s = sc.nextLine();

        switch (choose){
            case 1:
                System.out.print("Nhập điểm môn Toán: ");
                f1 = sc.nextFloat();
                System.out.print("Nhập điểm môn Anh: ");
                f2 = sc.nextFloat();
                return new Student(s, f1, f2);

            case 2:
                System.out.print("Nhập hệ số lương: ");
                f1 = sc.nextFloat();
                return new Employee(s, f1);

            case 3:
                System.out.print("Nhập giá trị hóa đơn: ");
                d = sc.nextDouble();
                return new Customer(s, d);
        }

        return null;
    }
}
