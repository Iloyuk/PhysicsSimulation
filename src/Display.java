import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Display extends JPanel {
    private final int dispWidth, dispHeight;
    private ArrayList<Ball> ballList;

    private int count = 0;

    public Display() {
        super();
        dispWidth = Main.WIDTH;
        dispHeight = Main.HEIGHT;
        ballList = new ArrayList<>();
    }

    public Dimension getPreferredSize() {
        return new Dimension(dispWidth, dispHeight);
    }

    public void update() {
        System.out.println(count++);
        repaint();
    }
}
