package btlthdt.module1.bai_5;

import btlthdt.module1.quanlycacgiaodich.TradingManagement;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //3 khách hàng trong nước
        Customer dCustomer1 = new DomesticCustomer("A", 1, CustomerType.SH);
        Customer dCustomer2 = new DomesticCustomer("B", 2, CustomerType.SX);
        Customer dCustomer3 = new DomesticCustomer("C", 3, CustomerType.KD);
        //3 khách ngoại quốc
        Customer fCustomer1 = new ForeignCustomer("D", 4, Locale.CANADA);
        Customer fCustomer2 = new ForeignCustomer("E", 5, Locale.GERMAN);
        Customer fCustomer3 = new ForeignCustomer("F", 6, Locale.ENGLISH);


        TradingManagement management = new TradingManagement();
        management.add(new EBillOfDomesticCustomer(1111, LocalDate.of(2018, 9, 12),10, (DomesticCustomer) dCustomer1, 10, 200));
        management.add(new EBillOfDomesticCustomer(2222, LocalDate.of(2018, 9, 12),10, (DomesticCustomer) dCustomer2, 20, 200));
        management.add(new EBillOfDomesticCustomer(3333, LocalDate.of(2018, 8, 12),10, (DomesticCustomer) dCustomer3, 30, 200));
        management.add(new EBillOfForeignCustomer(4444, LocalDate.of(2018, 9, 12),10, (ForeignCustomer) fCustomer1, 10));
        management.add(new EBillOfForeignCustomer(5555, LocalDate.of(2018, 2, 12),10, (ForeignCustomer) fCustomer2, 10));
        management.add(new EBillOfForeignCustomer(6666, LocalDate.of(2018, 11, 12),10, (ForeignCustomer) fCustomer3, 10));

        //Tổng số lượng khác cho từng loại khác hàng
        System.out.println("Tổng số lượng khách trong nước: "+ management.countTradingOf(EBillOfDomesticCustomer.class));
        System.out.println("Tổng số lượng khách nước ngoài: "+ management.countTradingOf(EBillOfForeignCustomer.class));

        //tính trung bình thành tiền của khách hàng nước ngoài
        System.out.println("Trung bình thành tiền của khách hàng nước ngoài: "+ management.averageIntoMoneyOfTrading(EBillOfForeignCustomer.class));

        //xuất ra các hóa đơn trong tháng 9 năm 2018
        System.out.println("Danh sách các hóa đơn trong tháng 9 năm 2018:");
        management.tradingInMonthYear(Month.SEPTEMBER, 2018).getList().forEach(System.out::println);
    }
}
