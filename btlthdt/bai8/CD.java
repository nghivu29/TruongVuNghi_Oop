package btlthdt.bai8;
import myexceptions.*;

public class CD {
    private long maCD = 999999;
    private String tuaCD = "chua xac dinh";
    private int soBai;
    private float giaThanh;

    public long getMaCD() {
        return maCD;
    }

    public void setMaCD(long maCD) throws myExceptions{
        if (maCD <= 0)
            throw new myExceptions("Ma CD khong hop le");
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) throws myExceptions{
        if (tuaCD.trim().compareTo("") == 0)
            throw new myExceptions("tua CD khong duoc rong");
        this.tuaCD = tuaCD;
    }

    public int getSoBai(){
        return soBai;
    }

    public void setSoBai(int soBai) throws myExceptions {
        if (soBai < 0)
            throw new myExceptions("So bai khong the am");
        this.soBai = soBai;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) throws myExceptions {
        if (giaThanh < 0)
            throw new myExceptions("gia thanh khong the am");
        this.giaThanh = giaThanh;
    }

    public CD(){}

    public CD(long maCD, String tuaCD, int soBai, float giaThanh){
        try {
            setMaCD(maCD);
            setTuaCD(tuaCD);
            setSoBai(soBai);
            setGiaThanh(giaThanh);
        }catch (myExceptions e){
            System.out.println(e.getMassage());
        }
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", soBai=" + soBai +
                ", giaThanh=" + giaThanh +
                '}';
    }
}
