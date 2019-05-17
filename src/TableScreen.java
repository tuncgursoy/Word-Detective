import javax.swing.*;
import java.awt.*;

class TableScreen extends JFrame
{
    TableScreen()
    {
        setVisible(false);
        setBackground(Color.gray);
        setResizable(false);

        Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setLocation(1010,40);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Table a = new Table();
        add(a);



    }
}
