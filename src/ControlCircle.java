import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCircle extends JFrame {

    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle(){
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        add(canvas,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);
        jbtEnlarge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.changeSize(10);
            }
        });
        jbtShrink.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.changeSize(-10);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircle();
        frame.setTitle("ControlCircle");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }


}
class CirclePanel extends JPanel{
    private int radius = 5;
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(getWidth() / 2 - radius,getHeight() / 2 - radius,2 * radius,2 * radius);
    }

    public void changeSize(int i) {
        radius = Math.max((radius + i),10);
        repaint();
    }
}
