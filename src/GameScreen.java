import javax.swing.*;
import java.awt.*;

class GameScreen extends JFrame
{


    GameScreen()
    {


        setVisible(false);
        setBackground(Color.gray);
        setResizable(false);

        setLocation(0,40);

        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel a = new Paint();
        add(a);


        thread.start();
        repaint();




    }
    private Runnable runnable5 = () -> {
        while (true)
        {
            if (Score.isGameEnd)
            {
                if (Score.isBlueWon)
                {
                    JOptionPane.showMessageDialog(null,"Blue Won the game");
                    dispose();
                    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    break;
                }else if (Score.isdraw)
                {
                    JOptionPane.showMessageDialog(null,"!!!!!!!!!DRAW!!!!!!!!!!!!!");
                    dispose();
                    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    break;

                }else
                {
                    JOptionPane.showMessageDialog(null,"Pink win the game");
                    dispose();
                    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    break;

                }
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    };
    private Thread thread = new Thread(runnable5);





}