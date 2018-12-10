package prackt_7;

import java.util.*;

public class Game
{

    public Player player_1 = new Player();
    public Player player_2 = new Player();
    private ArrayList<Card> list = new ArrayList<>();
    private Random random = new Random();
    public Game()
    {
        start();
        play();
    }
    private void start()
    {
        for(int i = 0; i < 9; i++)
        {
            list.add(new Card(i, "heart"));
            list.add(new Card(i, "diamond"));
            list.add(new Card(i, "club"));
            list.add(new Card(i, "spade"));
        }
        int card_for_list;
        int size = 36;
        for(int i = 0; i < 18; i++)
        {
            card_for_list = random.nextInt(size);
            player_1.addCard(list.get(card_for_list).getPriority(), list.get(card_for_list).getSuit());
            list.remove(card_for_list);
            size--;
            card_for_list = random.nextInt(size);
            player_2.addCard(list.get(card_for_list).getPriority(), list.get(card_for_list).getSuit());
            list.remove(card_for_list);
            size--;
        }
    }
    private void play()
    {
        int count = 0;

        for(int i = 0; i < 108; i++)
        {
            if(player_1.size() != 0 && player_2.size() != 0)
                check();
            else
                break;
            count++;
        }
        if(count == 108)
            System.out.println("this is bad - draw");
        else if(player_2.size() == 0)
            System.out.println("player 1 win for - " + count);
        else if(player_1.size() == 0)
            System.out.println("player 2 win for - " + count);
    }
    private void check()
    {
        if((player_1.getFirst() < player_2.getFirst())
                && (player_1.getFirst() != 0)
                && (player_2.getFirst() != 8))
        {
            player_2.AddTwoCard(player_1.getFirst(), player_1.getFirsSuit(), player_2.getFirst(), player_2.getFirsSuit());
            player_1.removeFirst();
        }
        else if((player_2.getFirst() < player_1.getFirst())
                && (player_2.getFirst() != 0)
                && (player_1.getFirst() != 8))
        {
            player_1.AddTwoCard(player_2.getFirst(), player_2.getFirsSuit(), player_1.getFirst(), player_1.getFirsSuit());
            player_2.removeFirst();
        }
        else if((player_1.getFirst() == 0)
                && (player_2.getFirst() == 8))
        {
            player_1.AddTwoCard(player_1.getFirst(), player_1.getFirsSuit(), player_2.getFirst(), player_2.getFirsSuit());
            player_2.removeFirst();
        }
        else if((player_2.getFirst() == 0)
                && (player_1.getFirst() == 8))
        {
            player_2.AddTwoCard(player_2.getFirst(), player_2.getFirsSuit(), player_1.getFirst(), player_1.getFirsSuit());
            player_1.removeFirst();
        }
        else if(player_2.getFirst() == player_1.getFirst())
        {
            player_1.removeAndAdd();
            player_2.removeAndAdd();
        }
        else if(player_1.getFirst() < player_2.getFirst())
        {
            player_2.AddTwoCard(player_2.getFirst(), player_2.getFirsSuit(), player_1.getFirst(), player_1.getFirsSuit());
            player_1.removeFirst();
        }
        else if(player_2.getFirst() < player_1.getFirst())
        {
            player_1.AddTwoCard(player_1.getFirst(), player_1.getFirsSuit(), player_2.getFirst(), player_2.getFirsSuit());
            player_2.removeFirst();
        }

    }
}

