import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task12
        System.out.println("Task12");
        System.out.println("Subtask3");
        Rectangle rect1 = new Rectangle("RED", 11, 53);
        Rectangle rect2 = new Rectangle("RED", 1, 5);

        System.out.println(rect1.compareTo(rect2));

        Rectangle[] arr2 = new Rectangle[6];
        arr2[0] = new Rectangle("RED", 11, 53);
        arr2[1] = new Rectangle("Yellow", 5, 37);
        arr2[2] = new Rectangle("BLue", 2, 4);
        arr2[3] = new Rectangle("Pink", 100, 56);
        arr2[4] = new Rectangle("White", 100, 5);
        arr2[5] = new Rectangle("RED", 11, 10);
        Arrays.sort(arr2);
        for (Rectangle rect : arr2) {
            rect.draw();
        }
        System.out.println("Subtask4");
        Shape[] arr3 = new Shape[10];
        arr3[0] = new Rectangle("RED", 11, 53);
        arr3[1] = new Rectangle("Yellow", 5, 37);
        arr3[2] = new Rectangle("BLue", 2, 4);
        arr3[3] = new Rectangle("Pink", 100, 56);
        arr3[4] = new Rectangle("White", 45, 1);
        arr3[5] = new Circle("GREEN", 22);
        arr3[6] = new Circle("Orange", 55);
        arr3[7] = new Triangle("BLACK", 5, 5, 5);
        arr3[8] = new Triangle("Brown", 3, 3, 3);
        arr3[9] = new Triangle("Brown", 3, 3, 3);

        Arrays.sort(arr3, new Circle("RED", 2));
        for (Shape sh : arr3) {
            sh.draw();

        }

        System.out.println("Subtask2");

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
        double sumCircleArea = 0;
        double sumTriangleArea = 0;

        for (Shape sh : arr) {
            sh.draw();
            sumArea = sumArea + sh.caclArea();
            if (sh instanceof Rectangle) sumRectArea = sumRectArea + sh.caclArea();
            if (sh instanceof Circle) sumCircleArea = sumCircleArea + sh.caclArea();
            if (sh instanceof Triangle) sumTriangleArea = sumTriangleArea + sh.caclArea();
        }

        System.out.println("ALl Areas sum is: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);
    }


}
