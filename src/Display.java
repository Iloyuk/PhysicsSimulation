import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Display extends JPanel {

    private final int dispWidth, dispHeight;
    private ArrayList<Ball> ballList;
    private int choice; // 0 = quit, 1 = launch ball, 2 = ball dropping

    public Display() {
        super();
        dispWidth = Main.WIDTH;
        dispHeight = Main.HEIGHT;
        ballList = new ArrayList<>();
    }

    public Dimension getPreferredSize() {
        return new Dimension(dispWidth, dispHeight);
    }

    public int showMenu() {
        String[] options = {"Quit", "Launching Ball", "Ball Dropping"};
        int choice = JOptionPane.showOptionDialog(this,
                "What would you like to simulate now?", "Physics Simulation",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.exit(0);
        }

        return choice;
    }

    public void update() {
        repaint();
    }
}
