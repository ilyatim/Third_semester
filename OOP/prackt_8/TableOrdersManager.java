package prackt_8;

import java.awt.*;

public class TableOrdersManager implements OrderManager
{
    private Order[] orders; // array of orders
    private int size; // number of orders in array

    public TableOrdersManager(int size)
    {
        this.size = size;
        orders = new Order[size];
    }
    // func to resize the array
    private void resize(int new_lenght)
    {
        Order[] new_array = new Order[new_lenght];
        System.arraycopy(orders, 0, new_array, 0, size);
        orders = new_array;
    }
    //add order to table. Receives number of table and order
    public void add(Order order, int tableNumber)
    {
        if(tableNumber > size)
            resize(orders.length * 2);
        orders[tableNumber] = order;
    }
    // add order to table. Receives the dish and table number
    public void add(MenuItem item, int tableNumber)
    {
        orders[tableNumber].add(item);
    }
    //return first free table
    public int freeTableNumber()
    {
        for(int i = 0; i < size; i++)
            if(orders[i] == null)
                return i;
        return -1;
    }
    //return all free table
    public int[] freeTableNumbers()
    {
        int[] tables = new int[size];
        int count = 0;
        for(int i = 0; i < size; i++)
            if(orders[i] == null)
            {
                tables[count] = i;
                count++;
            }
        return tables;
    }
    // return order by order number
    public Order getOrder(int tableNumber)
    {
        return orders[tableNumber];
    }
    // removes the order by table number
    public void remove(int tableNumber)
    {
        for(int j = tableNumber; j < size; j++)
            orders[j] = orders[j + 1];
        orders[size] = null;
        size--;
    }
    // removes the order by order number
    public int remove(Order order)
    {
        for(int i = 0; i < size; i++)
            if(orders[i] == order)
            {
                for(int k = i; k < size; k++)
                    orders[k] = orders[k + 1];
                orders[size] = null;
                size--;
                return i;
            }
        return -1;

    }
    // removes all matches from the specified order
    public int removeAll(Order order)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            if(orders[i] == order)
            {
                for(int k = i; k < size; k++)
                    orders[k] = orders[k + 1];
                orders[size] = null;
                size--;
            }
        if(count == 0)
            return -1;
        return count;
    }
    // returns numbers of ordering dish. Receive name of order
    @Override
    public int itemsQuantity(String name)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(orders[i].get(j).getName() == name)
                    count++;
        return count;
    }
    // returns numbers of ordering dish. Receive object of order (dish or drink)
    @Override
    public int itemsQuantity(MenuItem item)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(orders[i].get(j) == item)
                    count++;
        return count;
    }
    @Override
    public Order[] getOrder()
    {
        return orders;
    }
    // returns total cost of all orders
    @Override
    public int ordersCostSummary()
    {
        int total = 0;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                total += orders[i].get(j).getPrice();
        return total;
    }

    @Override
    public int ordersQuantity()
    {
        return size;
    }
    // override method "toString"
    @Override
    public String toString()
    {
        String result = "Table order:" + size + '\n';
        //for(int i = 0; i < size; i++)
            //result += orders[i]. + ":" + orders[i].getCustomer();
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
        int result = 1;
        result = prime * result + orders.hashCode();
        result = prime * result + size;
        return result;
    }
}
