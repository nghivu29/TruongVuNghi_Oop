package btlthdt.module0.bai12;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    private List<Course> courseList = new ArrayList<>();

    public Course search(String courseName){

        for (Course i: courseList){
            if (i.getName().equals(courseName))
                return i;
        }
        return null;
    }

    public void addCourse(Course newCourse){
        courseList.add(newCourse);
    }

    public List<Course> coursesNotFinished(){
        List<Course> toReturn = new ArrayList<>();

        for (Course i: courseList){
            if (!i.isFinished())
                toReturn.add(i);
        }

        return toReturn;
    }

    public List<Course> coursesNotBegin(){
        List<Course> toReturn = new ArrayList<>();

        for (Course i: courseList){
            if (!i.isBegin())
                toReturn.add(i);
        }

        return toReturn;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
