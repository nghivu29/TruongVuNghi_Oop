package lab3.bai3;

public class Rectangle implements Movable {
    private double x, y, a, b;

    public Rectangle(double x, double y, double a, double b){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    @Override
    public void moveUp() {
        System.out.print(" █↑ ");
        y += 1;
    }

    @Override
    public void moveDown() {
        System.out.print(" █↓ ");
        y -= 1;
    }

    @Override
    public void moveLeft() {
        System.out.print(" █← ");
        x -= 1;
    }

    @Override
    public void moveRight() {
        System.out.print(" █→ ");
        x += 1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
