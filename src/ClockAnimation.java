import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ClockAnimation extends JFrame {
    ClockPanel clock = new ClockPanel();

    public ClockAnimation() {
        add(clock);
        Timer timer = new Timer(100, new TimerListener());
        timer.start();
    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clock.setCurrentTime();
            clock.repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new ClockAnimation();
        frame.setTitle("ClockAnimation");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ClockPanel extends JPanel {
    public ClockPanel() {
        setCurrentTime();
    }

//    public Clock(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }

//    public void setHour(int hour) {
//        this.hour = hour;
//        repaint();
//    }
//    public void setMinute(int minute) {
//        this.minute = minute;
//        repaint();
//    }
//    public void setSecond(int second) {
//        this.second = second;
//        repaint();
//    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setCurrentTime() {
        LocalTime time = LocalTime.now();
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int clockRadius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        g.setColor(Color.black);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
        g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
        g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
        g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
        g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);


        int sLength = (int) (clockRadius * 0.8);
        int xSecond = (int) (xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
        int ySecond = (int) (yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
        g.setColor(Color.green);
        g.drawLine(xCenter, yCenter, xSecond, ySecond);


        int mLength = (int) (clockRadius * 0.65);
        int xMinute = (int) (xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
        int yMinute = (int) (yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
        g.setColor(Color.red);
        g.drawLine(xCenter, yCenter, xMinute, yMinute);


        int hLength = (int) (clockRadius * 0.5);
        int xHour = (int) (xCenter + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        int yHour = (int) (yCenter - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        g.setColor(Color.black);
        g.drawLine(xCenter, yCenter, xHour, yHour);

        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("hh:mm a");
        String localTimeString = FOMATTER.format( LocalTime.now() ); 

        g.setColor(Color.black);
        g.drawString(localTimeString, xCenter - (int) (clockRadius / 2.5), yCenter + (int) (clockRadius * 1.2));
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    private int hour;
    private int minute;
    private int second;
}