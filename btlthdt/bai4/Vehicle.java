package btlthdt.bai4;
import myexceptions.*;

public class Vehicle {
    private String type, owner;
    private float price;
    private int capXilanh;

    // tinh thue
    private float tax(){
        if (capXilanh >= 0 && capXilanh < 100)
            return price * 0.01f;
        else if (capXilanh < 200)
            return price * 0.03f;
        else return price * 0.05f;

    }

    // constructor, setter, getter

    public Vehicle(String type, String owner, int price, int capXilanh) {

        this.type = type;
        this.owner = owner;

        try {
            this.setPrice(price);
        } catch (myexceptions.myExceptions myExceptions) {
            System.out.println(myExceptions.getMassage());
            myExceptions.printStackTrace();
        }

        try {
            this.setCapXilanh(capXilanh);
        } catch (myexceptions.myExceptions myExceptions) {
            System.out.println(myExceptions.getMassage());
            myExceptions.printStackTrace();
        }
    }

    public Vehicle(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws myExceptions{
        if (price < 0)
            throw new myExceptions("gia phai lon hon hoac bang 0");
        this.price = price;
    }

    public int getCapXilanh() {
        return capXilanh;
    }

    public void setCapXilanh (int capXilanh) throws myExceptions {
        if (capXilanh < 0)
            throw new myExceptions("dung tich khong duoc am");
        this.capXilanh = capXilanh;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%10d%30.2f%30.2f", owner, type, capXilanh, price, this.tax());
    }

}
