package bai12;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    List<Course> courseList = new ArrayList<>();

    public Course search(String courseName){

        for (Course i: courseList){
            if (i.getName().equals(courseName))
                return i;
        }
        return null;
    }


}
