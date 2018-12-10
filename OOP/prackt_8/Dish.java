package prackt_8;

public class Dish extends MenuItem
{
    private final int price;
    private final String name;
    private final String description;

    public Dish(int price, String name, String description)
    {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description)
    {
        this.name = name;
        this.description = description;
        this.price = 0;
    }
    public int getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
}
