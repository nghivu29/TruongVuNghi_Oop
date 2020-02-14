package btlthdt.module2.bai7;

public class ProjectLeader extends Programmer {
    public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthySalary, String theLanguage) {
        super(thePayrollNumber, theName, theBasicMonthySalary, theLanguage);
    }

    @Override
    public double getMonthySalary() {
        return super.getMonthySalary()*1.2;
    }
}
