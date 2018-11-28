package prackt_5;

public class Main
{
    public static int recursion_1(int number)
    {
        if(number == 0)
            return number;
        else
        {
            int number_1 = number % 10;
            number /= 10;
            return recursion_1(number) + number_1;
        }
    }
    public static int recursion_2(int number)
    {
        if(number == 0)
        {
            return number;
        }
        else
        {
            int number_1 = number % 10;
            number /= 10;
            System.out.print(number_1 + " ");
            return recursion_2(number);
        }
    }
    public static int recursion_3(int number_first, int number_second)
    {
        if(number_first < number_second)
        {
            System.out.print(number_first + " ");
            number_first++;
            return recursion_3(number_first, number_second);
        }
        else if(number_second < number_first)
        {
            System.out.print(number_second + " ");
            number_second--;
            if(number_second == 0)
                return 0;
            else
                return recursion_3(number_first, number_second);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println(recursion_1(722));
        recursion_2(72002);
        System.out.println();
        recursion_3(3,10);
        System.out.println();
        recursion_3(10, 5);
    }
}
