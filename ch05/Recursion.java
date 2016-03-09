public class Recursion {

    public static void main(String[] args) {
        System.out.println("countdown");
        countdown(3);

        System.out.println("countup");
        countup(3);

        System.out.println("newLine");
        newLine();

        System.out.println("nLines");
        nLines(3);

        System.out.println("threeLine");
        threeLine();

        System.out.println("displayBinary");
        displayBinary(23);
        System.out.println();
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

}
