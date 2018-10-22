package prackt_3;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    public Square(double side)
    {
        super(side, side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    public double getSide()
    {
        return getLenght();
    }
    public void setSide(double side)
    {
        setWidth(side);
        setLenght(side);
    }
    public void setWidth(double side)
    {
        setWidth(side);
    }
    public void setLenght(double side)
    {
        setLenght(side);
    }
    public String toString()
    {
        return toString();
    }
}
