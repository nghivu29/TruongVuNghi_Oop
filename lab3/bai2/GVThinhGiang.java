package lab3.bai2;

import java.time.LocalDate;

public class GVThinhGiang extends GiangVien {
    private String noiCongTac;

    public GVThinhGiang(String hoTen, String hocHam, String hocVi, LocalDate ngaySinh, LocalDate ngayBatDau, String noiCongTac) {
        super(hoTen, hocHam, hocVi, ngaySinh, ngayBatDau);
        this.noiCongTac = noiCongTac;
    }


    @Override
    public double tinhTienLuong(double soGio) {
        return 0;
    }

    @Override
    public String toString() {
        return "GVThinhGiang{" +
                "noiCongTac='" + noiCongTac + '\'' +
                '}';
    }
}
