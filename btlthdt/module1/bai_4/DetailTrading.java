package btlthdt.module1.bai_4;

public class DetailTrading implements IntoMoney{
    private int quatity = 1;
    private Trading tradingType;

    public DetailTrading(int quatity, Trading tradingType) {
        this.quatity = quatity;
        this.tradingType = tradingType;
    }

    public DetailTrading(Trading tradingType) {
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
