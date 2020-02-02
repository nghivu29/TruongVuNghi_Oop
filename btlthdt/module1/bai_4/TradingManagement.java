package btlthdt.module1.bai_4;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TradingManagement {
    private List<DetailTrading> list = new ArrayList<>();

    public int countQuatityOf(Class<? extends  Trading> tradingType){
        return list.stream()
                .filter(t -> t.getTradingType().getClass().equals(tradingType))
                .mapToInt(t -> t.getQuatity())
//                .mapToInt(DetailTrading::getQuatity)
                .sum();
    }

    //tính trung bình thành tiền của một loại giao dịch bất kì với đối số là tên lớp của loại giao dịch đó
    public double averageIntoMoneyOfTrading(Class<? extends  Trading> tradingType){
        return list.stream()
                .filter(t -> t.getTradingType().getClass().equals(tradingType))
                .mapToDouble(t -> t.getTradingType().calculate())
                .average().getAsDouble();
    }

    /*
    * Trả về một quản lý giao dịch mới với danh sách được lọc theo diều kiện
    * Đối số là điều kiện cho trước có liên quan đến loại giao dịch và số lượng giao dịch
    * */
    public TradingManagement filter(Predicate<DetailTrading> predicate){
        TradingManagement toReturn = new TradingManagement();
        toReturn.setList(list.stream().filter(predicate).collect(Collectors.toList()));
        return toReturn;
    }

    public TradingManagement tradingInMonthYear(Month month, int year){
        return filter(detailTrading ->
                detailTrading.getTradingType().getDayTrading().getMonth().equals(month)
                        && detailTrading.getTradingType().getDayTrading().getYear() == year);
    }


    public boolean add(Trading trading, int quatity){
        return list.add(new DetailTrading(quatity, trading));
    }

    //nếu không có đối số số lượng giao dịch, số lượng giao dịch mặc định là 1
    public boolean add(Trading trading){
        return list.add(new DetailTrading(trading));
    }

    public List<DetailTrading> getList() {
        return list;
    }

    public void setList(List<DetailTrading> list) {
        this.list = list;
    }
}
