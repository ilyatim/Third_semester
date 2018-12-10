package prackt_8;

/*
public class TableOrder implements Order
{
    private int size;
    private MyArrayList<MenuItem> items = new MyArrayList<>();
    @Override
    public void add(MenuItem item)
    {
        size++;
        items.add(item);
    }
    @Override
    public String[] itemsNames()
    {
        String[] order = new String[size];
        for(int i = 0; i < size; i++)
            order[i] = items.get(i).getName();
        return order;
    }
    @Override
    public int itemsQuantity()
    {
        int cost = 0;
        for(int i = 0; i < size; i++)
            cost += items.get(i).getCost();
        return cost;
    }
    @Override
    public int itemQuantity(String itemName)
    {
        return items.get(itemName).getCost();
    }
    @Override
    public int itemQuantity(MenuItem itemName)
    {
        int index = items.indexOf(itemName);
        return items.get(index).getCost();
    }
    @Override
    public MenuItem[] getItems()
    {}
    @Override
    public boolean remove(String item)
    {
        if(items.get(item) != null)
        {
            items.remove(items.get(item));
            return true;
        }
        else
            return false;
    }
    @Override
    public boolean remove(MenuItem item)
    {
        if(items.get(item) != null)
        {
            items.remove(item);
            return true;
        }
        else
            return false;

    }
    @Override
    public int removeAll(String itemName)
    {}
    @Override
    public int removeAll(MenuItem item)
    {}
    @Override
    public MenuItem[] sortedItemsByCostDesc()
    {}
    @Override
    public int costTotal()
    {}
    @Override
    public Customer getCustomer()
    {
       // return
    }
    @Override
    public void setCustomer(Customer customer)
    {
        
    }
}
*/
