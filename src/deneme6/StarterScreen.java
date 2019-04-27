package deneme6;

import deneme4.main2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

public class StarterScreen extends JFrame
{
    Selection selection;
    StarterScreen() throws IOException {
        selection = new Selection();




        setVisible(true);
        JButton StarteButton = new JButton();
        JPanel jPanel = new JPanel();
        //setBackground(Color.yellow);
        JTextPane textArea = new JTextPane();
        JButton ExitButton = new JButton();
        setSize(400,600);
        setContentPane(jPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        jPanel.setBackground(Color.DARK_GRAY);
        jPanel.setLayout(null);
         Color[] temp = {Color.BLACK};
         jPanel.setVisible(true);
         Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
         setLocation(dimension.width/2-getSize().width/2,dimension.height/2-getSize().height/2);
        //Fonts
        Font font1 = new Font("Times",Font.BOLD,32);

        //Text Area Location
        textArea.setBounds(50,100,300,37);
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.white);

        textArea.setText("WORD-DETECTIVE");
        /*SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(attributeSet, StyleConstants.ALIGN_CENTER);
        textArea.setParagraphAttributes(attributeSet, true);*/
        textArea.setFont(font1);
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea.setEditable(false);
        jPanel.add(textArea);

        //Start Button
        StarteButton.setText("START");
        StarteButton.setBounds(150,300,100,50);
        StarteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                dispose();
                selection.setVisible(true);
            }
        });

        StarteButton.addMouseListener(new MouseListener() {
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
                temp[0] = StarteButton.getBackground();
                StarteButton.setBackground(Color.cyan);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                StarteButton.setBackground(temp[0]);
            }
        });
        jPanel.add(StarteButton);

        //Exit Button
        ExitButton.setText("EXIT");
        ExitButton.setBounds(150,400,100,50);
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                dispose();
            }
        });
        ExitButton.addMouseListener(new MouseListener() {
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
                temp[0] = ExitButton.getBackground();
                ExitButton.setBackground(Color.cyan);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                ExitButton.setBackground(temp[0]);
            }
        });
        jPanel.add(ExitButton);
        repaint();

    }
    void Write(String massage) throws IOException
    {
        FileWriter write = new FileWriter("log.txt",true);
        PrintWriter print_line = new PrintWriter(write);
        print_line.println("Start");
        print_line.close();
    }
    String  read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/User/IdeaProjects/Word-Detective/log.txt"));
        String read = bufferedReader.readLine();
        while (read != null) {
            if (read.equalsIgnoreCase("start")) {
               // main2.main(new String[]{});
               // System.out.println("s");

            }
            read = bufferedReader.readLine();
        }

        return read;
    }

}
