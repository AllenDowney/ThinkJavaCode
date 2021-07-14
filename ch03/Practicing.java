import java.util.Scanner;

public class Practicing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int inch = 100;
		final double CM_PER_INCH = 2.54;// "final" torna a variavel uma constante
		double cm = inch * CM_PER_INCH;
		
	/*	
		System.out.print("What's your name? ");
		name = in.nextLine();//armazenando nome na variavel line
		System.out.println("Your name is " + name);
		System.out.print("How many inchs? ");
		inch = in.nextInt();
		
		cm = inch * CM_PER_INCH;
		
		System.out.println(inch + " in cm = " + cm);
	*/

		System.out.printf("%d in cm = %.2f cm \n", inch, cm);
	}
}