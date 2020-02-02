package btlthdt.module1.bai_5;

public class DomesticCustomer extends  Customer{
    private CustomerType customerType;

    public DomesticCustomer(String name, int code, CustomerType customerType) {
        super(name, code);
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}

enum CustomerType{
    SH("sinh hoat"), KD("kinh doanh"), SX("san xuat");

    CustomerType(String s) {}
}
