package lab5;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tutorial extends JFrame
{

    private JTextField textField;
    private JButton    button1;
    private JButton    button2;
    private JButton    button3;
    private JButton    button4;

    public Tutorial()
    {
        super("Test frame");
        createGUI();
    }

    public void createGUI()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        button1 = new JButton("Button 1");
        button1.setActionCommand("congratulation, u can press button 1!");
        panel.add(button1);

        button2 = new JButton("Button 2");
        button2.setActionCommand("Button 2 was pressed!");
        panel.add(button2);

        button3 = new JButton("Button 3");
        button3.setActionCommand("Button 3 was pressed!");
        panel.add(button3);

        button4 = new JButton("Button 4");
        button4.setActionCommand("Button 4 was pressed!");
        panel.add(button4);

        textField = new JTextField("press button 1");
        textField.setColumns(23);
        panel.add(textField);

        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);


        getContentPane().add(panel);
        setPreferredSize(new Dimension(300, 150));
    }

    public class TestActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            textField.setText(e.getActionCommand());
        }
    }

    public static void main(String[] args)
    {
        //javax.swing.SwingUtilities.invokeLater(new Runnable() {
            //public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                Tutorial frame = new Tutorial();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            //}
        //});
    }
}