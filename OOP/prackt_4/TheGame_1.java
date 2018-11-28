package prackt_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheGame_1 extends JFrame
{
    int score_madrid, score_barcelona;
    JPanel panel_1 = new JPanel();
    JPanel panel_2 = new JPanel();
    JButton button_1 = new JButton();
    JButton button_2 = new JButton();
    JButton button_3 = new JButton();
    JLabel text = new JLabel();
    JLabel score = new JLabel();
    JLabel text_winner = new JLabel();
    JLabel winner = new JLabel();
    boolean clogged;

    public TheGame_1()
    {
        super("THE GAME");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.score_barcelona = 0;
        this.score_madrid = 0;
        this.clogged = false;
        createGui();
    }
    private void createGui()
    {
        button_1.setText("LETS THE GAME BEGIN");
        button_2.setText("MADRID");
        button_3.setText("BARCELONA");
        text.setText("THE GAME: MADRID -- BARCELONA");

        button_2.setVisible(false);
        button_3.setVisible(false);
        text.setVisible(false);
        winner.setVisible(false);

        TheGame_1.ActionListener_button_1 actionListener_button1 = new TheGame_1.ActionListener_button_1();
        TheGame_1.ActionListener_button_2 actionListener_button2 = new TheGame_1.ActionListener_button_2();
        TheGame_1.ActionListener_button_3 actionListener_button3 = new TheGame_1.ActionListener_button_3();

        button_1.addActionListener(actionListener_button1);
        button_2.addActionListener(actionListener_button2);
        button_3.addActionListener(actionListener_button3);

        panel_1.add(button_1);
        panel_1.add(text);
        panel_1.add(button_2);
        panel_1.add(button_3);
        panel_1.add(score);

        panel_2.add(text_winner);
        panel_2.add(winner);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(panel_1);
        add(panel_2);
        setVisible(true);
    }
    public class ActionListener_button_1 implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            button_2.setVisible(true);
            button_3.setVisible(true);
            score.setVisible(true);
            score.setOpaque(true);
            score.setBackground(Color.GRAY);
            text.setVisible(true);
            winner.setVisible(true);
            button_1.setVisible(false);
        }
    }
    public class ActionListener_button_2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            score_madrid++;
            clogged = true;
            goal();
        }
    }
    public class ActionListener_button_3 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            score_barcelona++;
            clogged = false;
            goal();
        }
    }
    public void goal()
    {
        score.setText("<html>score - " + score_madrid + ":" + score_barcelona + "</html>");
        if(!clogged)
            text_winner.setText("LAST GOAL IS - BARCELONA");
        else if(clogged)
            text_winner.setText("LAST GOAL IS - MADRID");
        if(score_madrid == score_barcelona)
            winner.setText("WINNER - DRAW");
        else if(score_madrid < score_barcelona)
            winner.setText("WINNER - BARCELONA");
        else if(score_barcelona < score_madrid)
            winner.setText("WINNER - MADRID");
    }
    public static void main(String[] args)
    {
        TheGame_1 game = new TheGame_1();
        game.setLocationRelativeTo(null);
        game.setSize(250,200);
    }
}
