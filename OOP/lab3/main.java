package lab3;

import java.lang.System;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.String;

public class main
{
    private static Scanner sc = new Scanner(System.in);
    public static void list()
    {
        System.out.println("enter u're choice");
        System.out.println("1 - to add animal");
        System.out.println("2 - to delete animal");
        System.out.println("3 - to exchange animal");
        System.out.println("4 - to do something with u're animal");
        System.out.println("5 - to exit");
    }

    public static void main(String[] args)
    {
        HashMap<Integer, Animal> reg_of_animal = new HashMap<>();
        for(;;)
        {
            boolean my = true;
            list();
            int i = 1;
            int choice_1 = sc.nextInt();
            switch(choice_1)
            {
                case 1:
                {
                    System.out.println("what animal u want?");
                    System.out.println("1 - Dog, 2 - Cat, 3 - Snake");
                    int choice_2 = sc.nextInt();
                    switch(choice_2)
                    {
                        case 1:
                        {
                            System.out.println("how u named u're dog?");
                            String name = sc.next();
                            System.out.println("enter weight and growth");
                            int weight = sc.nextInt();
                            int growth = sc.nextInt();
                            reg_of_animal.put(i, new Dog(name, weight, growth));
                            System.out.println("number of u're dog - " + i);
                            i++;
                            break;
                        }
                        case 2:
                        {
                            System.out.println("how u named u're cat?");
                            String name = sc.nextLine();
                            System.out.println("enter weight and growth");
                            int weight = sc.nextInt();
                            int growth = sc.nextInt();
                            System.out.println("is it vegetarian? true of false");
                            boolean vegetarian = sc.nextBoolean();
                            reg_of_animal.put(i, new Cat(name, vegetarian, weight, growth));
                            System.out.println("number of u're cat - " + i);
                            i++;
                            break;
                        }
                        case 3:
                        {
                            System.out.println("how u named u're snake?");
                            String name = sc.nextLine();
                            System.out.println("enter weight and growth");
                            int weight = sc.nextInt();
                            int growth = sc.nextInt();
                            System.out.println("is it vegetarian? true of false");
                            boolean vegetarin = sc.nextBoolean();
                            reg_of_animal.put(i, new Snake(name, vegetarin, weight, growth));
                            System.out.println("number of u're snake - " + i);
                            i++;
                            break;
                        }
                        default:
                        {
                            break;
                        }

                    }
                    break;
                }
                case 2:
                {
                    System.out.println("list of all animal");
                    for(HashMap.Entry < Integer, Animal> pair : reg_of_animal.entrySet())
                    {
                        System.out.println(pair.getKey() + " : " + pair.getValue().getName() + " : the " + pair.getValue().getKind());
                    }
                    System.out.println("what animal u want to del?");
                    int number = sc.nextInt();
                    reg_of_animal.remove(number);
                    break;
                }
                case 3:
                {
                    System.out.println("enter number if animal what u exchange");
                    int number = sc.nextInt();

                    break;
                }
                case 4:
                {
                    System.out.println("list of all animal");
                    for(HashMap.Entry < Integer, Animal> pair : reg_of_animal.entrySet())
                    {
                        System.out.println(pair.getKey() + " : " + pair.getValue().getName() + " : the " + pair.getValue().getKind());
                    }
                    System.out.println("what u can do with u're animal");
                    break;
                }
                default:
                {
                    my = false;
                    break;
                }
            }
            if(!my)
                break;
        }
        /*Cat cat = new Cat(false, 15, 4, 4, false);
        cat.is_the_cat_fed();
        cat.feed_the_cat();
        Dog dog = new Dog(false, 30, 10, 4, false, false);
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
                + snake.getGrowth() + ", number of leg - " + snake.getNum_of_leg() + ", weight - " + snake.getWeight());*/
    }
}
