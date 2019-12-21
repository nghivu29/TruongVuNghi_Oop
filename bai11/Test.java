package bai11;

public class Test {
    public static void main(String[] args) {
        HocVien a = new HocVien();
        a.setNamSinh(1, 2, 2019);
        a.getNamSinh().plusDays(300);
        System.out.println(a.getNamSinh().toString());
    }
}
