package btlthdt.module0.bai11;

public class Test {
    public static void main(String[] args) {
        LopHoc lopPF = new LopHoc();

        lopPF.themHocVien(new HocVien("Le Van A", 9, 5, 7, 9, 8));
        lopPF.themHocVien(new HocVien("Nguyen Van B", 6, 10, 6, 5, 6));
        lopPF.themHocVien(new HocVien("Le Thi C", 3, 4, 7, 5, 3));
        lopPF.themHocVien(new HocVien("Le Van D", 5, 7, 4, 4, 7));

        System.out.println(lopPF.toString());

        System.out.println("\nSo nguoi thi lai: " + lopPF.soNguoiThiLai());
        System.out.println("So nguoi thi tot nghiep: "+ lopPF.soNuoiThiTotNghiep());
        System.out.println("So nguoi lam luan van: "+ lopPF.soNguoiLamLuanVan());

        System.out.println("\nDanh sach hoc vien thi truot: ");
        lopPF.danhSachHocVienThiLai();

    }
}
