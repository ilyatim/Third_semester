package prackt_6;

public class Student
{
    private int id;
    private String name;
    private int age;
    public Student(int _id, String _name, int _age)
    {
        this.id = _id;
        this.name = _name;
        this.age = _age;
    }
    public int getId()
    {
        return id;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
    public void setId(int number)
    {
        this.id = number;
    }
}
