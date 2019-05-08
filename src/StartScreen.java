import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StartScreen extends JFrame
{
    static int temp = 0 ;
     static Card card;

    StartScreen()
    {
        setVisible(true);
        setSize(300,500);
        setTitle("Word-Detective");
        setResizable(false);
        Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setLocation((dimension.width-this.getSize().width)/2,(dimension.height-this.getSize().height)/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font myFont = new Font("Times",Font.BOLD,31);


        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        setContentPane(jPanel);
        jPanel.setBackground(Color.DARK_GRAY);
        JLabel jLabel = new JLabel("WORD-DETECTIVE");
        jPanel.add(jLabel);
        jLabel.setBounds(0,60,300,100);

        jLabel.setFont(myFont);
        jLabel.setBackground(Color.DARK_GRAY);
        jLabel.setForeground(Color.WHITE);
        JRadioButton Server = new JRadioButton("Server");
        Server.setBounds(90,400,70,40);
        jPanel.add(Server);
        Server.setBackground(Color.DARK_GRAY);
        Server.setForeground(Color.WHITE);

        JRadioButton Client = new JRadioButton("Client");
        Client.setForeground(Color.WHITE);
        Client.setBounds(160,400,70,40);
        jPanel.add(Client);
        Client.setBackground(Color.DARK_GRAY);


        Server.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                if (Client.isSelected())
                {
                    Client.setSelected(false);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        Client.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                if (Server.isSelected())
                {
                    Server.setSelected(false);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });





        JButton StartButton = new JButton("Start");

        StartButton.setBounds(100,200,100,40);
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Server.isSelected())
                {
                     card = new Card();
                    setVisible(false);
                    temp++;
                    new TalkScreen().setVisible(true);
                    new GameScreen().setVisible(true);

                }else if (Client.isSelected())
                {
                    card = new Card();
                    setVisible(false);
                    temp--;
                    new TalkScreen().setVisible(true);
                    new GameScreen().setVisible(true);

                }
                else
                    {
                        JOptionPane.showMessageDialog(null,"Please select Server or Client");
                    }
            }
        });
        jPanel.add(StartButton);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(100,320,100,40);
        jPanel.add(ExitButton);
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
        repaint();
    }
}
