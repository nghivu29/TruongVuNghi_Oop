package btlthdt.module1.bai_4;

import java.time.LocalDate;

public class HomeTrading extends EstateTrading {
    private TypeOfHome typeOfHome ;
    private String address;

    public HomeTrading(int code, LocalDate dayTrading, double price, double area, TypeOfHome typeOfHome, String address) {
        super(code, dayTrading, price, area);
        this.typeOfHome = typeOfHome;
        this.address = address;
    }

    @Override
    public double calculate() {
        if (typeOfHome.equals(TypeOfHome.NORMAL))
            return super.calculate() * 0.9;
        return super.calculate();
    }

    public TypeOfHome getTypeOfHome() {
        return typeOfHome;
    }

    public void setTypeOfHome(TypeOfHome typeOfHome) {
        this.typeOfHome = typeOfHome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

enum TypeOfHome{
    NORMAL("thuong"), HIGH("cao cap");


    TypeOfHome(String thuong) {
    }
}
