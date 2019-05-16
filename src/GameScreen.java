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
        JPanel a = new Paint();
        add(a);


        thread.start();
        repaint();




    }
    Runnable runnable5 = new Runnable() {
        @Override
        public void run() {
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

        }
    };
    Thread thread = new Thread(runnable5);





}