package lab3.bai3;

public class Poin2D implements Movable{
    private double x, y;

    public Poin2D(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public void moveUp() {
        System.out.print(" .↑ ");
        y += 1;
    }

    @Override
    public void moveDown() {
        System.out.print(" .↓ ");
        y -= 1;
    }

    @Override
    public void moveLeft() {
        System.out.print(" .← ");
        x -= 1;
    }

    @Override
    public void moveRight() {
        System.out.print(" .→ ");
        x += 1;
    }

    @Override
    public String toString() {
        return "Poin2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
