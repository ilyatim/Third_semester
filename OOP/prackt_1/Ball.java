public class Ball
{
    private int weight;
    private String color;
    private String type;

    public Ball(int weight_1, String color_1, String type_1)
    {
        weight = weight_1;
        color = color_1;
        type = type_1;
    }
    public Ball(int weight_1)
    {
        weight = weight_1;
        color = "blue";
        type = "BASKETBALL";
    }
    public Ball(String color_1)
    {
        weight = 1;
        color = color_1;
        type = "BASKETBALL";
    }

    public Ball(int weight_1, String color_1)
    {
        weight = weight_1;
        color = color_1;
        type = "BASKETBALL";
    }

    public Ball(String color_1, String type_1)
    {
        weight = 1;
        color = color_1;
        type = type_1;
    }
    public Ball()
    {
        weight = 1;
        color = "blue";
        type = "BASKETBALL";
    }

    public void setWeight(int weight_1)
    {
        weight = weight_1;
    }
    public void setColor(String color_1)
    {
        color = color_1;
    }
    public void setType(String type_1)
    {
        type = type_1;
    }
    public int getWeight()
    {
        return weight;
    }
    public String getColor()
    {
        return color;
    }
    public String getType()
    {
        return type;
    }

    public void repaint(String color_1)
    {
        color = color_1;
    }
    public void pump()
    {
        weight+=1;
    }
    public String toString()
    {
        return "Weight = " + this.weight + ", type = " + this.type + ", Color = " + this.color;
    }
};
