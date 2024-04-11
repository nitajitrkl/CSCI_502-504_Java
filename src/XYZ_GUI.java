import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        panel1.setLayout(new GridLayout(5   , 2, 5, 5));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setLayout(new FlowLayout());

//        JPanel panel3 = new JPanel();
//        panel2.setBackground(Color.BLUE);
//        panel2.setLayout(new FlowLayout());

        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);

        JTextField nameField = new JTextField(1);
        panel1.add(new JLabel("Name", SwingConstants.CENTER));
        panel1.add(nameField);

        JTextField emailField = new JTextField(1);
        panel1.add(new JLabel("Email", SwingConstants.CENTER));
        panel1.add(emailField);

        JTextField passwordField = new JTextField(1);
        panel1.add(new JLabel("Password", SwingConstants.CENTER));
        panel1.add(passwordField);

        JTextArea bioField = new JTextArea();
        panel1.add(new JLabel("Bio", SwingConstants.CENTER));
        panel1.add(bioField);

        panel1.add(new JLabel("", SwingConstants.CENTER));
        panel1.add(new JCheckBox("Subscribe to Newsletters", false));

        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Name: " + nameField.getText());
                System.out.println("Email: " + emailField.getText());
                System.out.println("Password:" + passwordField.getText());
                System.out.println("Bio: " + bioField.getText());
            }
        });
        panel2.add(submit);

        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                bioField.setText("");
            }
        });
        panel2.add(reset);
    }

    public static void main(String[] args) {
        XYZ_GUI sample = new XYZ_GUI();
        sample.setVisible(true);
    }
}
