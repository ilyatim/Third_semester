package prackt_7;

public class Card
{
    private int priority;
    private String suit;

    public Card(int _priority, String _suit)
    {
        this.priority = _priority;
        this.suit = _suit;
    }
    public int getPriority()
    {
        return priority;
    }
    public String getSuit()
    {
        return suit;
    }
}
