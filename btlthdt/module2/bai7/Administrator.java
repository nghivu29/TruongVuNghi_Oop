package btlthdt.module2.bai7;

public class Administrator extends Employee{
    private String theDepartment;

    @Override
    public String toString() {
        return "Administrator{" +
                "theDepartment='" + theDepartment + '\'' +
                '}';
    }

    public Administrator(int thePayrollNumber, String theName, double theBasicMonthySalary, String theDepartment) {
        super(thePayrollNumber, theName, theBasicMonthySalary);
        this.theDepartment = theDepartment;
    }

    @Override
    public double getMonthySalary() {
        return super.getMonthySalary()*1.4;
    }

    public String getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(String theDepartment) {
        this.theDepartment = theDepartment;
    }
}
