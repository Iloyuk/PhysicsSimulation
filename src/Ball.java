public class Ball {

    private double x, y;
    private double radius, mass;
    private double potentialEnergy, kineticEnergy, rotationalEnergy;

    public Ball(double x, double y, double radius, double mass) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.mass = mass;

        potentialEnergy = mass * 10 * (Main.HEIGHT - y); // mgh
        kineticEnergy = 0; // starts off with no KE
        rotationalEnergy = 0;
    }



}
