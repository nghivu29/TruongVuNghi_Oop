package btlthdt.module1.bai_8;

//khong hieu phai lam gi
public class Customer extends Person {
    private String companyName;
    private double priceBill;
    private String comment;

    public Customer(String fulName, double priceBill) {
        super(fulName);
        this.priceBill = priceBill;
    }

    @Override
    public String toString() {
        return "#Khach hang:\n" +
                "Ten cong ty: '" + companyName +
                "\nGia tri hoa don " + priceBill +
                "\nDanh gia" + comment;
    }
}
