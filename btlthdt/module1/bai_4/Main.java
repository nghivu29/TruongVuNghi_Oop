package btlthdt.module1.bai_4;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        TradingManagement management = new TradingManagement();
        management.add(new LandTrading(0, LocalDate.of(2013, 9, 22), 2, 2, TypeOfLand.A));
        management.add(new LandTrading(1, LocalDate.of(2010, 2, 5), 2, 2, TypeOfLand.B));
        management.add(new LandTrading(2, LocalDate.of(2010, 2, 5), 2, 2, TypeOfLand.C), 1);
        management.add(new HomeTrading(3, LocalDate.of(2013, 9, 19), 2, 2, TypeOfHome.NORMAL, "a"));
        management.add(new HomeTrading(4, LocalDate.of(2010, 2, 5), 2, 2, TypeOfHome.HIGH, "b"));
        management.add(new HomeTrading(5, LocalDate.of(2013, 9, 5), 2, 2, TypeOfHome.HIGH, "c"));

        //tính tổng số lượng cho từng loại
        System.out.println("\nTổng số lượng của giao dịch đất là: "+ management.countQuatityOf(LandTrading.class));
        System.out.println("Tổng số lượng của giao dịch nhà là: "+ management.countQuatityOf(HomeTrading.class));

        //tính trung bình thành tiền của giao dịch đất
        System.out.println("\nTrung bình thành tiền của giao dịch đất là: "+ management.averageIntoMoneyOfTrading(LandTrading.class));

        //xuất ra các giao dịch của tháng 9 năm 2013
        management.tradingInMonthYear(Month.SEPTEMBER, 2013).getList().forEach(System.out::println);


    }
}
