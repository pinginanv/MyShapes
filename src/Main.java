
public class Main {
    public static void main(String[] args) {


        Shape[] arr = new Shape[9];
        arr[0] = new Rectangle("RED", 11, 53);
        arr[1] = new Rectangle("Yellow", 5, 37);
        arr[2] = new Rectangle("BLue", 2, 4);
        arr[3] = new Rectangle("Pink", 100, 56);
        arr[4] = new Rectangle("White", 45, 1);
        arr[5] = new Circle("GREEN", 22);
        arr[6] = new Circle("Orange", 55);
        arr[7] = new Triangle("BLACK", 5, 5, 5);
        arr[8] = new Triangle("Brown", 3, 3, 3);

        double sumArea = 0;
        double sumRectArea = 0;
        double sumCircleArea  = 0;
        double sumTriangleArea = 0;

        for (Shape sh : arr) {
            System.out.println(sh.toString() + ", area is: " + sh.caclArea());
            sumArea = sumArea + sh.caclArea();
            if (sh instanceof Rectangle) sumRectArea = sumRectArea+sh.caclArea();
            if (sh instanceof Circle) sumCircleArea  = sumCircleArea  + sh.caclArea();
            if (sh instanceof Triangle) sumTriangleArea = sumTriangleArea + sh.caclArea();
        }

        System.out.println("ALl Areas sum is: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);
    }


}
