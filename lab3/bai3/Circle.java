package lab3.bai3;

public class Circle implements Movable {
    private double x, y, r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void moveUp() {
        System.out.print(" ◯↑ ");
        y += 1;
    }

    @Override
    public void moveDown() {
        System.out.print(" ◯↓ ");
        y -= 1;
    }

    @Override
    public void moveLeft() {
        System.out.print(" ←◯ ");
        x -= 1;
    }

    @Override
    public void moveRight() {
        System.out.print(" ◯→");
        x += 1;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
