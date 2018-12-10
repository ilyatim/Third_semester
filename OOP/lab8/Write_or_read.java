package lab8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Write_or_read
{
    Scanner sc = new Scanner(System.in);
    File file;
    public void write(String name)
    {
        file = new File(name);
        try(FileWriter writer = new FileWriter(file, false))
        {
            System.out.println("Enter string to write in file");
            String new_string = sc.nextLine();
            writer.write(new_string);
            writer.append("\n");
            writer.flush();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
        }

    }
    public void add(String name)
    {
        file = new File(name);

        try(FileWriter writer = new FileWriter(file, true))
        {
            System.out.println("Enter string to add in file");
            String new_string = sc.nextLine();
            writer.write(new_string + '\n');
            writer.append("\n");
            writer.flush();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
        }
    }
    public void read(String name)
    {
        file = new File(name);
        try
        {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            while(scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
            fileReader.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
        }
    }
}
