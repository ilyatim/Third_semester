package lab7;

import java.util.Iterator;

public class MyArrayList<T> implements Iterator<Object>
{
    private final int CUT = 4;
    private final int SIZE_OF_PRIMARY = 8;
    private Object[] array = new Object[SIZE_OF_PRIMARY];
    private int elements_in_array = 0;
    public int currentElement = 0;

    private void resize(int new_lenght)
    {
        Object[] new_array = new Object[new_lenght];
        System.arraycopy(array, 0, new_array, 0, elements_in_array);
        array = new_array;
    }
    public void add(T new_item)
    {
        if(elements_in_array == array.length - 1)
            resize(array.length * 2);
        array[elements_in_array] = new_item;
        elements_in_array++;
    }

    public T get(int index_of_item)
    {
        return (T)array[index_of_item];
    }
    public int size()
    {
        return elements_in_array;
    }

    public void remove(int index_of_item)
    {
        for(int i = index_of_item; i < elements_in_array; i++)
            array[i] = array[i + 1];
        array[elements_in_array] = null;
        elements_in_array--;
        if(elements_in_array < array.length / CUT && elements_in_array > SIZE_OF_PRIMARY)
            resize(array.length / 2);
    }
    @Override
    public boolean hasNext()
    {
        return currentElement < elements_in_array;
    }
    @Override
    public T next()
    {
        return (T)array[currentElement ++];
    }

}
