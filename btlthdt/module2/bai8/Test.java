package btlthdt.module2.bai8;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*Tạo danh sách giảng viên*/
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty("Văn Viên", "Giảng", "0", "0"));

        /*Tạo danh sách sinh viên*/
        List<Student> students = new ArrayList<>();
        students.add(new Student("Dũng", "Hoàng", 2014, "0"));
        students.add(new Student("Bình", "Trần", 2014, "1"));
        students.add(new Student("Huynh", "Lê", 2014, "2"));
        students.add(new Student("Huyền", "Hồ", 2013, "3"));

        /*Tạo khóa học*/
        Course course = new Course();

        /**/
        Set<Enrolment> enrolments = new HashSet<>();
        students.forEach(student -> enrolments.add(new Enrolment(student, "0", "0", 0)));


        /*Lập danh sách sinh viên tham gia vào 1 học phần của khóa học do 1 giảng viên giảng dạy*/
        course.addSection("1", "1", "1", faculties.get(0), enrolments);

        /*In ra màng hình theo mẫu*/
        course.display();
    }
}
