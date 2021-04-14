import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		double celsius;
		double fahrenheit;
		Scanner in = new Scanner(System.in);
		
		//prompt the usuer and get the value
		System.out.print("Type a tempature in Celsius: ");
		celsius = in.nextDouble();
		
		//convert and output the result
		fahrenheit = (celsius * 9/5) + 32;
		System.out.printf("%.1f = %.1f F", celsius, fahrenheit);
		
	}
}