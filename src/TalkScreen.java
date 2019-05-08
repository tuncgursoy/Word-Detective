import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.ArrayList;

public class TalkScreen extends JFrame
{
     private int port=6788;
    JTextArea textArea;
    JTextField textField;
     static String Ipaddr;
     private client client;
       private server server;
     private String UserName;


    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            boolean flag = true;


            while (flag) {
                if (StartScreen.temp == 1) {
                    while (flag) {
                        try {

                            server.sendOutput("-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        String i = null;
                        try {
                            i = server.getinput().nextLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (i.equals("-")) {
                        }else
                            {
                                textArea.append(i + "\n");

                            }


                    }
                } else {
                    while (flag) {

                        try {
                            client.sendOutput("-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        String i = null;
                        try {
                            i = client.getinput().nextLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (i.equals("-")) {

                        }else
                        {
                            textArea.append(i + "\n");
                        }


                    }
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }


    };
    Thread thread = new Thread(runnable);


    boolean IStrue = true;




    TalkScreen()
    {

        try {

            UserName = JOptionPane.showInputDialog("Enter a UserName");
            StartServerorClient();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        setSize(410,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setLocation((dimension.width-this.getSize().width)/2,(dimension.height-this.getSize().height)/2);


        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        setContentPane(jPanel);
        jPanel.setBackground(Color.DARK_GRAY);
        jPanel.setForeground(Color.WHITE);






         textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.WHITE);
        //jPanel.add(textArea);

        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setBounds(1,1,400,500);
       // jScrollPane.createHorizontalScrollBar();
        jScrollPane.createVerticalScrollBar();
        jPanel.add(jScrollPane);

         textField = new JTextField();
        textField.setBounds(1,520,300,20);
        jPanel.add(textField);

        JButton SendButton = new JButton("Send");
        SendButton.setBounds(320,510,70,40);
        jPanel.add(SendButton);
        SendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (StartScreen.temp==1)
                {
                    String i =textField.getText();
                    textArea.append("["+UserName+"]:"+i+"\n");
                    textField.setText("");
                    try
                    {
                        server.sendOutput("["+UserName+"]:"+i+"\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }else
                    {
                        String i =textField.getText();
                        textArea.append("["+UserName+"]:"+i+"\n");
                        textField.setText("");
                        try {
                            client.sendOutput("["+UserName+"]:"+i+"\n");
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
            }
        });
        thread.start();








    }

    void StartServerorClient() throws IOException, ClassNotFoundException {
        if (StartScreen.temp==1)
        {

            JOptionPane.showMessageDialog(null, "Please Write this Ip address and port number like to other PC after press the ok\n"+ Inet4Address.getLocalHost().getHostAddress());

            Server();
        }else
            {

                Ipaddr = JOptionPane.showInputDialog("Please Enter  Ip address");

                Client();
            }
    }
    void  Server() throws IOException {
         server = new server();
         server.setServer(port);
        server.sendArraylist(StartScreen.card.list);
    }
    void Client() throws IOException, ClassNotFoundException {
        client = new client();
        client.setclient(Ipaddr,port);
        StartScreen.card.list.clear();
        StartScreen.card.list =client.getobject();
    }

}
