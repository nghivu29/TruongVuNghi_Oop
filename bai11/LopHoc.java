package bai11;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    private List<HocVien> list = new ArrayList<>();

    public int soNguoiLamLuanVan(){
        int count = 0;

        for (HocVien i: list){
            if (i.duocLamLuanVan() == true)
                count++;
        }

        return count;
    }

    public int soNuoiThiTotNghiep(){
        int count = 0;

        for (HocVien i: list){
            if (i.duocThiTotNghiep() == true)
                count++;
        }

        return count;
    }

    public int soNguoiThiLai(){
        int count = 0;

        for (HocVien i: list){
            if (i.coThiLai() == true)
                count++;
        }

        return count;
    }

    //in ra danh sach cac hoc vien thi lai va ten mon thi lai
    public void danhSachHocVienThiLai(){
        for (HocVien i: list){
            if (i.coThiLai() == true) {
                System.out.println("***Ten hoc vien: " + i.getHoTen());
                System.out.print("Nhung mon thi lai: ");

                for (String mon: i.nhungMonThiLai()){
                    System.out.println(" "+ mon);
                }
            }
        }
    }


}
