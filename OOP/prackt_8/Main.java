package prackt_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
//выводит возможности заказать еду
    public static void print_order()
    {
        System.out.println("1 - Table order");
        System.out.println("2 - Internet order");
    }
//выводит все возможные блюда
    public static void print_dish(ArrayList<Dish> menu_dish)
    {
        System.out.println("Enter dish what u want do order");
        System.out.println("U can point name of dish what u want");
    }
//выводит все возможные напитки
    public static void print_drink()
    {

    }
//формирует список блюд
    public static void menu(ArrayList<Dish> menu_dish)
    {

    }
    public static void main(String[] args)
    {
        /*ArrayList<Dish> menu_dish = new ArrayList<>();
        InternetOrdersManager internetOrdersManager;
        TableOrdersManager tableOrdersManager;
        boolean cycle = true;
        System.out.println("This is the restaurant, u can order a dish here, or via the internet");
        while(cycle)
        {
            print_order();
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    for(;;)
                    {
                        System.out.println("Hello, my name Josh, i'm u're waiter");
                        System.out.println("To continue, pls introduce yourself");
                        System.out.println("First Name:");
                        String name = sc.nextLine();
                        System.out.println("Second Name:");
                        String secName = sc.nextLine();
                        System.out.println("Age:");
                        int age = sc.nextInt();
                        print_dish(menu_dish);
                        print_drink();
                        System.out.println("если вы хотите заказать только блюдо или только выпивку, укажите в параметр того" +
                                "что не хотите заказывать null");
                        String dish = sc.nextLine();
                        for(int i = 0; i < menu_dish.size(); i++)
                            if(dish != null || menu_dish.get(i).getName() == dish)
                    }
                    break;
                case 2:
                    break;
                default:
                    cycle = false;
                    break;
            }*/
    }
}
