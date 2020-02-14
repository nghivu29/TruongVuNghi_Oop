package btlthdt.module2.bai7;

public abstract class Employee {
    protected final int thePayrollNumber;
    protected String theName;
    protected double theBasicMonthySalary;

    @Override
    public String toString() {
        return "Employee{" +
                "thePayrollNumber=" + thePayrollNumber +
                ", theName='" + theName + '\'' +
                ", theBasicMonthySalary=" + theBasicMonthySalary +
                '}';
    }

    protected Employee(int thePayrollNumber, String theName, double theBasicMonthySalary) {
        this.thePayrollNumber = thePayrollNumber;
        this.theBasicMonthySalary = theBasicMonthySalary;
        this.theName = theName;
    }

    public double getMonthySalary() {
        return theBasicMonthySalary;
    }

    public int getThePayrollNumber() {
        return thePayrollNumber;
    }
}
