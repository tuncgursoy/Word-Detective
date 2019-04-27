package deneme2;

import javax.swing.*;

public class ClientForm extends JFrame{
    private JPanel panel1;
     JButton button1;
     JTextField textField1;
     JTextArea textArea1;
    private javax.swing.JScrollPane JScrollPane;

    ClientForm()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        setSize(400,500);
        JScrollPane.createHorizontalScrollBar();
        setVisible(true);
        button1.setText("Send");
    }
}
