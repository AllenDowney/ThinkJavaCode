/**
 * Examples from Chapter 6.
 */
public class Series {

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double calculateArea2(double radius) {
        return Math.PI * radius * radius;
    }

    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static double distance
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        return 0.0;
    }

    public static double distance2
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared);
        return 0.0;
    }

    public static double distance3
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static double circleArea
            (double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    public static double calculateArea
            (double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }

    /**
     * Tests whether x is a single digit integer.
     *
     * @param x the integer to test
     * @return true if x has one digit, false otherwise
     */
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSingleDigit2(int x) {
        return x > -10 && x < 10;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        countup(3);
        System.out.println("Have a nice day.");

        System.out.println("calculateArea");
        System.out.println(calculateArea(3.0));

        System.out.println("calculateArea2");
        System.out.println(calculateArea2(3.0));

        System.out.println("circleArea");
        System.out.println(circleArea(1.0, 2.0, 4.0, 6.0));

        System.out.println("calculateArea with 4 doubles");
        System.out.println(calculateArea(1.0, 2.0, 4.0, 6.0));

        System.out.println("absolute value");
        System.out.println(absoluteValue(-2));

        System.out.println("distance");
        System.out.println(distance(1.0, 2.0, 4.0, 6.0));

        System.out.println("distance2");
        System.out.println(distance2(1.0, 2.0, 4.0, 6.0));

        System.out.println("distance3");
        System.out.println(distance3(1.0, 2.0, 4.0, 6.0));

        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit2(17);

        int z = 9;
        if (isSingleDigit(z)) {
            System.out.println("z is small");
        } else {
            System.out.println("z is big");
        }

        System.out.println("factorial");
        System.out.println(factorial(3));

        System.out.println("fibonacci");
        System.out.println(fibonacci(3));
    }

}
