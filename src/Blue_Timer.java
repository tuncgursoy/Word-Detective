import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Blue_Timer extends JPanel{
    private int Port = 5555;
    private client client;
    private server server;
    int time = 300;
    int minute,seconds;
    JTextArea jLabel ;
    boolean buton_pressed = false;
    Blue_Timer()
    {
        try {
            StartServerorClient();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        jLabel = new JTextArea();
        Font myfont = new Font("Times",Font.ITALIC,34);
        jLabel.setBackground(Color.BLUE);
        jLabel.setFont(myfont);
        jLabel.setForeground(Color.white);
        add(jLabel);

        t.start();
        time1.start();

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
    void StartServerorClient() throws IOException, ClassNotFoundException {
        if (StartScreen.temp==1)
        {
            Server();
        }else
        {
            Client();
        }
    }
    void  Server() throws IOException {
        server = new server();
        server.setServer(Port);

    }
    void Client() throws IOException {
        client = new client();
        client.setclient(TalkScreen.Ipaddr,Port);
    }
    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {


                if (StartScreen.temp ==1)
                {
                    try {
                        server.sendOutput(""+time+",");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else
                    {
                        try {

                            String string = client.getinput().nextLine();
                            String[]  a = string.split(",");
                            time = Integer.parseInt(a[0]);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            }


    };
    Thread time1 = new Thread(runnable1);

}

