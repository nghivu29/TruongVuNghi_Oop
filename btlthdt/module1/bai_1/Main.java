package btlthdt.module1.bai_1;

public class Main {
    public static void main(String[] args) {
        ChuyenXe chuyen1 = new ChuyenNoiThanh();
        ChuyenXe chuyen2 = new ChuyenNoiThanh();
        ChuyenXe chuyen3 = new ChuyenNgoaiThanh();
        ChuyenXe chuyen4 = new ChuyenNgoaiThanh();

        QLChuyenXe ql = new QLChuyenXe();
        ql.add(chuyen1);
        ql.add(chuyen2);
        ql.add(chuyen3);
        ql.add(chuyen4);

        System.out.println("Tong doan thu cua tat ca cac chuyen xe: "+ ql.tinhTongDoanThu());
        System.out.println("Tong doan thu cua chuyen 1, 2, 3, 4 lan luot: "
                + chuyen1.tinhDoanhThu() +", "
                + chuyen2.tinhDoanhThu() +", "
                + chuyen3.tinhDoanhThu() +", "
                + chuyen4.tinhDoanhThu() +".") ;
    }
}
