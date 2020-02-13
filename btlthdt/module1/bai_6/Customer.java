package btlthdt.module1.bai_6;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long code;
    private String name;
    private List<Bill> listBill = new ArrayList<>();

    public Customer (String name){
        this.name = name;
    }

    public boolean addBill(Bill bill){
        return listBill.add(bill);
    }

    public String getName() {
        return name;
    }
}
