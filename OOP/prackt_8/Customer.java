package prackt_8;

public class Customer
{
    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    private final Customer MATURE_UNKNOWN_CUSTOMER = null;
    private final Customer NOT_MATURE_UNKNOWN_CUSTOMER = null;
    public Customer(String firstName, String secondName, int age, Address address)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getSecondName()
    {
        return secondName;
    }
    public int getAge()
    {
        return age;
    }
    public Address getAddress()
    {
        return address;
    }

}
