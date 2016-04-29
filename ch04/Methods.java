/**
 * Examples from Chapter 4.
 */
public class Methods {

    public static void main(String[] args) {
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);

        double degrees = 90;
        double angle2 = degrees / 180.0 * Math.PI;
        double radians = Math.toRadians(180.0);
        double degrees2 = Math.toDegrees(Math.PI);
        long x = Math.round(Math.PI * 20.0);

        double x2 = Math.cos(angle + Math.PI / 2.0);
        double x3 = Math.exp(Math.log(10.0));
        double x4 = Math.pow(2.0, 10.0);
    }

}
