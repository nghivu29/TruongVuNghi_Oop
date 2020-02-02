package lab2.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DsSanPham {
    private List<SanPham> dsSanPham;
    {
        dsSanPham = new ArrayList<>();
    }

    public boolean themSanPham(SanPham sp){
        return dsSanPham.add(sp);
    }

    //xóa sp theo đối tượng
    public boolean xoaSanPham(SanPham sp){
        return dsSanPham.remove(sp);
    }

    //xóa sp theo mã
    public boolean xoaSanPham(String maSP){
        return dsSanPham.removeIf(sanPham -> sanPham.getMaSP().equals(maSP));
    }

    //cập nhật thêm thông tin cho sản phẩm
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

    //tìm kiếm theo mã
    public SanPham timKiem(String maSp){
        return dsSanPham.stream().findFirst()
                .filter(sanPham -> sanPham.getMaSP().equals(maSp))
                .get();
    }

    //tìm kiếm theo tên
    public List<SanPham> timKiemTen(String tuKhoa){
        return dsSanPham.stream()
                .filter(sanPham -> sanPham.getTen().contains(tuKhoa))
                .collect(Collectors.toList());
    }

    //tìm kiếm theo giá bán
    public List<SanPham> timKiem(double tuGia, double denGia){
        return dsSanPham.stream()
                .filter(sanPham -> sanPham.getGiaBan() >= tuGia && sanPham.getGiaBan() <= denGia)
                .collect(Collectors.toList());
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
