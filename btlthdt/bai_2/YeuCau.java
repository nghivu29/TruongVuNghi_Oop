package btlthdt.bai_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class YeuCau implements ThanhTien{
    private List<ChiTietYeuCau> nhungLoaiSach;
    {
        nhungLoaiSach = new ArrayList<>();
    }

    public void themLoaiSach(Sach sach, int soLuong){
        nhungLoaiSach.add(new ChiTietYeuCau(sach, soLuong));
    }


    @Override
    public double tinhTien() {
//        double tongTien = nhungLoaiSach.stream().mapToDouble(ChiTietYeuCau::tinhTien).sum();

        double tongTien = 0;
        Iterator<ChiTietYeuCau> it = nhungLoaiSach.iterator();
        while (it.hasNext()){
            tongTien += it.next().tinhTien();
        }
        return tongTien;
    }

    public double tinhTienSGK(){
        return nhungLoaiSach.stream()
                .filter(ctyc -> ctyc.getSach().getClass().equals(SachGiaoKhoa.class))
                .mapToDouble(ctyc -> ctyc.tinhTien())
                .sum();
    }

    public double tinhTienSTK(){
        return nhungLoaiSach.stream()
                .filter(ctyc -> ctyc.getSach().getClass().equals(SachThamKhao.class))
                .mapToDouble(ctyc -> ctyc.tinhTien())
                .sum();
    }

    //tính TB cộng đơn giá các loại sách tham khảo
    public double averageSTK(){
        return nhungLoaiSach.stream()
                .filter(ctyc -> ctyc.getSach().getClass().equals(SachThamKhao.class))
                .mapToDouble(ctyc -> ctyc.tinhTien() / ctyc.getSoLuong())
                .average().getAsDouble();
    }

    //xuất ra các sach giáo khoa của nhà suất bản K
    public void showSGK(String nxb){
        nhungLoaiSach.stream()
                .filter(o -> nxb.equalsIgnoreCase(o.getSach().getNhaXuatBan()) && o.getSach().getClass().equals(SachGiaoKhoa.class))
                .forEach(System.out::println);
    }
}
