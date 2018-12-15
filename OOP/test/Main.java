package test;

public class Main
{
    public static void main(String[] args)
    {
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++)
            array[i] = i;
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]);


        for(int i = 0; i < array.length - 1; i++)
            for(int j = 0; j < array.length - 1; j++)
            {
                if(array[j] < array[j + 1])
                {
                    int item = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = item;
                }
            }
        System.out.println();
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }

}
