package bai7;

public class ToaDo {
    private float x;
    private float y;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    ToaDo(){}

    public ToaDo(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return name + '(' + x + ',' + y + ')';
    }

}
