/**
 * Generating tables; encapsulation and generalization.
 */
public class Tables {

    public static void example() {
        int i = 1;
        while (i < 10) {
            double x = i;
            System.out.println(x + "   " + Math.log(x));
            i = i + 1;
        }
    }

    public static void example2() {
        int i = 1;
        while (i < 10) {
            double x = i;
            System.out.println(x + "   " + Math.log(x) / Math.log(2));
            i = i + 1;
        }
    }

    public static void example3() {
        final double LOG2 = Math.log(2);
        int i = 1;
        while (i < 100) {
            double x = i;
            System.out.println(x + "   " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }

    public static void example4() {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRow() {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRow2(int n) {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void example5() {
        int i = 1;
        while (i <= 6) {
            printRow2(i);
            i = i + 1;
        }
    }

    public static void printTable() {
        int i = 1;
        while (i <= 6) {
            printRow2(i);
            i = i + 1;
        }
    }

    public static void printTable2(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow2(i);
            i = i + 1;
        }
    }

    public static void printRow3(int n, int cols) {
        int i = 1;
        while (i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printTable3(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow3(i, rows);
            i = i + 1;
        }
    }

    public static void printTable4(int rows) {
        for (int i = 1; i <= rows; i = i + 1) {
            printRow3(i, rows);
        }
    }

    public static void printRow4(int n, int cols) {
        int i;
        for (i = 1; i <= cols; i = i + 1) {
            System.out.printf("%4d", n * i);
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("example");
        example();

        System.out.println("example2");
        example2();

        System.out.println("example3");
        example3();

        System.out.println("example4");
        example4();

        System.out.println("example5");
        example5();

        System.out.println("printRow");
        printRow();

        System.out.println("printRow2");
        printRow2(6);

        System.out.println("printTable");
        printTable();

        System.out.println("printTable2");
        printTable2(6);

        System.out.println("printRow3");
        printRow3(6, 6);

        System.out.println("printTable3");
        printTable3(6);

        System.out.println("printRow4");
        printRow4(6, 6);

        System.out.println("printTable4");
        printTable4(6);
    }

}
