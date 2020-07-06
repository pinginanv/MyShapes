import java.util.Comparator;

public abstract class Shape implements Drawable, Comparator<Shape>, Comparable {

    private String ShapeColor;



    public Shape(String shapeColor) {
        ShapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color is: " + ShapeColor;
    }

    public abstract double caclArea();

    @Override
    public void draw() {
        System.out.println(toString()  + ", area is: " + caclArea());
    }

    @Override
    public int compare(Shape shape1, Shape shape2) {
        //System.out.println("shape compare executed");
        return shape1.ShapeColor.compareTo(shape2.ShapeColor);
    }

    @Override
    public int compareTo(Object o) {

        Shape object = (Shape) o;
        if (this.caclArea() > object.caclArea()) return 1;
        else if (this.caclArea() < object.caclArea()) return -1;
        else return 0;

    }
}
