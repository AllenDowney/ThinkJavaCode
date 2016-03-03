import java.awt.Point;
import java.awt.Rectangle;

/**
 * Demonstates use of Point and Rectangle classes.
 */
public class PointRect {

    /**
     * Prints the attributes of a Point object.
     */
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    /**
     * Computes the distance between two points.
     */
    public static double distance(Point p1, Point p2) {
        double dx = (double) (p2.x - p1.x);
        double dy = (double) (p2.y - p1.y);
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Finds the center of a Rectangle and returns a new Point.
     */
    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    /**
     * Moves a Rectangle by modifying the x and y attributes.
     */
    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    /**
     * Tests the methods in this class.
     */
    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4);
        System.out.println(blank);

        Rectangle box = new Rectangle(0, 0, 100, 200);
        moveRect(box, 50, 100);
        System.out.println(box);

        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;

        System.out.println(box2.width);
        box1.grow(50, 50);
        System.out.println(box2.width);
    }
}
