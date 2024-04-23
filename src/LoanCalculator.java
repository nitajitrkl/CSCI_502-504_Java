import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoanCalculator {
    public LoanCalculator() {
        JFrame frame = new JFrame("Loan Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(new TestPane1());
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoanCalculator();
    }
}
class TestPane1 extends JPanel {
    public TestPane1() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextField interestRate = new JTextField(1);
        JTextField years = new JTextField(1);
        JTextField loanAmount = new JTextField(1);
        JTextField monthlyPayment = new JTextField(1);
        JTextField totalPayment = new JTextField(1);


        JPanel top = new JPanel(new GridLayout(5,2,5,5));

        top.add(new JLabel("Annual Interest Rate", SwingConstants.CENTER));
        top.add(interestRate);
        top.add(new JLabel("Number of Years", SwingConstants.CENTER));
        top.add(years);
        top.add(new JLabel("Loan Amount", SwingConstants.CENTER));
        top.add(loanAmount);
        top.add(new JLabel("Monthly Payment", SwingConstants.CENTER));
        top.add(monthlyPayment);
        top.add(new JLabel("Total Payment", SwingConstants.CENTER));
        top.add(totalPayment);

        JPanel bottom = new JPanel(new FlowLayout());
        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double interest = Double.parseDouble(interestRate.getText())/12/100;
                double month = Double.parseDouble(years.getText())*12;
                double loan = Double.parseDouble(loanAmount.getText());
                double up = ((Math.pow((1+interest),month))-1);
                double down = interest*(Math.pow((1+interest),month));
                double mp = loan/(up/down);
                monthlyPayment.setText(String.format("%.2f", mp));
                double tp = month * mp;
                totalPayment.setText(String.format("%.2f", tp));
            }
        });

        bottom.add(calculate);

        JPanel content = new JPanel(new GridBagLayout());
        content.setOpaque(false);

        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;

        content.add(top, c);
        content.add(bottom, c);
        panel.add(content);
        add(panel);
    }
}
