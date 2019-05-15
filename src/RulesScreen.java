import javax.swing.*;
import java.awt.*;

public class RulesScreen extends JFrame
{
    RulesScreen()
    {
    setVisible(false);
    setBackground(Color.gray);
    setResizable(false);

        setSize(535,410);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    Rules a = new Rules();
    add(a);

    }
}
