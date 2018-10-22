package prackt_2;

public class Author
{
    private String name;
    private String email;
    private char gender;

    Author(String _name, String _email, char sex)
    {
        this.name = _name;
        this.email = _email;
        this.gender = sex;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }public char getGender()
    {
        return gender;
    }
    public void setEmail(String new_email)
    {
        this.email = new_email;
    }
    public String toString()
    {
        return "name - " + name + "(" + gender + "), at email - " + email;
    }
}
