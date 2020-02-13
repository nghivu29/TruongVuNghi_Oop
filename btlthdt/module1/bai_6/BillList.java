package btlthdt.module1.bai_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class BillList {
    private List<Bill> billList = new ArrayList<>();
    private int count;

    public BillList(int n) {
        count = n;
    }

    public boolean add(Bill bill){
        boolean b = billList.stream().anyMatch(o -> o.getCode() == bill.getCode());

        if (billList.size() > count || b)
            return false;

        if (billList.add(bill)) {
            count++;
            return true;
        }
         return false;
    }

    public void display(){
        billList.forEach(System.out::println);
    }

    private long countBillOf(Class<? extends Bill> typeOfBill){
        return billList.stream()
                .filter(t -> t.getClass().equals(typeOfBill))
                .count();
    }


    public int countHourBill(){
        return (int) countBillOf(HourBill.class);
    }

    public int countDayBill(){
        return (int) countBillOf(DayBill.class);
    }

    public double totalMoney(int month, int year){
        return billList.stream().filter(bill -> bill.getDate().getMonth().getValue() == month && bill.getDate().getYear() == year)
                .flatMapToDouble(bill -> DoubleStream.of(bill.calculate()))
                .sum();

    }
}
