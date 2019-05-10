import javax.swing.*;
import java.awt.*;

public class TableScreen extends JFrame
{
    TableScreen()
    {
        setVisible(false);
        setBackground(Color.gray);
        setResizable(false);

        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel a = new Table();
        add(a);


        repaint();
    }
}
