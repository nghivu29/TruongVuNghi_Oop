package bai_2;

import bai_1.Diem;

public class DoanThang {
    private Diem A, B;

    public Diem getA() {
        return A;
    }

    public void setA(Diem a) {
        A = a;
    }

    public Diem getB() {
        return B;
    }

    public void setB(Diem b) {
        B = b;
    }

    DoanThang(Diem A, Diem B){
        this.A = A;
        this.B = B;
    }

    @Override
    public String toString() {
        return "[(" + A.getX() + ',' + A.getY() + "),(" + B.getX() + ',' + B.getY() + ")]";
    }


    public double lenght(){
        return Math.sqrt((A.getX() - B.getX())*(A.getX() - B.getX()) + (A.getY() - B.getY())*(A.getY() - B.getY()));
    }

    public boolean parallel(DoanThang doanThangKhac){
        if ( (A.getX() - B.getX()) / (A.getY() - B.getY()) == (doanThangKhac.A.getX() - doanThangKhac.B.getX()) / (doanThangKhac.A.getY() - doanThangKhac.B.getY()) )
            return true;
        return false;
    }

    public Diem midpoint(){
        Diem mid = new Diem((A.getX() + B.getX()) / 2, (A.getY() - B.getY()) / 2);
        return mid;
    }
}
