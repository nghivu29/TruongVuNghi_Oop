package bai_1;

public class Diem {
    private float x, y;

    public Diem(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+ x +", "+ y + ")" ;
    }

    //sai ve tu duy, cai duoi tot hon
    static public double khoangCach(Diem A, Diem B){
        return Math.sqrt((A.x - B.x)*(A.x - B.x) + (A.y - B.y)*(A.y - B.y));
    }

    //nen lam truong hop nay
    public double khoangCach(Diem another){
        return Math.sqrt(Math.pow(another.x - x, 2) + Math.pow(another.y - y, 2));
    }
}
