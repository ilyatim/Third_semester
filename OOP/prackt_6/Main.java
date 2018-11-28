package prackt_6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void sort(ArrayList<Student> list)
    {
        for(int i = 0; i < list.size(); i++)
            if(i < list.size() - 1)
                if(list.get(i).getId() > list.get(i + 1).getId())
                {
                    Student student = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, student);
                    i = -1;
                }
    }
    public static void main(String[] args)
    {
        int numbers = 0;
        System.out.println("how many students u want to be");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList();
        try
        {
            numbers = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("wrong data");
        }
        for(int i = 0; i < numbers; i++)
        {
            System.out.println("enter Name, Age and ID of student");
            try
            {
                String name = sc.next();
                int age = sc.nextInt();
                int id = sc.nextInt();
                Student student = new Student(id, name, age);
                list.add(student);
            }
            catch(InputMismatchException e)
            {
                System.out.println("wrong data");
            }
        }
        sort(list);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println("students number - " + (i + 1));
            System.out.println("Name - " + list.get(i).getName() + "\nAge - " + list.get(i).getAge() + "\nID - " + list.get(i).getId());;
        }
    }
}
