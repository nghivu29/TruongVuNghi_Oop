package btlthdt.module1.bai_3;

public class DetailTrading implements IntoMoney{
    private int quatity;
    private Trading tradingType;

    public DetailTrading(int quatity, Trading tradingType) {
        this.quatity = quatity;
        this.tradingType = tradingType;
    }


    @Override
    public double calculate() {
        return quatity * tradingType.calculate();
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Trading getTradingType() {
        return tradingType;
    }

    public void setTradingType(Trading tradingType) {
        this.tradingType = tradingType;
    }

    @Override
    public String toString() {
        return tradingType.toString();
    }
}
