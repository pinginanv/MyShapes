import java.util.Comparator;

public class Circle extends Shape implements Comparable {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double caclArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius= " + radius;
    }

    @Override
    public int compareTo(Object o) {
        if ( o instanceof Circle) {
            Circle object = (Circle) o;
            if (this.caclArea() > object.caclArea()) return 1;
            else if (this.caclArea() < object.caclArea()) return -1;
            else return 0;
        }

        return 0;
    }


}
