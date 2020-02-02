package btlthdt.module1.bai_5;

import java.util.Locale;

public class ForeignCustomer extends Customer {
    private Locale nationality;

    public ForeignCustomer(String name, int code, Locale nationality) {
        super(name, code);
        this.nationality = nationality;
    }

    public Locale getNationality() {
        return nationality;
    }

    public void setNationality(Locale nationality) {
        this.nationality = nationality;
    }
}

