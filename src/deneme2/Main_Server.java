package deneme2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.NoSuchElementException;

public class Main_Server
{
    public static void main(String[] args) throws IOException {
        String port = JOptionPane.showInputDialog("Please Enter Port Number");
       JOptionPane.showMessageDialog(null, "Please Write this Ip address and port number like to other PC after press the ok\n"+Inet4Address.getLocalHost().getHostAddress()+"  ,  "+port);
        server server = new server();
        server.setServer(Integer.parseInt(port));



        ServerForm serverForm = new ServerForm();
        String UserName = JOptionPane.showInputDialog("Enter a UserName");
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
