package bai_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


enum GioiTinh{
    NAM("nam"), NU("nu"), KHAC("gioi tinh khac");

    private final String name;

    GioiTinh(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class HocVien implements KiemTraDiem{
    private int maHV;
    private String hoTen = "unknow";
    private Date ngaySinh = new Date(2020, 1, 1);
    private GioiTinh gioiTinh = GioiTinh.NAM;
    private double[] diem = new double[3]; // [0] diem toan, [1] diem van, [2] diem anh
    private static int dem = 0;

    {
        maHV = dem++;
    }

    public HocVien(){};
    public HocVien(String hoTen, Date ngaySinh, GioiTinh gioitinh) {
        setHoTen(hoTen);
        setNgaySinh(ngaySinh);
        setGioiTinh(gioitinh);
    }

    public void nhapThongTin(Scanner sc) throws ParseException {
        System.out.print("Nhap ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap ngay sinh: ");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        ngaySinh = f.parse(sc.nextLine());

        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.next();
        if (gioiTinh.trim().toLowerCase().equals("nam"))
            setGioiTinh(GioiTinh.NAM);
        else if (gioiTinh.trim().toLowerCase().equals("nu"))
            setGioiTinh(GioiTinh.NU);
        else setGioiTinh(GioiTinh.KHAC);

    }

    public void nhapDiem(Scanner sc) throws NgoaiLeDiem {
        System.out.print("MS "+ maHV + "\nNhap diem toan: ");
        setDiemToan(sc.nextDouble());
        System.out.print("Nhap diem van: ");
        setDiemVan(sc.nextDouble());
        System.out.print("Nhap diem anh: ");
        setDiemAnh(sc.nextDouble());
    }

    public void hienThi(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("###Thong tin hoc vien MS "+ maHV +":\n"+
                "Ho va ten: "+ hoTen +
                "\nNgay sinh: "+ f.format(ngaySinh) +
                "\nGioi tinh: "+ gioiTinh.getName() );

        System.out.printf("Diem toan: %.2f \t Diem van: %.2f \t Diem anh: %.2f\n", diem[0], diem[1], diem[2]);
    }


    //setter and getter

    public void setMaHV(int maHV) throws Exception{
        if (maHV < 0)
            throw new Exception(">0");
        this.maHV = maHV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen.trim();
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiem(double[] diem) throws NgoaiLeDiem {
        setDiem(diem[0], diem[1], diem[2]);
    }

    public void setDiem(double diemToan, double diemVan, double diemAnh) throws NgoaiLeDiem{
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    public void setDiemToan(double diemToan) throws NgoaiLeDiem{
        diem[0] = KiemTraDiem.kiemTraDiem(diemToan);
    }

    public void setDiemVan(double diemVan) throws NgoaiLeDiem {
        diem[1] = KiemTraDiem.kiemTraDiem(diemVan);
    }

    public void setDiemAnh(double diemAnh) throws NgoaiLeDiem{
        diem[2] = KiemTraDiem.kiemTraDiem(diemAnh);
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }


    public int getMaHV() {
        return maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public double[] getDiem() {
        return diem;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }
}
