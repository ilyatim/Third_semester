package lab1;

import java.lang.System;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class TestClass
{
    public static void main(String[] args)
    {
        task_1();
        task_2();
        task_3();
        task_4();
    }
    public static void task_1()
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int[] arr = new int[N];
        final Random random = new Random();
        for(int i = 0; i < N; i++)
        {
            arr[i] = random.nextInt(100);
        }
        int choice;
        System.out.println("enter your way(1,2 or 3)");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                for(int i = 0; i < N; i++)
                {
                    sum+= arr[i];
                }
                break;
            case 2:
                int i = 0;
                while(i < N)
                {
                    sum+= arr[i];
                    i++;
                }
                break;
            case 3:
                int j = 0;
                do
                {
                    sum+= arr[j];
                    j++;
                } while(j < N);
        }
        System.out.println("sum of array = " + sum);
        System.out.println();
    }
    public static void task_2()
    {
        int N = 11;
        for(float i = 1; i < N; i++)
        {
            System.out.print(1/i + " ");
        }
        System.out.println();
    }
    public static void task_3()
    {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        final Random random = new Random();
        for(int i = 0; i < N; i++)
        {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i = 0; i < N; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void task_4()
    {
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        int N = number + 1;
        number = 1;
        for(int i = 1; i < N; i++)
        {
            number*= i;
        }
        System.out.println(number);
    }
}
