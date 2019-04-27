package deneme2;

import cv.deneme2.server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.NoSuchElementException;

public class ServerForm extends JFrame {
    private JPanel panel1;
     JButton button1;
     JTextField textField1;
    private JScrollPane JScrollPane;
     JTextArea textArea1;




    public ServerForm() throws IOException {
        String port = JOptionPane.showInputDialog("Please Enter Port Number");
        JOptionPane.showMessageDialog(null, "Please Write this Ip address and port number like to other PC after press the ok\n"+ Inet4Address.getLocalHost().getHostAddress()+"  ,  "+port);
        server server = new server();
        server.setServer(Integer.parseInt(port));



        cv.deneme2.ServerForm serverForm = new cv.deneme2.ServerForm();
        String UserName = JOptionPane.showInputDialog("Enter a UserName");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(panel1);

        setSize(400,500);
        setVisible(false);
        JScrollPane.createHorizontalScrollBar();
        button1.setText("Send");
        serverForm.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i =serverForm.textField1.getText();
                serverForm.textArea1.append("["+UserName+"]:"+i+"\n");
                serverForm.textField1.setText("");
                try {
                    server.sendOutput("["+UserName+"]:"+i+"\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });
        while (true) {
            try
            {
                String i =server.getinput().nextLine();
                serverForm.textArea1.append(i+"\n");
            }
            catch (NoSuchElementException e )
            {

            }
        }


}
}

