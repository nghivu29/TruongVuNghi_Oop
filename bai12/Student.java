package bai12;

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

    public void aboutCourse(){

    }
}
