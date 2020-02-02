package lab1.bai_1;

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

    //nen lam truong hop nay
    public double khoangCach(Diem another){
        return Math.sqrt(Math.pow(another.x - x, 2) + Math.pow(another.y - y, 2));
    }
}
