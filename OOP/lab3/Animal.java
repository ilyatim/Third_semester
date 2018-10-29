package lab3;
import java.lang.System;
public abstract class Animal
{
    private boolean isVegetarian;
    private int growth;
    private int weight;
    private int num_of_leg;
    private String name;

    public Animal(String _name, boolean vegetarian, int _growth, int _weight, int number)
    {
        this.name = _name;
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
    public String getName()
    {
        return name;
    }
    public abstract String getKind();
}

class Cat extends Animal
{
    private boolean is_satiety;
    public Cat(String _name, boolean veg, int _growth, int _weight)
    {
        super(_name, veg, _growth, _weight, 4);
        this.is_satiety = false;
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
    public String getKind()
    {
        String type = "Cat";
        return type;
    }
}

class  Dog extends Animal
{
    private boolean is_caress;
    private boolean is_walking;
    public Dog(String _name, int _growth, int _weight)
    {
        super(_name,true, _growth, _weight, 4);
        this.is_caress = false;
        this.is_walking = false;
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
    public void menu()
    {
        System.out.println("1 - to pat u're dog");
        System.out.println("2 - to walk with u're dog");
        System.out.println("3 - take an interest is the dog walking?");
        System.out.println("4 - to know the name");
        System.out.println("5 - to know the weight and growth");
    }
    public String getKind()
    {
        String type = "Dog";
        return type;
    }
}

class Snake extends Animal
{
    private boolean is_domesticate;
    public Snake(String _name, boolean veg, int _growth, int _weight)
    {
        super(_name, veg, _growth, _weight, 0);
        this.is_domesticate = false;
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
    public String getKind()
    {
        String type = "Snake";
        return type;
    }
}