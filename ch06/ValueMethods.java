public class ValueMethods {

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static double area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static double area2(double radius) {
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
        double area = area(radius);
        return area;
    }

    public static double area
            (double xc, double yc, double xp, double yp) {
        return area(distance(xc, yc, xp, yp));
    }

    public static boolean isSingleDigit(int x) {
        if (x >= 0 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSingleDigit2(int x) {
        return x >= 0 && x < 10;
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

        double x = area(3.0);
        double y = area(1.0, 2.0, 4.0, 6.0);

        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(17);

        int z = 17;
        if (isSingleDigit(z)) {
            System.out.println("z is small");
        } else {
            System.out.println("z is big");
        }
    }
}
