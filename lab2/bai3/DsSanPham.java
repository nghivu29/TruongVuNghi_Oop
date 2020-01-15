package lab2.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DsSanPham {
    private List<SanPham> dsSanPham;

    {
        dsSanPham = new ArrayList<>();
    }

    public boolean themSanPham(SanPham sp){
        return dsSanPham.add(sp);
    }

    public boolean xoaSanPham(SanPham sp){
        return dsSanPham.remove(sp);
    }

    //sai
    public boolean xoaSanPham(String maSP){
        //sai
        return dsSanPham.remove(maSP);
    }

    public boolean capNhapSanPham(String maSp, String ten, String moTa, double gia){
        for (SanPham sp: dsSanPham){
            if (sp.getMaSP().equals(maSp)){
                sp.setTen(ten);
                sp.setMoTa(moTa);
                sp.setGiaBan(gia);
                return true;
            }
        }

        return false;
    }

    public List<SanPham> timKiem(String tuKhoa){


        return new ArrayList<>();
    }

    public List<SanPham> timKiem(double tuGia, double denGia){

        return new ArrayList<>();
    }

    //sắp xếp theo giá giảm dần
    public void sapXep(){
        Collections.sort(dsSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if (o1.getGiaBan() > o2.getGiaBan())
                    return -1;
                else if (o1.getGiaBan() < o2.getGiaBan())
                    return 1;
                return 0;
            }
        });
    }

    public void hienThi(){
        for (SanPham sp: dsSanPham){
            System.out.println(sp.toString());
        }
    }
}
