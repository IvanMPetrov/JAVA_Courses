package Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5D, 17D);
        Circle circle = new Circle(11D);

        rectangle.calculatePerimeter();
        System.out.println(rectangle.getPerimeter());

        circle.calculateArea();
        System.out.println(circle.getArea());
    }
}