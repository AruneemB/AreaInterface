public class Rectangle implements Shape
{
    double length;
    double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getDimensionOne()
    {
        return length;
    }

    public double getDimensionTwo()
    {
        return width;
    }

    public double getArea()
    {
        return 0.01 * Math.floor(length * width * 100.0);
    }
}
