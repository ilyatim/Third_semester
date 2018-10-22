package lab2;

public class Square
{
    private double side_first;
    private double side_second;
    private double perimetr;
    private double area;

    public Square(double side_1, double side_2)
    {
        this.side_first = side_1;
        this.side_second = side_2;
        this.perimetr = (side_1 + side_2) * 2;
        this.area = side_1 * side_2;
    }
    public void setSide_first(double side_1)
    {
        this.side_first = side_1;
    }
    public void setSide_second(double side_2)
    {
        this.side_second = side_2;
    }

    public double getArea()
    {
        return area;
    }

    public double getPerimetr()
    {
        return perimetr;
    }

    public double getSide_first()
    {
        return side_first;
    }

    public double getSide_second()
    {
        return side_second;
    }
    public String toString()
    {
        return "side 1 = " + side_first + ", side 2 = " + side_second + ", perimetr = " + perimetr + ", area = " + area;
    }
};
