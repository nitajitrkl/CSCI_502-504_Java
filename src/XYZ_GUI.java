import javax.swing.*;
import java.awt.*;

public class XYZ_GUI extends JFrame {
    public XYZ_GUI() {
        this.setLayout(new BorderLayout());
        this.setTitle("XYZ User Registration");
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setLayout(new GridLayout(4   , 2, 5, 5));
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setLayout(new FlowLayout());
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);
        panel1.add(new JLabel("Name", SwingConstants.CENTER));
        panel1.add(new JTextField(1));
        panel1.add(new JLabel("Email", SwingConstants.CENTER));
        panel1.add(new JTextField(1));
        panel1.add(new JLabel("Password", SwingConstants.CENTER));
        panel1.add(new JTextField(1));
        panel1.add(new JLabel("Bio", SwingConstants.CENTER));
        panel1.add(new JTextArea());
        panel2.add(new JCheckBox("Subscribe to Newsletters", false));
        panel2.add(new JButton("Submit"));
        panel2.add(new JButton("Cancel"));
    }
    public static void main(String[] args) {
        XYZ_GUI sample = new XYZ_GUI();
        sample.setVisible(true);
    }
}
