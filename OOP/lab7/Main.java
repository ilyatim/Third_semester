package lab7;

import java.lang.System.*;
public class Main
{
    public static void main(String[] args)
    {
        MyArrayList<Integer> array = new MyArrayList<>();
        System.out.println(array.size());
        int j = 0;
        for(int i = 0; i < 10; i++, j++)
            array.add(j);
        System.out.println(array.size());
        array.remove(10);
        System.out.println(array.get(359));
        while(array.hasNext())
        {
            System.out.println(array.next());
        }
    }
}
