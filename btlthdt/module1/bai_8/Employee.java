package btlthdt.module1.bai_8;

public class Employee extends Person implements Comment {
    private float heSoLuong;

    public Employee(String fulName, float heSoLuong) {
        super(fulName);
        this.heSoLuong = heSoLuong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String comment() {
        return null;
    }

    public double tinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return "Nhan vien:\n" +
                super.toString() + '\n' +
                "He so luong: " + heSoLuong + '\n' +
                "Tien luong: " + tinhLuong();
    }
}
