package Polymorphism.Shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * getRadius());
    }

    @Override
    public void calculateArea() {
        super.setArea(Math.PI * Math.pow(getRadius(), 2));
    }
}
