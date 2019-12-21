package bai11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Diem{
    private float toan, ly, hoa, van, anh;

    public Diem(int toan, int ly, int hoa, int van, int anh){
        try{
            setToan(toan);
            setLy(ly);
            setHoa(hoa);
            setVan(van);
            setVan(anh);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Diem(){}

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) throws Exception {
        if (toan < 0 || toan > 10)
            throw new Exception("Loi: 0 <= diem <= 10");

        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) throws Exception {
        if (ly < 0 || ly > 10)
            throw new Exception("Loi: 0 <= diem <= 10");
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) throws Exception {
        if (hoa < 0 || hoa > 10)
            throw new Exception("Loi: 0 <= diem <= 10");
        this.hoa = hoa;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) throws Exception {
        if (van < 0 || van > 10)
            throw new Exception("Loi: 0 <= diem <= 10");
        this.van = van;
    }

    public float getAnh() {
        return anh;
    }

    public void setAnh(float anh) throws Exception {
        if (anh < 0 || anh > 10)
            throw new Exception("Loi: 0 <= diem <= 10");
        this.anh = anh;
    }

    //phuong thuc tinh diem trung binh
    public float diemTB(){
        return (toan + ly + hoa + van + anh) / 5;
    }

}

public class HocVien {

    private String hoTen;
    private LocalDate namSinh;
    private Diem diem;

    //setter va getter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (!hoTen.trim().equals(""))
            throw new Exception("Loi: ho ten khong rong");
        this.hoTen = hoTen;
    }

    public LocalDate getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int ngay, int thang, int nam) {
        namSinh = LocalDate.of(nam, thang, ngay);
    }

    public Diem getDiem() {
        return diem;
    }

    public void setAllDiem(int toan, int ly, int hoa, int van, int anh) {
        diem = new Diem(toan, ly, hoa, anh, van);
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    //constructor
    public HocVien(){}

    public HocVien(int toan, int ly, int hoa, int van, int anh){
        setAllDiem(toan, ly, hoa, van, anh);
    }

    public HocVien(String hoTen, LocalDate namSinh, int toan, int ly, int hoa, int van, int anh){
        try{
            setHoTen(hoTen);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        this.namSinh = namSinh;
        setAllDiem(toan, ly, hoa, van, anh);
    }

    //constructor day du theo ngyen mau
    public HocVien(String hoTen, LocalDate namSinh, Diem diem) {
        try{
            setHoTen(hoTen);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.namSinh = namSinh;
        this.diem = diem;
    }

    //conStructor don gian de test
    public HocVien(String hoTen, int diemToan, int diemLy, int diemHoa, int diemVan, int diemAnh){
        this(diemToan, diemLy, diemHoa, diemVan, diemAnh);

        try{
            setHoTen(hoTen);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //cach phuong thuc de danh gia hoc vien theo diem
    public boolean duocLamLuanVan(){
        if (diem.diemTB() > 7 && coThiLai() == false)
            return true;
        return false;
    }

    public boolean duocThiTotNghiep(){
        if (diem.diemTB() <= 7 && coThiLai() == false)
            return true;
        return false;
    }

    public boolean coThiLai(){
        if (diem.getToan() >= 5 && diem.getLy() >= 5 && diem.getHoa() >= 5 && diem.getVan() >= 5 && diem.getAnh() >= 5)
            return false;
        return true;
    }

    public List<String> nhungMonThiLai(){
        List<String> list = new ArrayList<>();

        if (coThiLai() == true) {
            if (diem.getToan() < 5)
                list.add("toan");
            if (diem.getLy() < 5)
                list.add("ly");
            if (diem.getHoa() < 5)
                list.add("hoa");
            if (diem.getVan() < 5)
                list.add("van");
            if (diem.getAnh() < 5)
                list.add("anh");

        }
        return list;
    }
}

//head first desig pating