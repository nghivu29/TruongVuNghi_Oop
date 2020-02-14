package btlthdt.module2.bai7;

import java.util.*;
import java.util.stream.Collectors;

public class SoftwareHouse <T extends Employee>{
    private String theName;
    private List<T> list;

    public SoftwareHouse(String theName){
        this.theName = theName;
        list = new ArrayList<>();
    }

    public boolean addEmployee(T employee){
        return list.stream().anyMatch(e -> e.thePayrollNumber == employee.thePayrollNumber) ? false : list.add(employee);
    }

    public void displayAllStaff(){
        list.forEach(System.out::println);
    }

    public double getMonthySalaryBill(){
        return list.stream().mapToDouble(Employee::getMonthySalary).sum();
    }

    public void sortAllStaffByName(){
        list.sort(Comparator.comparing(o -> o.theName));
    }

    public void displayListProgrammer(){
         list.stream().filter(employee -> employee.getClass().equals(Programmer.class))
                 .collect(Collectors.toList())
                 .forEach(System.out::println);
    }

    public boolean updateDepartmentForAdmin(int payrollNo, String deptNew){
        for (T t: list){
            if (t.getClass().equals(Administrator.class) && t.thePayrollNumber == payrollNo){
                ((Administrator) t).setTheDepartment(deptNew);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int id){
        return list.removeIf(t -> t.getThePayrollNumber() == id);
    }
}
