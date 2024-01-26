import java.util.*;
public class CalculateArea
{
    public CalculateArea()
    {
        Random r = new Random();


        Shape rectangle = new Rectangle(0.01 * Math.floor(0 + (100) * r.nextDouble() * 100.0), 0.01 * Math.floor(0 + (100) * r.nextDouble() * 100.0));
        Shape circle = new Circle(0.01 * Math.floor(0 + (100) * r.nextDouble() * 100.0));

        System.out.println("Rectangle of length " + rectangle.getDimensionOne() + " and width " + rectangle.getDimensionTwo());
        System.out.println("----------");
        printArea(rectangle);
        System.out.println("Circle of radius " + circle.getDimensionOne());
        System.out.println("------");
        printArea(circle);
    }

    // prints the area of the given shape
    public void printArea(Shape shape)
    {
        System.out.println("Area = " + shape.getArea() + "\n");
    }

    public static void main(String[] args)
    {
        CalculateArea app = new CalculateArea();
    }
}
