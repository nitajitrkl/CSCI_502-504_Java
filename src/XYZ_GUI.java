import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XYZ_GUI {
    public XYZ_GUI() {

        // Main Frame set to be Broder Layout and close button.
        JFrame frame = new JFrame("XYZ User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // In main frame, whole pane is being added and size set to accommodate all components.
        frame.add(new TestPane());
        frame.pack();

        // frame set to be in the center of the screen.
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new XYZ_GUI();
    }
}

class TestPane extends JPanel {
    public TestPane() {
        // Main Panel is set to be Border Layout
        JPanel panel = new JPanel(new BorderLayout());

        // All Form Fields are set.
        JTextField nameField = new JTextField(1);
        JTextField emailField = new JTextField(1);
        JTextField passwordField = new JTextField(1);
        JTextArea bioField = new JTextArea(3,1);

        // Form section layout --> Grid Layout
        JPanel top = new JPanel(new GridLayout(4,2,5,5));

        // Form Section --> All Labels and input field added.
        top.add(new JLabel("Name", SwingConstants.CENTER));
        top.add(nameField);
        top.add(new JLabel("Email", SwingConstants.CENTER));
        top.add(emailField);
        top.add(new JLabel("Password", SwingConstants.CENTER));
        top.add(passwordField);
        top.add(new JLabel("Bio", SwingConstants.CENTER));
        top.add(bioField);

        // Newsletter Check box
        JPanel middle = new JPanel(new FlowLayout());
        middle.add(new JLabel("", SwingConstants.CENTER));
        middle.add(new JCheckBox("Subscribe to Newsletters", false));

        // Action Section --> with Flow Layout

        // Submit Button with ActionListener
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

        // Reset Button ActionListener
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

        // Both Submit and Reset Button added to bottom panel.
        bottom.add(submit);
        bottom.add(reset);

        // GridBag Layout created for mixing 3 panels
        JPanel content = new JPanel(new GridBagLayout());
        content.setOpaque(false);

        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;

        // All 3 Panels are added to content grid bag object
        content.add(top, c);
        content.add(middle, c);
        content.add(bottom, c);

        // content object is added to main panel
        panel.add(content);

        add(panel);
    }
}