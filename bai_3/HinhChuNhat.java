package bai_3;

import bai_1.Diem;

public class HinhChuNhat {
    private Diem diemTrenTrai, diemDuoiPhai;


    public HinhChuNhat(Diem diemTrenTrai, Diem diemDuoiPhai) {
        this.diemTrenTrai = diemTrenTrai;
        this.diemDuoiPhai = diemDuoiPhai;
    }

    public double tinhDienTich(){
        return diemTrenTrai.khoangCach(new Diem(diemTrenTrai.getX(), diemDuoiPhai.getY()))
                * diemTrenTrai.khoangCach(new Diem(diemDuoiPhai.getX(), diemTrenTrai.getY()));
    }

    public double tinhChuVi(){
        return 2.0 * (diemTrenTrai.khoangCach(new Diem(diemTrenTrai.getX(), diemDuoiPhai.getY()))
                + diemTrenTrai.khoangCach(new Diem(diemDuoiPhai.getX(), diemTrenTrai.getY())) );
    }

    public Diem getDiemTrenTrai() {
        return diemTrenTrai;
    }

    public void setDiemTrenTrai(Diem diemTrenTrai) {
        this.diemTrenTrai = diemTrenTrai;
    }

    public Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    public void setDiemDuoiPhai(Diem diemDuoiPhai) {
        this.diemDuoiPhai = diemDuoiPhai;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "diemTrenTrai=" + diemTrenTrai +
                ", diemDuoiPhai=" + diemDuoiPhai +
                '}' + '\n' +
                "chu vi = " + tinhChuVi() + '\n' +
                "dien tich = " + tinhDienTich();
    }

}
