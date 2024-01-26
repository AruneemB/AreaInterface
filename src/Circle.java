public class Circle implements Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getDimensionOne()
    {
        return radius;
    }

    public double getDimensionTwo()
    {
        return radius;
    }

    public double getArea()
    {
        return 0.01 * Math.floor(3.14 * radius * radius * 100.0);
    }
}
