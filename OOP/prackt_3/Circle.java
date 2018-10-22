package prackt_3;

public class Circle extends Shape
{
    private double radius;
    public Circle()
    {
        this.radius = 3;
    }
    public Circle(double _radius)
    {
        super();
        this.radius = _radius;
    }
    public Circle(double _radius, String _color, boolean _filled)
    {
        super(_color, _filled);
        this.radius = _radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius_2)
    {
        this.radius = radius_2;
    }
    public double getArea()
    {
        return (3.14 * radius * radius);
    }
    public double getPerimetr()
    {
        return (3.14 * 2 * radius);
    }
    public String toString()
    {
        return "color - " + getColor() + ", filled - " + isFilled() + ", radius - " + radius;
    }
}

