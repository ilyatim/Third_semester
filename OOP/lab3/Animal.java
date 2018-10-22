package lab3;
import java.lang.System;
public abstract class Animal
{
    private boolean isVegetarian;
    private int growth;
    private int weight;
    private int num_of_leg;

    public Animal(boolean vegetarian, int _growth, int _weight, int number)
    {
        this.isVegetarian = vegetarian;
        this.growth = _growth;
        this.weight = _weight;
        this.num_of_leg = number;
    }
    public void setVegetarian(boolean vegetarian)
    {
        this.isVegetarian = vegetarian;
    }
    public boolean getIsVegetarian()
    {
        return isVegetarian;
    }
    public void setGrowth(int _growth)
    {
        this.growth = _growth;
    }
    public int getGrowth()
    {
        return growth;
    }
    public void setWeight(int _weight)
    {
        this.weight = _weight;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setNum_of_leg(int number)
    {
        this.num_of_leg = number;
    }
    public int getNum_of_leg()
    {
        return num_of_leg;
    }
}

class Cat extends Animal
{
    private boolean is_satiety;
    public Cat(boolean veg, int _growth, int _weight, int number)
    {
        super(veg, _growth, _weight, number);
        this.is_satiety = false;
    }
    public Cat(boolean veg, int _growth, int _weight, int number, boolean satiety)
    {
        super(veg, _growth, _weight, number);
        this.is_satiety = satiety;
    }
    public void feed_the_cat()
    {
        this.is_satiety = true;
        System.out.println("cat happy");
    }
    public void is_the_cat_fed()
    {
        if(is_satiety)
            System.out.println("cat fed");
        else
            System.out.println("the cat is not fed. Pls, fed the cat");
    }
}

class  Dog extends Animal
{
    private boolean is_caress;
    private boolean is_walking;
    public Dog(boolean veg, int _growth, int _weight, int number)
    {
        super(veg, _growth, _weight, number);
        this.is_caress = false;
        this.is_walking = false;
    }
    public Dog(boolean veg, int _growth, int _weight, int number, boolean affection, boolean walk)
    {
        super(veg, _growth, _weight, number);
        this.is_caress = affection;
        this.is_walking = walk;
    }
    public void pat()
    {
        this.is_caress = true;
        System.out.println("dog happy");
    }
    public void walk()
    {
        this.is_walking = true;
    }
    public void is_the_dog_walking()
    {
        if(is_walking)
            System.out.println("the dog is walked already");
        else
            System.out.println("the dog want to go walk");
    }
}

class Snake extends Animal
{
    private String name;
    private boolean is_domesticate;
    public Snake(boolean veg, int _growth, int _weight)
    {
        super(veg, _growth, _weight, 0);
        this.name = "viper";
        this.is_domesticate = false;
    }
    public Snake(boolean veg, int _growth, int _weight, String _name, boolean is_pet)
    {
        super(veg, _growth, _weight, 0);
        this.name = _name;
        this.is_domesticate = is_pet;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String _name)
    {
        this.name = _name;
    }
    public boolean getis_domesticate()
    {
        return is_domesticate;
    }
    public void is_domesticate()
    {
        if(is_domesticate)
            System.out.println("snake hand, you can not be afraid");
        else
            System.out.println("snake not hand, run away, faster");
    }
    public void tame()
    {
        this.is_domesticate = true;
    }
}