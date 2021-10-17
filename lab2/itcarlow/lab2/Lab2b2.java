package itcarlow.lab2;

public class Lab2b2 {

    public static void main(String[] args) {
        Rectangle rectangles = new Rectangle();

        System.out.println("the width of the rectangle is " + rectangles.getWidth());
        System.out.println("the length of the rectangle is " + rectangles.getLength());
        System.out.println("the area of the rectangle is " + rectangles.getArea());
        System.out.println("the perimeter of the rectangle is " + rectangles.getPerimeter());
        System.out.println("the shapes are " + rectangles.printRectangle());

    }
}