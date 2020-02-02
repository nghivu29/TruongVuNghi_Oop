package btlthdt.module1.bai_8;

public class Person {
    private String fulName;
    private String address = "chua xac dinh";

    public Person(String fulName, String address) {
        this.fulName = fulName;
        this.address = address;
    }

    public Person(String fulName) {
        this.fulName = fulName;
    }

    @Override
    public String toString() {
        return  "fulName: " + fulName + '\n' +
                "address: " + address;
    }

    public String getFulName() {
        return fulName;
    }

    public String getAddress() {
        return address;
    }
}
