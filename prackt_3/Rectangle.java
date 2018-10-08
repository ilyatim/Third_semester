package prackt_3;

public class Rectangle extends Shape
{
    private double width;
    private double lenght;
    public Rectangle()
    {
        super();
        this.width = 1;
        this.lenght = 1;
    }
    public Rectangle(double _wigth, double _lenght)
    {
        super();
        this.width = _wigth;
        this.lenght = _lenght;
    }
    public Rectangle(double _wigth, double _lenght, String _color, boolean _filled)
    {
        super(_color, _filled);
        this.width = _wigth;
        this.lenght = _lenght;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLenght()
    {
        return lenght;
    }
    public void setWidth(double _width)
    {
        this.width = _width;
    }
    public void setLenght(double _lenght)
    {
        this.lenght = _lenght;
    }

    public double getArea()
    {
        return (width * lenght);
    }
    public double getPerimetr()
    {
        return ((width + lenght) * 2);
    }
    public String toString()
    {
        return "color - " + getColor() + ", filled - " + isFilled() + ", wigth - " + width + ", lenght - " + lenght;
    }
}
