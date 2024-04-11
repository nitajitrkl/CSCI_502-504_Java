import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XYZ_GUI extends JFrame {
    public XYZ_GUI() {
        JFrame frame = new JFrame("XYZ User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new TestPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new XYZ_GUI();
    }
}

class TestPane extends JPanel {
    public TestPane() {
        setLayout(new GridLayout(1,0));
        add(createPane());
    }
    public JPanel createPane() {

        JPanel panel = new JPanel(new BorderLayout());

        JTextField nameField = new JTextField(1);
        JTextField emailField = new JTextField(1);
        JTextField passwordField = new JTextField(1);
        JTextArea bioField = new JTextArea(3,1);

        JPanel top = new JPanel(new GridLayout(4,2,5,5));

        top.add(new JLabel("Name", SwingConstants.CENTER));
        top.add(nameField);
        top.add(new JLabel("Email", SwingConstants.CENTER));
        top.add(emailField);
        top.add(new JLabel("Password", SwingConstants.CENTER));
        top.add(passwordField);
        top.add(new JLabel("Bio", SwingConstants.CENTER));
        top.add(bioField);

        JPanel middle = new JPanel(new FlowLayout());
        middle.add(new JLabel("", SwingConstants.CENTER));
        middle.add(new JCheckBox("Subscribe to Newsletters", false));

        JPanel bottom = new JPanel(new FlowLayout());
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
        bottom.add(submit);
        bottom.add(reset);

        JPanel content = new JPanel(new GridBagLayout());
        content.setOpaque(false);

        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;

        content.add(top, c);
        content.add(middle, c);
        content.add(bottom, c);

        panel.add(content);

        return panel;
    }

}