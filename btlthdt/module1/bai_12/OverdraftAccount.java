package btlthdt.module1.bai_12;

public class OverdraftAccount extends Account {
    private double odLimit, overdraft, availableBalance;

    public double getOdLimit() {
        return odLimit;
    }

    private void setOdLimit(double odLimit) {
        this.odLimit = odLimit;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    private void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
