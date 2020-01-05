package lab2.bai1;

import myexceptions.NotNegativeException;

public class Main {
    public static void main(String[] args) throws NotNegativeException {
        Circle circle = new Circle(2);
        System.out.println(circle.toString());

        Ellipse ellipse = new Ellipse(4, 2);
        System.out.println(ellipse.toString());
    }
}
