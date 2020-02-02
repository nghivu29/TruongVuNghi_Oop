package btlthdt.module0.bai12;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{


        Scanner sc = new Scanner(System.in);

        Course course1 = new Course("Tieng anh", LocalDate.of(2019, 12, 14), 365);
        Course course2 = new Course("Kinh Doanh", LocalDate.of(2020, 1, 31), 60);
        Course course3 = new Course("Tieng Nhat", LocalDate.of(2020, 2, 14), 250);
        Course course4 = new Course("Ke toan", LocalDate.of(2019, 12, 14), 45);
        Course course5 = new Course("Sua xe dap", LocalDate.of(2015, 12, 14), 30);
        Course course6 = new Course("Ki nang mem", LocalDate.of(2019, 10, 14), 2);

        Student student1 = new Student("A");
        Student student2 = new Student("B");
        Student student3 = new Student("C");
        Student student4 = new Student("D");
        Student student5 = new Student("E");
        Student student6 = new Student("F");
        Student student7 = new Student("G");

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course1.addStudent(student6);
        course1.addStudent(student7);

        course2.addStudent(student5);
        course2.addStudent(student6);

        course3.addStudent(student3);
        course3.addStudent(student1);
        course3.addStudent(student4);

        course4.addStudent(student1);

        course5.addStudent(student5);

        course6.addStudent(student1);
        course6.addStudent(student7);


        Courses courses = new Courses();
        courses.addCourse(course1);
        courses.addCourse(course2);
        courses.addCourse(course3);
        courses.addCourse(course4);
        courses.addCourse(course5);
        courses.addCourse(course6);


        System.out.print("#Tim kiem khoa hoc\nNhap ten mon hoc: (vd: \"Tieng anh\") ");
        System.out.println("Ket qua tim: "+ courses.search(sc.nextLine()));

        System.out.println("\n#Biet mot hoc vien da tung hoc nhung khoa nao:");
        System.out.println("vd: stundent5 {name=E}\nHoc vien \"E\" da tung hoc cac khoa: "+ student5.coursesLearned(courses));

        System.out.println("\n#Cac khoa chua ket thuc:\n"+ courses.coursesNotFinished());
        System.out.println("\n#Cac khoa chua bat dau:\n"+ courses.coursesNotBegin());

        System.out.println("\n###Tinh tu hom nay: "+ LocalDate.now());

    }
}
