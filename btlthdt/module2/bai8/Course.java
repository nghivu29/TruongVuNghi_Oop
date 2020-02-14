package btlthdt.module2.bai8;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseNbr;
    private String courseTitle;
    private int credits;
    private Set<Section> sections = new HashSet<>();

    public int getNbrStudents(String sectionNbr){
        return 0;
    }

    public void addSection(String sectionNbr, String semester, String room, Faculty facultyMember, Set<Enrolment> listEnrolls){
        sections.add(new Section(semester, sectionNbr, room, facultyMember, listEnrolls));
        credits++;
    }

    public void display(){
        System.out.println("Khóa học: "+ courseTitle);
        sections.forEach(System.out::println);

    }

    public Course(){}

    public Course(String courseNbr, String courseTitle, int credits) {
        this.courseNbr = courseNbr;
        this.courseTitle = courseTitle;
        this.credits = credits;
    }

    public String getCourseNbr() {
        return courseNbr;
    }

    public void setCourseNbr(String courseNbr) {
        this.courseNbr = courseNbr;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
