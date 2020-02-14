package btlthdt.module2.bai4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DanhSachSInhVien {
    private List<SinhVien> list = new ArrayList<>();

    public void display(){
        System.out.printf("%-15s%-15s%-15s", "Ma", "Ho ten", "ngay sinh");
        list.forEach(System.out::println);
    }

    public boolean them(SinhVien sinhVien){
        return list.add(sinhVien);
    }

    public boolean xoa(long maSinhVien){
        return list.removeIf(sinhVien -> sinhVien.getMa() == maSinhVien);
    }

    public SinhVien sua(long maSinhVien, String hoTenMoi, LocalDate ngaySinhMoi){
        return list.set(list.indexOf(timKiem(maSinhVien)), new SinhVien(maSinhVien, hoTenMoi, ngaySinhMoi));
    }

    public SinhVien timKiem(long maSinhVien){
        return list.stream().filter(sinhVien -> sinhVien.getMa() == maSinhVien).findFirst().get();
    }

    public void sapXep(){
        list.sort(Comparator.comparing(SinhVien::getHoTen));
    }


}
