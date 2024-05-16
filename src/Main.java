import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int WIDTH = 1800;
    public static final int HEIGHT = 1000;
    static int choice;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Physics");
        Display display = new Display();
        Timer timer = new Timer(10, ActionEvent -> {
            display.update();
            if (choice == 0)
                frame.dispose();
        });

        display.setLayout(null);
        display.add(getBtnStop(timer, display));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setBounds(0, 0, WIDTH, HEIGHT);
        choice = display.showMenu();

        if (choice != 0) {
            timer.start();
            frame.setContentPane(display);
            frame.setVisible(true);
        }
        else System.exit(0);
    }

    private static JButton getBtnStop(Timer timer, Display display) {

        JButton btnStop = new JButton();
        btnStop.setFont(new Font("SansSerif", Font.BOLD, 30));
        btnStop.setText("Stop");
        btnStop.setBorder(BorderFactory.createEtchedBorder(1, Color.GRAY, Color.GRAY));
        btnStop.setLayout(null);
        btnStop.setBounds(WIDTH - 120, 10, 100, 50);
        btnStop.addActionListener(e -> {
            if (e.getSource() == btnStop) {
                timer.stop();
                choice = display.showMenu();
                timer.start();
            }
        });

        return btnStop;
    }

}