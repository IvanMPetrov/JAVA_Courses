package Encapsulation.BOX;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);

    }

    public double calculateSurfaceArea(){
        return  2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume(){
        return length * width * height;
    }

    private boolean isInBounds (double value){
        if (value <= 0){
            return false;
        }
        return true;
    }

    private void setLength(double length) {
        if (isInBounds(length)){
            this.length = length;
        }else {
            String messege = "Length cannot be zero or negative.";
            throw new IllegalArgumentException(messege);
        }

    }

    private void setWidth(double width) {
        if (isInBounds(width)){
            this.width = width;
        }else {
            String messege = "Width cannot be zero or negative.";
            throw new IllegalArgumentException(messege);
        }
    }

    private void setHeight(double height) {
        if (isInBounds(height)){
            this.height = height;
        }else {
            String messege = "Height cannot be zero or negative.";
            throw new IllegalArgumentException(messege);
        }
    }
}
