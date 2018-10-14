package prackt_3;
import java.lang.System;
import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        Shape square_1 = new Square(side);
        System.out.println(square_1.getColor());
        System.out.println(square_1.getPerimetr());
        System.out.println(square_1.isFilled());
        String color = sc.next();
        square_1.setColor(color);
        System.out.println(square_1.getColor());

        Rectangle rectangle_1 = (Rectangle)square_1;
        System.out.println(rectangle_1.getLenght());
        System.out.println(rectangle_1.getWidth());
        System.out.println(rectangle_1.getColor());
        System.out.println(rectangle_1.getPerimetr());
        System.out.println(rectangle_1.isFilled());

        Square square_2 = (Square) rectangle_1;
        System.out.println(square_2.getSide());
        System.out.println(square_2.getColor());
        System.out.println(square_2.getPerimetr());
        System.out.println(square_2.isFilled());

        Shape circle_1 = new Circle();
        System.out.println(circle_1.getColor());
        System.out.println(circle_1.getPerimetr());
        System.out.println(circle_1.isFilled());

        Circle circle_2 = (Circle)circle_1;
        System.out.println(circle_2.getColor());
        System.out.println(circle_2.getPerimetr());
        System.out.println(circle_2.isFilled());
        System.out.println(circle_2.getRadius());
    }
}
