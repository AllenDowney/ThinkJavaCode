/**
 * Example using the String.format method.
 */
public class Format {

    /**
     * Returns a time string in 12-hour format.
     *
     * @param hour between 0 and 23
     * @param minute between 0 and 59
     */
    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12;  // midnight
            }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }

    public static void main(String[] args) {
        System.out.println(timeString(0, 0));
        System.out.println(timeString(7, 30));
        System.out.println(timeString(12, 5));
        System.out.println(timeString(23, 59));
    }

}
