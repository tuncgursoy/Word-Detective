import javax.swing.*;
import java.awt.*;

public class Red_Timer extends JPanel
{
    int time = 300;
    int minute,seconds;
    JTextArea jLabel ;
    boolean buton_pressed = false;
    Red_Timer()
    {
        jLabel = new JTextArea();
        Font myfont = new Font("Times",Font.ITALIC,34);
        jLabel.setBackground(Color.red);
        jLabel.setFont(myfont);
        jLabel.setForeground(Color.white);
        add(jLabel);

        t.start();

        jLabel.setEditable(false);

        setVisible(true);




    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //jLabel.setText(time/60 +"-"+time%60);
            while (time != 0)
            {
                if (buton_pressed) {
                    jLabel.setText("");
                    minute = time / 60;
                    seconds = time % 60;
                    jLabel.append(minute + "-" + seconds);


                    time--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    repaint();

                }

            }
        }
    };
    Thread t =new Thread(runnable);

}
