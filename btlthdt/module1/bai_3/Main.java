package btlthdt.module1.bai_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TradingManagement management = new TradingManagement();
        management.add(new GoldTrading(1, LocalDate.of(2020, 1, 5), 2000000000, "9999"), 1);
        management.add(new GoldTrading(2, LocalDate.of(2017, 1, 5), 1500000000, "9999"), 1);
        management.add(new GoldTrading(3, LocalDate.of(2019, 1, 5), 700000000, "9999"), 2);
        management.add(new MoneyTrading(4, LocalDate.of(2013, 3,4 ), 500000, 6, MoneyType.VN), 3);
        management.add(new MoneyTrading(5, LocalDate.of(2013, 3,4 ), 400000, 6, MoneyType.EUR), 3);
        management.add(new MoneyTrading(6, LocalDate.of(2013, 3,4 ), 2000000, 1000, MoneyType.USD), 1);

        System.out.println("Tổng số lượng giao dịch vàng: "+ management.countGoldTrading());
        System.out.println("Tổng số lượng giao dịch tiền tệ: "+ management.countMoneyTrading());

        System.out.println("\nTrung bình thành tiền của giao dịch tiền tệ: "+ management.averageMoneyTrading());

        System.out.println("\nDanh sách các giao dịch có đơn giá hơn 1 tỷ: ");
        management.trading1Billion().display();



    }
}
