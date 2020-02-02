package btlthdt.module1.bai_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DanhSachHangHoa {
    private List<HangHoa> list;
    private int count;

    public DanhSachHangHoa(int n) {
        count = n;
        list = new ArrayList<>(n);
    }

    public DanhSachHangHoa() {
        list = new ArrayList<>();
    }

    public boolean them(HangHoa hangHoa){
        if (list.stream().noneMatch(h -> h.getMaHang() == hangHoa.getMaHang()))
            return list.add(hangHoa);
        return false;
    }

    public void inToanBo(){
        list.forEach(System.out::println);
    }

    public void inTungLoai(Class<? extends HangHoa> loaiCanIn){
        layDanhSachLoai(loaiCanIn).inToanBo();
    }

    public HangHoa timKiem(long maHang){
        return list.stream()
                .filter(hangHoa -> hangHoa.getMaHang() == maHang)
                .findFirst().get();
    }

    public void sapXepTheoTen(){
        list.sort(Comparator.comparing(HangHoa::getTenHang));
    }

    public void sapXepTheoLuongTon(){
        list.sort((o1, o2) -> o2.getSoLuongTon() - o1.getSoLuongTon());
    }

    //code rác
    //dáng ra nên sử dụng generic
    public DanhSachHangHoa hangThucPhamKhoBan(){
        List<HangThucPham> listTP = Collections.singletonList((HangThucPham) layDanhSachLoai(HangThucPham.class).getList());
        listTP.removeIf(hangThucPham -> !hangThucPham.coKhoBan());
        DanhSachHangHoa toReturn = new DanhSachHangHoa();
        toReturn.setList(Collections.singletonList((HangHoa) listTP));
        return toReturn;
    }

    public List<HangHoa> getList() {
        return list;
    }

    public void setList(List<HangHoa> list) {
        this.list = list;
    }

    public DanhSachHangHoa layDanhSachLoai(Class<? extends HangHoa> loaiHang){
        DanhSachHangHoa toReturn = new DanhSachHangHoa();
        toReturn.setList(list.stream()
                .filter(t -> t.getClass().equals(loaiHang))
                .collect(Collectors.toList()));
        return toReturn;
    }
}
