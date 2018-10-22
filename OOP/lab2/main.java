package lab2;
import java.lang.System;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 side of square");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        Square square;
        square = new Square(side1, side2);
        System.out.println("choice u want to do with variable(1-5)");
        int choice = sc.nextInt();
        double side;
        switch(choice)
        {
            case 1:
                System.out.print("Area = ");
                square.getArea();
                System.out.println();
                break;
            case 2:
                System.out.print("perimetr = ");
                square.getPerimetr();
                break;
            case 3:
                System.out.print("first side = ");
                square.getSide_first();
                System.out.println();
                System.out.print("second side = ");
                square.getSide_second();
                System.out.println();
            case 4:
                System.out.print("enter new first side");
                side = sc.nextDouble();
                square.setSide_first(side);
                System.out.println();
                break;
            case 5:
                System.out.print("enter new second side");
                side = sc.nextDouble();
                square.setSide_second(side);
                System.out.println();
        }
    }
}
