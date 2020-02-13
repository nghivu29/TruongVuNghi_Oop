package btlthdt.module1.bai_7;

import java.util.*;
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
        if (list.stream().noneMatch(h -> h.getMaHang() == hangHoa.getMaHang())
            && list.size() < count)
            return list.add(hangHoa);
        return false;
    }

    public void inToanBo(){
        System.out.printf("%-20s%-15s%-15s%-15s%-15s%-20s\n", "Phân Loại", "Mã", "Tên", "Đơn giá", "Lượng tồn", "Thông tin khác");
        list.forEach(System.out::println);
    }

    private void inTungLoai(Class<? extends HangHoa> loaiCanIn){
        layDanhSachLoai(loaiCanIn).inToanBo();
    }

    public void inDSHangSanhSu(){
        inTungLoai(HangSanhSu.class);
    }

    public void inDSHangDienMay(){
        inTungLoai(HangDienMay.class);
    }

    public void inDSHangThucPham(){
        inTungLoai(HangThucPham.class);
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

    //code tệ
    //dáng ra nên sử dụng generic
    public DanhSachHangHoa hangThucPhamKhoBan(){
//        List<HangThucPham> listTP = Collections.singletonList((HangThucPham) layDanhSachLoai(HangThucPham.class).getList());
//        listTP.removeIf(hangThucPham -> !hangThucPham.coKhoBan());
//        DanhSachHangHoa toReturn = new DanhSachHangHoa();
//        toReturn.setList(Collections.singletonList((HangHoa) listTP));
//        return toReturn;

        DanhSachHangHoa toReturn = new DanhSachHangHoa();
        toReturn.setList(list.stream().filter(hangHoa -> hangHoa.vanDe()).collect(Collectors.toList()));
        return toReturn;
    }

    public List<HangHoa> getList() {
        return list;
    }

    public void setList(List<HangHoa> list) {
        this.list = list;
    }

    private DanhSachHangHoa layDanhSachLoai(Class<? extends HangHoa> loaiHang){
        DanhSachHangHoa toReturn = new DanhSachHangHoa();
        toReturn.setList(list.stream()
                .filter(t -> t.getClass().equals(loaiHang))
                .collect(Collectors.toList()));
        return toReturn;
    }

    public boolean xoa(long maHang){
        return list.removeIf(hangHoa -> hangHoa.getMaHang() == maHang);
    }

    public boolean capNhap(long maHang, double donGiaMoi) throws NgoaiLeSoAm {
        for (HangHoa hangHoa: list){
            if (hangHoa.getMaHang() == maHang){
                hangHoa.setDonGia(donGiaMoi);
                return true;
            }
        }
        return false;
    }
}
