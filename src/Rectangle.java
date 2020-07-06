import java.util.Comparator;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double caclArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width= " + width + ", height=" + height;
    }

}
