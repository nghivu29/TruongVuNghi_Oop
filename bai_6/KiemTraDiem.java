package bai_6;

public interface KiemTraDiem {
    static double kiemTraDiem(double diem) throws NgoaiLeDiem{
        if (diem < 0 || diem > 10)
            throw new NgoaiLeDiem();
        return diem;
    }
}
