package bai12;

import java.time.LocalDate;

public class Course {
    private Student[] studentList = new Student[20];
    private String name;
    private LocalDate openDay;
    private int trainingDay;

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

    public int getTrainingDay() {
        return trainingDay;
    }

    public void setTrainingDay(int trainingDay) throws Exception {
        if (trainingDay < 0)
            throw new Exception("Loi: ngay la so duong");
        this.trainingDay = trainingDay;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public Course() {
    }

    public Course(String name) {
        try {
            setName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Course(String name, LocalDate openDay, int trainingDay) {
        try {
            setName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            setTrainingDay(trainingDay);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        this.openDay = openDay;
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

    public boolean isFinished(){
        if (openDay.plusDays(trainingDay).isBefore(LocalDate.now()))
            return true;
        return false;
    }

    public boolean isBegin(){
        if (openDay.isBefore(LocalDate.now()))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "\nCourse{" +
                "name='" + name + '\'' +
                ", openDay=" + openDay +
                ", trainingDay=" + trainingDay +
                "}";
    }
}
