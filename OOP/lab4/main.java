package lab4;
import java.lang.System;
import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name_1 = sc.nextLine();
        String name_2 = sc.nextLine();
        String name_3 = sc.nextLine();
        Nameable nameable = new Car(name_1);
        nameable.getName();
        nameable = new Dog(name_2);
        nameable.getName();
        nameable = new Human(name_3);
        nameable.getName();
    }
    interface Nameable
    {
        void getName();
    }

    public static class Car implements Nameable
    {
        private String name;

        Car(String _name)
        {
            this.name = _name;
        }
        public void getName()
        {
            System.out.println(name);
        }
    }
    public static class Dog implements Nameable
    {
        private String name;

        Dog(String _name)
        {
            this.name = _name;
        }
        public void getName()
        {
            System.out.println(name);
        }
    }
    public static class Human implements Nameable
    {
        private String name;

        Human(String _name)
        {
            this.name = _name;
        }
        public void getName()
        {
            System.out.println(name);
        }
    }
}

