import java.util.Scanner;

public class Conversor {
	public static void main(String[] args) {
		int inches, feet, remainder;
		double cm;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FEET = 12;
		Scanner in = new Scanner(System.in);
		
		//prompt the user and get the value
		System.out.print("Exactly how many cm? ");
		cm = in.nextDouble();
		
		//convert and output the result
		inches = (int)(cm / CM_PER_INCH);
		feet = inches / IN_PER_FEET;//get the quoeficient
		remainder = inches % IN_PER_FEET;//get the remainder
		
		System.out.printf("%.2f in feet = %d feet and %d inches", cm, feet, remainder);
		
	}
}