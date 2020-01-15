package btlthdt.bai_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TradingManagement {
    List<DetailTrading> list = new ArrayList<>();

    public long countMoneyTrading(){
        return list.stream().filter(t -> t.getTradingType().getClass().equals(MoneyTrading.class)).count();
    }

    public long countGoldTrading(){
        return list.stream().filter(t -> t.getTradingType().getClass().equals(GoldTrading.class)).count();
    }

    //tính trung bình thành tiền của giao dịch tiền tệ
    public double averageMoneyTrading(){
        return list.stream()
                .filter(t -> t.getTradingType().getClass().equals(MoneyTrading.class))
                .mapToDouble(t -> t.getTradingType().calculate())
                .average().getAsDouble();
    }

    //cac giao dịch có đơn giá hơn 1 tỷ
    public TradingManagement trading1Billion(){
        TradingManagement toReturn = new TradingManagement();
        toReturn.setList(
                list.stream().filter(t -> t.getTradingType().getPrice() > 1000000000).collect(Collectors.toList())
        );
        return toReturn;
    }

    public void display(){
        list.stream().forEach(System.out::println);
    }

    public boolean add(Trading trading, int quatity){
        return list.add(new DetailTrading(quatity, trading));
    }

    public List<DetailTrading> getList() {
        return list;
    }

    public void setList(List<DetailTrading> list) {
        this.list = list;
    }

}
