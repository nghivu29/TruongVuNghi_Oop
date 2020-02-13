package btlthdt.module0.bai12;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.trim().equals(""))
            throw new Exception("Loi: ten khac rong");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> coursesLearned(CourseList courseListAvailable){
        List<Course> toReturn = new ArrayList();

        for (Course course: courseListAvailable.getCourseList()){
            for (Student student: course.getStudentList()){
                if (student == null)
                    break;

                if (student.getName().equals(this.name) ){
                    toReturn.add(course);
                }
            }

        }

        return toReturn;
    }


    public Student(String name, String address, String phoneNumber){
        try {
            setName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public Student(String name){
        this(name, null, null);
    }

}
