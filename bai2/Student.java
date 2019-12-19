package bai2;

import myexceptions.myExceptions;

public class Student {
    private String name;
    private int id;
    private float theoScore, pracScore;


    // Cac phuong thuc get, set va constructor

    public int getId() {
        return id;
    }

    public void setId(int id) throws myExceptions {
        if (id < 0)
            throw new myExceptions("Loi: ID khong hop le");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws myExceptions {
        if (name == "")
            throw new myExceptions("Loi: Ten khong duoc rong");
        this.name = name;
    }

    public float getTheoScore() {
        return theoScore;
    }

    public void setTheoScore(float theoScore) throws myExceptions {
        if (theoScore < 0 || theoScore > 10)
            throw new myExceptions("Loi: Diem khong hop le");
        this.theoScore = theoScore;
    }

    public float getPracScore() {
        return pracScore;
    }

    public void setPracScore(float pracScore) throws myExceptions {
        if (pracScore < 0 || pracScore > 10)
            throw new myExceptions("Loi: Diem khong hop le");
        this.pracScore = pracScore;
    }

    public Student(int id, String name, float theoScore, float pracScore) {
        try {
            this.setId(id);
            this.name = name;
            this.setTheoScore(theoScore);
            this.setPracScore(pracScore);
        }catch (myExceptions e){
            System.out.println(e.getMassage());
            e.printStackTrace();
        }
    }

    public Student(){}


    // tim diem trung binh
    public float average(){
        return (theoScore + pracScore) / 2;
    }

    // in ra cac thuoc tinh cua doi tuong
    @Override
    public String toString() {
        return  "id: " + id + '\n' +
                "name: " + name + '\n' +
                "theoreticalScore: " + theoScore + '\n' +
                "practiceScore: " + pracScore + '\n' +
                '\n';
    }

    // in cac thuoc tinh cua doi tuong theo tung cot
    public void display(){
        System.out.printf("%-30s%-30s%20.2f%20.2f%20.2f\n", id, name, theoScore, pracScore, this.average());
    }

}
