package bai12;

import java.time.LocalDate;

public class Course {
    private Student[] studentList = new Student[20];
    private String name;
    private LocalDate openDay, trainingTime;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.trim().equals(""))
            throw new Exception("Loi: ten khac rong");
        this.name = name;
    }

    public LocalDate getOpenDay() {
        return openDay;
    }

    public void setOpenDay(LocalDate openDay) {
        this.openDay = openDay;
    }

    public LocalDate getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(LocalDate trainingTime) {
        this.trainingTime = trainingTime;
    }

    public boolean addStudent(Student newStudent){
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = newStudent;
                return true;
            }
        }
        return false;
    }



}
