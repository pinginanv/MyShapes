public class Shape {

    private String ShapeColor;



    public Shape(String shapeColor) {
        ShapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color is: " + ShapeColor;
    }

    public double caclArea(){

        return 0.0;
    }
}
