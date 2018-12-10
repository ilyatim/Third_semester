package prackt_7;

import java.util.ArrayDeque;

public class Player
{
    private ArrayDeque<Card> list_of_cards = new ArrayDeque<>();

    public void addCard(int priority, String suit)
    {
        list_of_cards.add(new Card(priority,suit));
    }
    public int getFirst()
    {
        return list_of_cards.getFirst().getPriority();
    }
    public String getFirsSuit()
    {
        return list_of_cards.getFirst().getSuit();
    }
    public void AddTwoCard(int priority_1, String suit_1, int priority_2, String suit_2)
    {
        list_of_cards.poll();
        list_of_cards.addLast(new Card(priority_1, suit_1));
        list_of_cards.addLast(new Card(priority_2, suit_2));
    }
    public void removeFirst()
    {
        list_of_cards.remove();
    }
    public void removeAndAdd()
    {
        list_of_cards.addLast(list_of_cards.pollFirst());
        list_of_cards.remove();
    }
    public int size()
    {
        return list_of_cards.size();
    }
}
