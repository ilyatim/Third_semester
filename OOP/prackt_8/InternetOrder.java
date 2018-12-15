package prackt_8;

import java.awt.*;


public class InternetOrder implements Order
{
    private Customer customer; // customer of order
    private int size; // number of element in array
    private MenuItem[] items; // array of orders
    private final int SIZE_OF_PRIMARY = 8; // the primary size of the array if it is not specified by the user

    public InternetOrder()
    {
        this.customer = null;
        this.size = 0;
        this.items = new MenuItem[SIZE_OF_PRIMARY];
    }
    public InternetOrder(Customer customer, MenuItem[] items)
    {
        this.customer = customer;
        this.size = items.length;
        this.items = items;

    }

    private void sort(MenuItem[] items)
    {
        for(int i = 0; i < size - 1; i++)
            for(int j = 0; j < size - 1; j++)
            {
                if(items[j].getPrice() < items[j + 1].getPrice())
                {
                    MenuItem item = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = item;
                }
            }
    }
    private void resize(int new_lenght)
    {
        MenuItem[] new_array = new MenuItem[new_lenght];
        System.arraycopy(items, 0, new_array, 0, size);
        items = new_array;
    }

    @Override
    public MenuItem get(int index)
    {
        return items[index];
    }
    // add item in array
    @Override
    public boolean add(MenuItem item)
    {
        if(size == items.length - 1)
            resize(items.length * 2);
        if(size < items.length)
        {
            items[size] = item;
            size++;
            return true;
        }
        return false;
    }
    // returns name of all orders
    @Override
    public String[] itemsNames()
    {
        String[] names = new String[size];
        for(int i = 0; i < size; i++)
            names[i] = items[i].getName();
        return names;
    }
    // number of element in array of order
    @Override
    public int itemsQuantity()
    {
        return size;
    }
    // returns the number of elements with the given name
    @Override
    public int itemQuantity(String itemName)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            if(items[i].getName() == itemName)
                count++;
        return count;
    }
    // returns the number of elements with the given name
    @Override
    public int itemQuantity(MenuItem itemName)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            if(items[i] == itemName)
                count++;
        return count;
    }
    // returns all order
    @Override
    public MenuItem[] getItems()
    {
        return items;
    }
    // remove item with given name
    @Override
    public boolean remove(String item)
    {
        for(int i = 0; i < size; i++)
            if(items[i].getName() == item)
            {
                for(int j = i; j < size; j++)
                    items[j] = items[j + 1];
                items[size] = null;
                size--;
                return true;
            }
        return false;
    }
    // remove the selected item. if there are more than 1, delete the first
    @Override
    public boolean remove(MenuItem item)
    {
        for(int i = 0; i < size; i++)
            if(items[i] == item)
            {
                for(int j = i; j < size; j++)
                    items[j] = items[j + 1];
                items[size] = null;
                size--;
                return true;
            }
        return false;
    }
    // remove few element with selected name
    @Override
    public int removeFew(String itemName)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            if(items[i].getName() == itemName)
            {
                for(int j = i; j < size; j++)
                    items[j] = items[j + 1];
                items[size] = null;
                size--;
                count++;
            }
        return count;
    }
    // remove few element with selected name
    @Override
    public int removeFew(MenuItem item)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            if(items[i] == item)
            {
                for(int j = i; j < size; j++)
                    items[j] = items[j + 1];
                items[size] = null;
                size--;
                count++;
            }
        return count;
    }
    // sort the array by price decrease
    @Override
    public MenuItem[] sortedItemsByCostDesc()
    {
        sort(items);
        return items;
    }
    // returns total cost of order
    @Override
    public int costTotal()
    {
        int total = 0;
        for(int i = 0; i < size; i++)
            total += items[i].getPrice();
        return total;
    }
    // getCustomer
    @Override
    public Customer getCustomer()
    {
        return customer;
    }
    //setCustomer
    @Override
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public String toString()
    {
        String result = "Table order:" + size + '\n';
        for(int i = 0; i < size; i++)
            result += items[i].toString() + '\n';
        return result;
    }
    // compare objects
    @Override
    public boolean equals(Object object)
    {
        if(object == null || object.getClass() != this.getClass())
            return false;
        if(object == this)
            return true;
        else
            return false;
    }
    // hash code of u're object
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 9;
        result = prime * result + customer.hashCode();
        result = prime * result + SIZE_OF_PRIMARY;
        result = prime * result + items.hashCode();
        result = prime * result + size;
        return result;
    }
}

