/**
 * Class that uses Time objects.
 */
public class TimeClient {

    /**
     * Demonstrates that we cannot access private variables from another
     * class.
     */
    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.9);
        System.out.println(time.hour);          // ERROR
    }
}
