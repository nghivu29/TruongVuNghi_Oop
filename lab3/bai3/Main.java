package lab3.bai3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0,0,3);
        Poin2D poin2D = new Poin2D(0, 0);
        Rectangle rectangle = new Rectangle(0, 0 , 2, 3);

        circle.moveDown();
        circle.moveDown();
        circle.moveUp();
        System.out.println(" : "+ circle);

        poin2D.moveLeft();
        poin2D.moveDown();
        System.out.println(" : "+ poin2D);

        rectangle.moveDown();
        rectangle.moveDown();
        rectangle.moveRight();
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(" : "+ rectangle);


    }
}
