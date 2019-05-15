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
    public static final Color VERY_LIGHT_YELLOW = new Color(255,255,204);

    StartScreen()
    {
        setVisible(true);
        setSize(300,500);
        setTitle("Word-Detective");
        setResizable(false);
        Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setLocation((dimension.width-this.getSize().width)/2,(dimension.height-this.getSize().height)/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font myFont = new Font("Times",Font.BOLD,28);
        Font buttonFont = new Font("Times",Font.PLAIN, 15);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        setContentPane(jPanel);
        jPanel.setBackground(Color.DARK_GRAY);
        JLabel jLabel = new JLabel("WORD-DETECTIVE");
        jPanel.add(jLabel);
        jLabel.setBounds(20,60,300,100);

        jLabel.setFont(myFont);
        jLabel.setBackground(Color.DARK_GRAY);
        jLabel.setForeground(Color.WHITE);
        JRadioButton Server = new JRadioButton("Server");
        Server.setBounds(75,400,70,40);
        jPanel.add(Server);
        Server.setBackground(Color.DARK_GRAY);
        Server.setForeground(Color.WHITE);
        Server.setFont(buttonFont);

        JRadioButton Client = new JRadioButton("Client");
        Client.setForeground(Color.WHITE);
        Client.setBounds(155,400,70,40);
        jPanel.add(Client);
        Client.setBackground(Color.DARK_GRAY);
        Client.setFont(buttonFont);


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
        StartButton.setBackground(VERY_LIGHT_YELLOW);
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Server.isSelected())
                {
                     card = new Card();
                    setVisible(false);
                    temp++;
                    thread.start();




                }else if (Client.isSelected())
                {
                    card = new Card();
                    temp = 0 ;
                    setVisible(false);
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
        ExitButton.setBounds(100,290,100,40);
        ExitButton.setBackground(VERY_LIGHT_YELLOW);
        jPanel.add(ExitButton);
        JButton RulesButton = new JButton("Rules");
        RulesButton.setBounds(100,245,100,40);
        RulesButton.setBackground(VERY_LIGHT_YELLOW);
        jPanel.add(RulesButton);
        RulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RulesScreen().setVisible(true);
            }
        });
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
        repaint();

    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            new TalkScreen().setVisible(true);
            new GameScreen().setVisible(true);


            new TableScreen().setVisible(true);
        }
    };
    Thread thread = new Thread(run);
}
