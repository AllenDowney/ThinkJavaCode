/**
 * Examples from Chapter 2.
 */
public class Variables {

    public static void main(String[] args) {

        String message;
        int x;

        String firstName;
        String lastName;
        int hour, minute;

        message = "Hello!";  // give message the value "Hello!"
        hour = 11;           // assign the value 11 to hour
        minute = 59;         // set minute to 59

        message = "123";     // legal
        // message = 123;    // not legal

        String message2 = "Hello!";
        int hour2 = 11;
        int minute2 = 59;

        int a = 5;
        int b = a;     // a and b are now equal
        a = 3;         // a and b are no longer equal

        String firstLine = "Hello, again!";
        System.out.println(firstLine);

        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);

        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);

        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);

        double pi;
        pi = 3.14159;

        double minute3 = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute3 / 60.0);

        double y = 1.0 / 3.0;  // correct

        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        double balance = 123.45;  // potential rounding error
        int balance2 = 12345;     // total number of cents

        System.out.println(1 + 2 + "Hello");
        // the output is 3Hello

        System.out.println("Hello" + 1 + 2);
        // the output is Hello12

        System.out.println(17 * 3);
        System.out.println(hour * 60 + minute);

        int percentage;
        percentage = (minute * 100) / 60;

        hour = minute + 1;  // correct
        // minute + 1 = hour;  // compiler error
    }

}
