package lab3;
import java.lang.System;
import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(false, 15, 4, 4, false);
        cat.is_the_cat_fed();
        cat.feed_the_cat();
        Dog dog = new Dog(false, 30, 10,4 ,false, false);
        dog.is_the_dog_walking();
        dog.walk();
        dog.pat();
        Snake snake = new Snake(false, 5, 21, "Josh", false);
        System.out.println(snake.getName());
        snake.is_domesticate();
        snake.tame();
        snake.is_domesticate();
        System.out.println("Dog: ");
        System.out.println("vegetarian - " + dog.getIsVegetarian() + ", growth - "
                + dog.getGrowth() + ", number of leg - " + dog.getNum_of_leg() + ", weight - " + dog.getWeight());
        System.out.println("Cat: ");
        System.out.println("vegetarian - " + cat.getIsVegetarian() + ", growth - "
                + cat.getGrowth() + ", number of leg - " + cat.getNum_of_leg() + ", weight - " + cat.getWeight());
        System.out.println("Snake: ");
        System.out.println("vegetarian - " + snake.getIsVegetarian() + ", growth - "
                + snake.getGrowth() + ", number of leg - " + snake.getNum_of_leg() + ", weight - " + snake.getWeight());
    }
}
