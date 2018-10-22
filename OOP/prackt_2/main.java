package prackt_2;
import java.lang.System;
import java.util.Scanner;
import java.lang.String;

public class main
{
    public static void main(String[] args)
    {
        String email;
        String name;
        char gender;
        int counter;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of author and his email");
        name = sc.nextLine();
        char c = '@';
        for(;;)
        {
            email = sc.nextLine();
            counter = 0;
            for(int i = 0; i < email.length(); i++)
            {
                if( email.charAt(i) == c )
                    counter++;
            }
            if(counter == 1)
            {
                System.out.println("good e-mail");
                break;
            }
            else

                System.out.println("wrong e-mail, unacceptable symbol");
        }
        System.out.println("enter gender of author");
        for(;;)
        {
            gender = sc.next().charAt(0);
            if(gender == 'm' || gender == 'w' || gender == 'u')
                break;
            else
                System.out.println("wrong gender");
        }
        Author author_1 = new Author(name, email, gender);
        System.out.println(author_1.toString());
    }
}
