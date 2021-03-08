import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    MyWindow()
    {
        setVisible(true);
        setLocation(750, 350);
        setSize(500, 500);
        setTitle("Норм окно");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("Exit");
        JButton btn2 = new JButton("Knopka");
        JPanel panel = new JPanel(new GridLayout(1,2));
        panel.add(btn1);
        panel.add(btn2);
        add(panel, BorderLayout.SOUTH);
        ActionListener actionListener = new CloseActionListener();
        btn1.addActionListener(actionListener);
    }
}
