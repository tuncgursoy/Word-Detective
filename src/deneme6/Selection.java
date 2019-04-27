package deneme6;

import deneme2.ClientMain;
import deneme2.Main_Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import cv.deneme2.ClientForm;
import cv.deneme2.ServerForm;

public class Selection extends JFrame
{




        JPanel jPanel = new JPanel();
        JRadioButton ServerRadio = new JRadioButton();
        JRadioButton ClientRadio = new JRadioButton();

        Selection() throws IOException {


            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            setVisible(false);
            setResizable(false);
            setSize(500,100);
            add(jPanel);
            jPanel.add(ServerRadio);

            jPanel.add(ClientRadio);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ServerRadio.setText("Server");
            ClientRadio.setText("Client");
           jPanel.setBackground(Color.DARK_GRAY);
           ServerRadio.setBackground(Color.darkGray);
           setTitle("Word Detective");

           ServerRadio.setForeground(Color.white);
           ClientRadio.setForeground(Color.white);
           ClientRadio.setBackground(Color.darkGray);
            setLocation(dimension.width/2-this.getWidth()/2,dimension.height/2-this.getHeight()/2);
            ServerRadio.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e)
                {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                    if (ServerRadio.isSelected()&&ClientRadio.isSelected())
                    {
                        ClientRadio.setSelected(false);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            ClientRadio.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e)
                {
                    if (ServerRadio.isSelected()&&ClientRadio.isSelected())
                    {
                        ServerRadio.setSelected(false);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
             Color[] temp = new Color[1];
            JButton button = new JButton();
            jPanel.add(button);
            button.setText("Ok");
            Font myfont = new Font("Times",Font.BOLD,20);
            button.setFont(myfont);
            button.setLocation(getSize().width/2-button.getSize().width/2,getSize().height/2-button.getSize().height/2);
            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {



                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    temp[0] = button.getBackground();
                    button.setBackground(Color.cyan);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(Color.cyan);

                }
            });
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (ServerRadio.isSelected())
                    {

                        try {
                            setVisible(false);
                            dispose();
                            ServerForm serverForm = null;
                            serverForm = new ServerForm();
                            serverForm.setVisible(true);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }

                        dispose();
                    }else if (ClientRadio.isSelected())
                    {

                        setVisible(false);
                        dispose();
                        ClientForm clientForm = null;
                        try {
                            clientForm = new ClientForm();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        clientForm.setVisible(true);


                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please Select one of them");
                    }
                }
            });

    }
}
