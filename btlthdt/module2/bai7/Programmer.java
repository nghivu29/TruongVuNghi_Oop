package btlthdt.module2.bai7;

public class Programmer extends Employee {
    protected String theLanguage;

    @Override
    public String toString() {
        return "Programmer{" +
                "theLanguage='" + theLanguage + '\'' +
                '}';
    }

    public Programmer(int thePayrollNumber, String theName, double theBasicMonthySalary, String theLanguage) {
        super(thePayrollNumber, theName, theBasicMonthySalary);
        this.theLanguage = theLanguage;
    }

    @Override
    public double getMonthySalary() {
        return theLanguage.equals("Java") ? super.getMonthySalary()*1.2 : super.getMonthySalary();
    }
}
