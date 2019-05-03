import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame
{


    GameScreen()
    {





        setVisible(false);
        setBackground(Color.gray);
        setResizable(false);

        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Paint a = new Paint();
        add(a);
        repaint();




    }

}