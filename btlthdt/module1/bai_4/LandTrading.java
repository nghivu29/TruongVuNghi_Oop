package btlthdt.module1.bai_4;

import java.time.LocalDate;

public class LandTrading extends EstateTrading{
    private TypeOfLand typeOfLand;

    public LandTrading(int code, LocalDate dayTrading, double price, double area, TypeOfLand typeOfLand) {
        super(code, dayTrading, price, area);
        this.typeOfLand = typeOfLand;
    }

    @Override
    public double calculate() {
        if (typeOfLand.equals(TypeOfLand.A))
            return super.calculate() * 1.5;
        return super.calculate();
    }

    public TypeOfLand getTypeOfLand() {
        return typeOfLand;
    }

    public void setTypeOfLand(TypeOfLand typeOfLand) {
        this.typeOfLand = typeOfLand;
    }
}

enum TypeOfLand{
    A, B, C;
}
