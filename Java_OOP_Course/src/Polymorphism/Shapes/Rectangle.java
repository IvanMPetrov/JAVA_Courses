package Polymorphism.Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * (height + width));
    }
    @Override
    protected void calculateArea() {
        setArea(height * width);
    }
}
