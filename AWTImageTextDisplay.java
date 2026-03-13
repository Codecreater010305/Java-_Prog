import java.awt.*;
import java.awt.event.*;

public class AWTImageTextDisplay extends Frame {

    Image img;

    public AWTImageTextDisplay() {
        setTitle("AWT Image and Text Display");
        setSize(500, 400);
        setLayout(null);

        // Load image
        img = Toolkit.getDefaultToolkit().getImage("image.jpg");

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        // Display text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Welcome to AWT Application", 120, 80);

        // Display image
        g.drawImage(img, 150, 120, 200, 200, this);
    }

    public static void main(String[] args) {
        new AWTImageTextDisplay();
    }
}
