package Assets;

import main.MainKt;
import java.awt.*;

public class Ball {

    private double x, y;
    private double radius, mass;
    private double potentialEnergy, kineticEnergy, rotationalEnergy;

    public Ball(double x, double y, double radius, double mass) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.mass = mass;

        potentialEnergy = mass * 10 * (MainKt.HEIGHT - y); // mgh
        kineticEnergy = 0; // starts off with no KE
        rotationalEnergy = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void draw(Graphics2D g) {
        g.fillOval((int)x, (int)y, (int)radius, (int)radius);
    }


}
