package prackt_8;

public class Drink extends MenuItem implements Alcoholable
{
    private final int price;
    private final String name;
    private final String description;

    public Drink(int price, String name, String description)
    {
        this.price = price;
        this.description = description;
        this.name = name;
    }
    public Drink(String name, String description)
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
    public boolean isAlcoholicDrink()
    {
        return true;
    }
    public double getAlcoholVol()
    {
        return 1;
    }
    public DrinkTypeEnum getType()
    {
        return DrinkTypeEnum.BEER;
    }
}
