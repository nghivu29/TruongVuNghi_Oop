package lab1.bai_2;

import lab1.bai_1.Diem;

public class DoanThang {
    private Diem diemDau, diemCuoi;

    public Diem getDiemDau() {
        return diemDau;
    }

    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }

    DoanThang(Diem diemDau, Diem diemCuoi){
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }

    @Override
    public String toString() {
        return "[(" + diemDau.getX() + ',' + diemDau.getY() + "),(" + diemCuoi.getX() + ',' + diemCuoi.getY() + ")]";
    }


    public double lenght(){
        return Math.sqrt((diemDau.getX() - diemCuoi.getX())*(diemDau.getX() - diemCuoi.getX()) + (diemDau.getY() - diemCuoi.getY())*(diemDau.getY() - diemCuoi.getY()));
    }

    public boolean parallel(DoanThang doanThangKhac){
        if ( (diemDau.getX() - diemCuoi.getX()) / (diemDau.getY() - diemCuoi.getY()) == (doanThangKhac.diemDau.getX() - doanThangKhac.diemCuoi.getX()) / (doanThangKhac.diemDau.getY() - doanThangKhac.diemCuoi.getY()) )
            return true;
        return false;
    }

    public Diem midpoint(){
        Diem mid = new Diem((diemDau.getX() + diemCuoi.getX()) / 2, (diemDau.getY() - diemCuoi.getY()) / 2);
        return mid;
    }
}
