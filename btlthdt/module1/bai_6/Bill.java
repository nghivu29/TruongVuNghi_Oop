package btlthdt.module1.bai_6;

import btlthdt.module1.quanlycacgiaodich.IntoMoney;

import java.time.LocalDate;

public abstract class Bill implements IntoMoney {
    private long code;
    private LocalDate date;

    public Bill(long code, LocalDate date) {
        this.code = code;
        this.date = date;
    }

    public long getCode() {
        return code;
    }

    public LocalDate getDate() {
        return date;
    }
}
