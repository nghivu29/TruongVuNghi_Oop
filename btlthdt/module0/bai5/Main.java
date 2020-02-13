package btlthdt.module0.bai5;

import myexceptions.myExceptions;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws myExceptions {
        HangThucPham thucPham1 = new HangThucPham("001");thucPham1.setTenHang("Gao");
        HangThucPham thucPham2 = new HangThucPham("002", "Mi", 5000, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 7, 10));
        HangThucPham thucPham3 = new HangThucPham("003", "Nuoc", 12000, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 1, 10));

        System.out.println(thucPham1.toString() +'\n'+ thucPham2.toString() +'\n'+ thucPham3.toString());
    }
}
