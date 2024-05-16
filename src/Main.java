import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int WIDTH = 1800;
    public static final int HEIGHT = 1000;

    public static void main(String[] args) {

        Display display = new Display();
        display.setLayout(null);

        Timer timer = new Timer(10, ActionEvent -> display.update());

        JButton btnStop = getBtnStop(timer);

        display.add(btnStop);

        JFrame frame = new JFrame("Physics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setBounds(0, 0, WIDTH, HEIGHT);
        frame.setContentPane(display);
        frame.setVisible(true);

        timer.start();

    }

    private static JButton getBtnStop(Timer timer) {

        JButton btnStop = new JButton();
        btnStop.setFont(new Font("SansSerif", Font.BOLD, 30));
        btnStop.setText("Stop");
        btnStop.setBorder(BorderFactory.createEtchedBorder(1, Color.GRAY, Color.GRAY));
        btnStop.setLayout(null);
        btnStop.setBounds(WIDTH - 120, 10, 100, 50);
        btnStop.addActionListener(e -> {
            if (e.getSource() == btnStop) {
                timer.stop();
                JOptionPane.showInputDialog(null, "What height");
                timer.start();
            }
        });
        btnStop.setLayout(null);

        return btnStop;
    }

}