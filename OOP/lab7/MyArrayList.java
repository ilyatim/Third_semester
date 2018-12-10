package lab7;

public class MyArrayList<T>
{
    private final int CUT = 4;
    private final int SIZE_OF_PRIMARY = 8;
    private Object[] array = new Object[SIZE_OF_PRIMARY];
    private int element_in_array = 0;

    private void resize(int new_lenght)
    {
        Object[] new_array = new Object[new_lenght];
        System.arraycopy(array, 0, new_array, 0, element_in_array);
        array = new_array;
    }
    public void add(T new_item)
    {
        if(element_in_array == array.length - 1)
            resize(array.length * 2);
        array[element_in_array] = new_item;
        element_in_array++;
    }
    public void remove(int index_of_item)
    {
        for(int i = index_of_item; i < element_in_array; i++)
            array[i] = array[i + 1];
        array[element_in_array] = null;
        element_in_array--;
        if(element_in_array < array.length / CUT && element_in_array > SIZE_OF_PRIMARY)
            resize(array.length / 2);
    }
    public T get(int index_of_item)
    {
        return (T)array[index_of_item];
    }
    public int size()
    {
        return element_in_array;
    }

}
