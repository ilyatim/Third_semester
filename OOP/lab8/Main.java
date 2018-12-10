package lab8;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 4;
        String name = null;
        System.out.println("Welcome, it's program for write or read *.txt file");
        System.out.println("enter file to write of read");
        try
        {
            name = sc.nextLine();
            System.out.println("1 - write in file\n2 - read from file\n3 - add text in file\n");
            choice = sc.nextInt();
            Write_or_read file = new Write_or_read();
            switch(choice)
            {
                case 1:
                    file.write(name);
                    break;
                case 2:
                    file.read(name);
                    break;
                case 3:
                    file.add(name);
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }

        }
        catch(Exception e)
        {
            System.out.println("ERROR");
        }

    }
}
