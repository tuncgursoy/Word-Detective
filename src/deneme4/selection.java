package deneme4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class selection extends JFrame
{

     public String temp =  new String();

    JPanel jPanel = new JPanel();
    JRadioButton ServerRadio = new JRadioButton();
    JRadioButton ClientRadio = new JRadioButton();

     String selection()
    {

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setVisible(true);
        setSize(500,100);
        add(jPanel);
        jPanel.add(ServerRadio);

        jPanel.add(ClientRadio);
        ServerRadio.setText("Server");
        ClientRadio.setText("Client");
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
        JButton button = new JButton();
        jPanel.add(button);
        button.setText("Ok");
        Font myfont = new Font("Times",Font.BOLD,20);
        button.setFont(myfont);
        button.setLocation(getSize().width/2-button.getSize().width/2,getSize().height/2-button.getSize().height/2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ServerRadio.isSelected())
                {
                    temp= "Server";
                    dispose();
                }else if (ClientRadio.isSelected())
                {
                    dispose();
                    temp="Client";


                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please Select one of them");
                }
            }
        });
        return temp;



    }







}
