package bai10;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems = new ArrayList<>();
    private int count;

    public void addLineItem(Product product, int amount){
        lineItems.add(new OrderDetail(product, amount));
    }

    public double calcTotalCharge(){
        double total = 0;
        for (int i = 0; i < lineItems.size(); i++) {
            total += lineItems.get(i).calcTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        String toReturn = "";
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        for (int i = 0; i < lineItems.size(); i++) {
            toReturn += String.format("%-15d", (i+1)) + lineItems.get(i).toString() +
                    String.format("| %30.0f VND", lineItems.get(i).calcTotalPrice() ) + "\n";
        }

        return toReturn;
    }

    public Order(int orderID, LocalDate orderDate){
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }


}
