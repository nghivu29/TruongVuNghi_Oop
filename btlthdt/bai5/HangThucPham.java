package btlthdt.bai5;
import myexceptions.*;

import java.util.StringTokenizer;

public class HangThucPham {
    private static class date{
        private int day = 1, month = 1, year = 2019;

        date (int day, int month, int year){
            try {
                setYear(year);
                setMonth(month);
                setDay(day);
            }catch (myExceptions e){
                System.out.println(e.getMassage());
                e.printStackTrace();
            }
        }

        date(){}

        public int getDay() {
            return day;
        }

        public void setDay(int day) throws myExceptions {
            String massage = "khong co ngay nay trong thang hien thoi";

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day < 0 || day > 31)
                    throw new myExceptions(massage);
            }else if (month == 2){
                if (year % 4 == 0) {
                    if (day < 0 || day > 29)
                        throw new myExceptions(massage);
                }else{
                    if (day < 0 || day > 28)
                        throw new myExceptions(massage);
                }
            }else {
                if (day < 0 || day > 30)
                    throw new myExceptions(massage);
            }

            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) throws myExceptions {
            if (month < 1 || month > 12)
                throw new myExceptions("Thang nay khong ton tai");
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) throws myExceptions {
            if (year < 0) {
                throw new myExceptions("Nam nay khong hop le. Khong chap nhan cach hieu nam TCN");
            }
            this.year = year;
        }

        @Override
        public String toString() {
            return String.valueOf(day) + '/' + month + '/' + year;
        }

        int compareTo(date anotherDate){
            if (year > anotherDate.year)
                return 1;
            else if (year < anotherDate.year)
                return -1;
            else {
                if (month > anotherDate.month)
                    return 1;
                else if (month < anotherDate.month)
                    return -1;
                else {
                    if (day > anotherDate.day)
                        return 1;
                    else if (day < anotherDate.day)
                        return -1;
                    else return 0;
                }
            }


        }
    }

    private String maHang = "000", tenHang = "xxx";
    private float donGia;
    private date ngaySanXuat, ngayHetHan;

    public HangThucPham(){}

    //nhap ngay ngan cac nhau boi dau '/' vd: 1/1/2019
    public HangThucPham(String maHang, String tenHang, float donGia, String ngaySanXuat, String ngayHetHan) throws myExceptions {
        if (maHang.trim().compareTo("") == 0)
            throw new myExceptions("Ma hang khong duoc rong");

        if (tenHang.trim().compareTo("") == 0)
            throw new myExceptions("Ten hang khong duoc rong");

        setDonGia(donGia);

        StringTokenizer cut = new StringTokenizer(ngaySanXuat.trim(), "/");
        setNgaySanXuat(Integer.getInteger(cut.nextToken()), Integer.getInteger(cut.nextToken()), Integer.getInteger(cut.nextToken()));

        cut = new StringTokenizer(ngayHetHan.trim(), "/");
        setNgayHetHan(Integer.getInteger(cut.nextToken()), Integer.getInteger(cut.nextToken()), Integer.getInteger(cut.nextToken()));

    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) throws myExceptions{
        if (donGia < 0)
            throw new myExceptions("gia tien phai >= 0");
        this.donGia = donGia;
    }

    public HangThucPham.date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(int day, int month, int year) {
        date date = new date(day, month, year);
        this.ngaySanXuat = date;

    }

    public date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(int day, int month, int year) throws myExceptions{
        date date = new date(day, month, year);

        if (date.compareTo(ngaySanXuat) == -1)
            throw new myExceptions("Ngay het han phai sau ngay san xuat");
        this.ngayHetHan = date;
    }

    public static void main(String[] args) throws myExceptions {
        HangThucPham a = new HangThucPham("111", "test", 2, "1/2/2019", "2/2/2020");
        System.out.println(a.getNgayHetHan().toString());
    }
}
