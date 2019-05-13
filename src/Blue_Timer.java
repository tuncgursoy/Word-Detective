import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Blue_Timer extends JPanel{
    private int Port = 5555;
    private client client;
    private server server;
    int time = 300;
    int minute,seconds;
    JTextArea jLabel ;
    JButton jButton;
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
        jButton = new JButton("Start");
        if (StartScreen.temp==1) {
            add(jButton);
        }
        time1.start();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                t.start();
                jButton.setVisible(false);
                jButton.setEnabled(false);
                buton_pressed = true;
            }
        });
        add(jLabel);
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

            while (true) {
                if (StartScreen.temp == 1) {
                    if (buton_pressed) {
                        try {
                            System.out.println("server");
                            server.sendOutput(""+time);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                } else  {

                    try {
                        System.out.println("client");


                        String string = client.getinput().nextLine();
                        time = Integer.parseInt(string);
                        jLabel.setText("");
                        minute = time / 60;
                        seconds = time % 60;
                        jLabel.append(minute + "-" + seconds);


                    } catch (IOException e) {
                        e.printStackTrace();
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
    Thread time1 = new Thread(runnable1);
}

