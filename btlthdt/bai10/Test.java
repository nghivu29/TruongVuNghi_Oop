package btlthdt.bai10;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.of(2015, 9, 10));

        order.addLineItem(new Product("Nước tương", "sp4", 8000), 10);
        order.addLineItem(new Product("Gạo", "sp1", 18000), 5);
        order.addLineItem(new Product("Đường", "sp3", 10000), 1);
        order.addLineItem(new Product("Gạo", "sp1", 18000), 1);

        System.out.println("Mã HD: "+ order.getOrderID() +
                "\nNgày lập hoá đơn: "+ order.getOrderDate() );

        System.out.printf("%-15s  %-15s   %-30s   %20s   %20s   %30s\n", "STT", "Mã SP", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền");
        System.out.println(order.toString());

        System.out.printf("Tổng tiền thanh toán: %.0fVND\n", order.calcTotalCharge());

    }
}
