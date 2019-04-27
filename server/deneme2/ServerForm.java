package deneme2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerForm extends JFrame {
    private JPanel panel1;
     JButton button1;
     JTextField textField1;
    private JScrollPane JScrollPane;
     JTextArea textArea1;




    ServerForm()
    {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(panel1);

        setSize(400,500);
        setVisible(true);
        JScrollPane.createHorizontalScrollBar();
        button1.setText("Send");

    }


}

