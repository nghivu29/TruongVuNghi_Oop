package bai10;

public class OrderDetail {
    private int quatity;
    private Product product;

    public double calcTotalPrice(){
        return quatity * product.getPrice();
    }

    @Override
    public String toString() {
        return product.toString() + String.format("| %20d ", quatity);
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public OrderDetail(Product product, int quatity) {
        this.quatity = quatity;
        this.product = product;
    }
}
