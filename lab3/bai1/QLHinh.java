package lab3.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QLHinh {
    private List<Hinh> list;
    {
        list = new ArrayList<>();
    }

    public void them(Hinh hinhMoi){
        list.add(hinhMoi);
    }

    public boolean xoa(Hinh hinhXoa){
        return list.remove(hinhXoa);
    }

    public Hinh xoa(int index){
        return list.remove(index);
    }

    public void hienThi(){
        for (Hinh hinh: list){
            System.out.println("***"+ hinh.toString());
        }
    }

    public QLHinh layHinhLoai(String tenHinh){
        QLHinh qlHinh = new QLHinh();

        for (Hinh hinh: list){
            if (hinh.getTen().equals(tenHinh))
                qlHinh.them(hinh);
        }

        return qlHinh;
    }

    public QLHinh layHinhChuNhat(){
        return layHinhLoai("hinh chu nhat");
    }

    public QLHinh layHinhVuong(){
        return layHinhLoai("hinh vuong");
    }

    public QLHinh layHinhEllipse(){
        return layHinhLoai("e-lip");
    }

    public QLHinh layHinhTron(){
        return layHinhLoai("hinh tron");
    }

    public QLHinh layHinhTamGiac(){
        return layHinhLoai("tam giac");
    }

    public QLHinh layHinhTamGiacCan(){
        return layHinhLoai("tam giac can");
    }

    public QLHinh layHinhTamGiacDeu(){
        return layHinhLoai("tam giac deu");
    }

    public void sapXepTangTheoS(){
        Collections.sort(list, new Comparator<Hinh>() {
            @Override
            public int compare(Hinh o1, Hinh o2) {
                if (o1.tinhDienTich() > o2.tinhDienTich())
                    return 1;
                else if (o1.tinhDienTich() < o2.tinhDienTich())
                    return -1;
                return 0;
            }
        });
    }

    public void sapXepGiamTheoC(){
        Collections.sort(list, new Comparator<Hinh>() {
            @Override
            public int compare(Hinh o1, Hinh o2) {
                if (o1.tinhChuVi() > o2.tinhChuVi())
                    return -1;
                else if (o1.tinhChuVi() < o2.tinhChuVi())
                    return 1;
                return 0;
            }
        });
    }

    public List<Hinh> getList() {
        return list;
    }

}
