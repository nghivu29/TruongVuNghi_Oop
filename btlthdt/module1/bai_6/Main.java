package btlthdt.module1.bai_6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        //tạo khách hàng
        Customer customer = new Customer("Nguyễn Văn Nhất");

        //tạo 5 hóa đơn
        Bill bill1 = new DayBill(1, LocalDate.of(2011, 1, 1), customer, 100, 101, 1);
        Bill bill2 = new DayBill(2, LocalDate.of(2011, 1, 1), customer, 100, 101, 1);
        Bill bill11 = new DayBill(1, LocalDate.of(2011, 1, 1), customer, 100, 101, 1);
        Bill bill3 = new HourBill(3, LocalDate.of(2011, 1, 1), customer, 100, 101, 1);
        Bill bill4 = new HourBill(4, LocalDate.of(2011, 3, 1), customer, 100, 101, 1);

        //thêm vào danh sách các hóa đơn trên
        BillList billList = new BillList(4);
        System.out.println("Thêm hóa đơn 1: "+ billList.add(bill1));
        System.out.println("Thêm hóa đơn 2: "+ billList.add(bill2));
        System.out.println("Thêm hóa đơn 3: "+ billList.add(bill3));
        System.out.println("Thêm hóa đơn 4: "+ billList.add(bill4));
        System.out.println("Thêm hóa đơn 11: "+ billList.add(bill11));

        System.out.println("Thông tin danh sách hóa đơn: ");
        System.out.printf("%-10s%-15s%-15s\n", "Mã", "Ngày", "Thời gian");
        billList.display();

        //thống kê số lượng hóa đơn theo giờ
        System.out.println("\n-Số lượng hóa đơn theo giờ: "+ billList.countHourBill());
        System.out.println("-Số lượng hóa đơn theo ngày: "+ billList.countDayBill());

        //tính tổng thành tiền của tháng 1 năm 2011
        System.out.println("-Tổng thành tiền của tháng 1 năm 2011: "+ billList.totalMoney(1, 2011));
    }
}
