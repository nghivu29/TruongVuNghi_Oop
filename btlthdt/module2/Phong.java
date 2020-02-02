package btlthdt.module2;

public class Phong {
    private int maPhong;
    private DayNha dayNha;
    private double dienTich;
    private int soBongDen;

    public Phong(int maPhong, DayNha dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public Phong() {
    }

    public Phong(int maPhong, DayNha dayNha, double dienTich) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
    }

    protected boolean coChuan(){
        return false;
    }
}

enum DayNha{
    A, B, C, D, E, F, G, H;
}
