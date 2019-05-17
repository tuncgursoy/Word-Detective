import javax.swing.*;
import java.awt.*;
import java.io.IOException;

class Blue_Timer extends JPanel {
    private int Port = 5555;
    private client client;
    private server server;
   static int btime = 300;
    private int minute, seconds;
    private JTextArea jLabel;
    JButton jButton;
    static int b = 0 ;
    boolean buton_pressed = false;

     boolean BTurn;

    Blue_Timer() {
        try {
            StartServerorClient();
        } catch (IOException e) {
            e.printStackTrace();
        }
        jLabel = new JTextArea();
        Font myfont = new Font("Times", Font.ITALIC, 34);
        jLabel.setBackground(Color.BLUE);
        jLabel.setFont(myfont);
        jLabel.setForeground(Color.white);
        jButton = new JButton("Start");
        if (StartScreen.temp == 1) {
            add(jButton);
        }
        Runnable runnable1 = () -> {

            while (true) {
                if (StartScreen.temp == 1) {
                    if (buton_pressed) {
                        try {

                            server.sendOutput("" + btime);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                } else {

                    try {


                        String string = client.getinput().nextLine();
                        btime = Integer.parseInt(string);
                        jLabel.setText("");
                        minute = btime / 60;
                        seconds = btime % 60;
                        jLabel.append(minute + "-" + seconds);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(850);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread time1 = new Thread(runnable1);
        time1.start();

        jButton.addActionListener(e -> {



            if (b== 0)
            {
            t.start();
            b++;
        }
            jButton.setVisible(false);
            jButton.setEnabled(false);
            buton_pressed = true;
            BTurn = true;
        });
        add(jLabel);

        jLabel.setEditable(false);

        setVisible(true);


    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //jLabel.setText(time/60 +"-"+time%60);
            while (btime != 0) {
                if (buton_pressed) {
                    if(BTurn) {
                        jLabel.setText("");
                        minute = btime / 60;
                        seconds = btime % 60;
                        jLabel.append(minute + "-" + seconds);


                        btime--;


                        try {
                            Thread.sleep(850);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        repaint();

                    }

                }

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if (Red_Timer.rtime == 0  )
            {

                    Score.isGameEnd = true;
                    Score.gameEnd();


            }
        }
    };
    Thread t = new Thread(runnable);

    private void StartServerorClient() throws IOException {
        if (StartScreen.temp == 1) {
            Server();
        } else {
            Client();
        }
    }

    private void Server() throws IOException {
        server = new server();
        server.setServer(Port);

    }

    private void Client() throws IOException {
        client = new client();
        client.setclient(TalkScreen.Ipaddr, Port);
    }

}

