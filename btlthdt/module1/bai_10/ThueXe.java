package btlthdt.module1.bai_10;

public class ThueXe {
    private Xe xe;

    public double tinhThue(){
        Class loaiXe = xe.getClass();

        if (XeDap.class.equals(loaiXe))
            return 0;

        else if (XeMay.class.equals(loaiXe))
            return VAT.value + ThueTruocBa.xeMay;

        else if (XeOtoKhach.class.equals(loaiXe)) {
            if (((XeOtoKhach) xe).getSoCho() < 5)
                return VAT.value + ThueTruocBa.xeOtoKhach + 0.5;
            return VAT.value + ThueTruocBa.xeOtoKhach + 0.3;
        }

        else if (XeOtoTai.class.equals(loaiXe))
            return VAT.value + ThueTruocBa.xeOtoTai;

        return 0;
    }
}

class VAT{
    public static final float value = 0.1f;
}

class ThueTruocBa{
    public static final float xeMay = 0.05f;
    public static final float xeOtoKhach = 0.2f;
    public static final float xeOtoTai = 0.02f;
}
