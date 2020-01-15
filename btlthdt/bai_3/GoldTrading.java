package btlthdt.bai_3;

import java.time.LocalDate;

public class GoldTrading extends Trading {
    private String goldType;

    public GoldTrading(int code, LocalDate dayTrading, double price, String goldType) {
        super(code, dayTrading, price);
        this.goldType = goldType;
    }


    @Override
    public double calculate() {
        return super.calculate();
    }

    public String getGoldType() {
        return goldType;
    }

    public void setGoldType(String goldType) {
        this.goldType = goldType;
    }

    @Override
    public String toString() {
        return "GoldTrading{" + super.toString() +'}';
    }
}


