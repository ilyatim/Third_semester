package lab6;

import javafx.scene.layout.BorderStroke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.concurrent.Flow;

public class Menu extends JFrame
{
    JPanel panel_1 = new JPanel();
    JPanel panel_2 = new JPanel();
    JPanel panel_3 = new JPanel();
    JTextField textField = new JTextField(30);
    JComboBox box_colour = new JComboBox();
    JComboBox box_font;
    Vector vector = new Vector();

    public Menu()
    {
        super("COLOUR AND FONT");
        createGUI();
    }
    public void createGUI()
    {
        GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String envfonts[] = gEnv.getAvailableFontFamilyNames();

        for(int i = 1; i < envfonts.length; i++)
            vector.addElement(envfonts[i]);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        box_colour.addItem("BLUE");
        box_colour.addItem("BLACK");
        box_colour.addItem("RED");

        box_font = new JComboBox(vector);

        ActionListener_colour action_color = new ActionListener_colour();
        ActionListener_font action_font = new ActionListener_font();

        box_colour.addActionListener(action_color);
        box_font.addActionListener(action_font);

        panel_1.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel_2.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel_3.setLayout(new FlowLayout());

        panel_1.add(new JLabel("Color:"));
        panel_1.add(box_colour);
        panel_2.add(new JLabel("Font:"));
        panel_2.add(box_font);
        panel_3.add(textField);
        add(panel_1);
        add(panel_2);
        add(panel_3);

        setVisible(true);

        setPreferredSize(new Dimension(400,250));
    }
    public class ActionListener_colour implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(box_colour.getSelectedItem() == "BLUE")
                textField.setForeground(Color.BLUE);
            if(box_colour.getSelectedItem() == "BLACK")
                textField.setForeground(Color.BLACK);
            if(box_colour.getSelectedItem() == "RED")
                textField.setForeground(Color.RED);
        }
    }
    public class ActionListener_font implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

            String name_font = (String)box_font.getSelectedItem();
            Font font = new Font(name_font, Font.BOLD, 15);
            textField.setFont(font);
        }
    }
    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.pack();
        menu.setLocationRelativeTo(null);
    }
}
