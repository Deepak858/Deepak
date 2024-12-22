import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dvd extends JPanel implements ActionListener {
    private final int WIDTH = 800, HEIGHT = 600;
    private final int DVD_WIDTH = 100, DVD_HEIGHT = 50;
    private int x = 0, y = 0, xSpeed = 3, ySpeed = 2;

    public Dvd() {
        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, DVD_WIDTH, DVD_HEIGHT);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x + xSpeed < 0 || x + xSpeed + DVD_WIDTH > WIDTH) {
            xSpeed = -xSpeed;
        }
        if (y + ySpeed < 0 || y + ySpeed + DVD_HEIGHT > HEIGHT) {
            ySpeed = -ySpeed;
        }
        x += xSpeed;
        y += ySpeed;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DVD Bounce Animation");
        Dvd dvdBounce = new Dvd();
        frame.add(dvdBounce);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
         }
}
