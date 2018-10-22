package prackt_3;

public abstract class Shape
{
    private String color;
    private boolean filled;
    public Shape()
    {
        this.color = "Red";
        this.filled = true;
    }
    public Shape(String _color, boolean _filled)
    {
        this.color = _color;
        this.filled = _filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String _color)
    {
        this.color = _color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean _filled)
    {
        this.filled = _filled;
    }
    abstract double getArea();
    abstract double getPerimetr();
    public String toString()
    {
        return "color - " + color + ", filled - " + filled;
    }
}
