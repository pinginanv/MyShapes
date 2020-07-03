import java.util.Comparator;

public class Rectangle extends Shape implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        if ( o instanceof Rectangle) {
            Rectangle object = (Rectangle) o;
            if (this.caclArea() > object.caclArea()) return 1;
            else if (this.caclArea() < object.caclArea()) return -1;
            else return 0;
        }

        return 0;
    }
}
