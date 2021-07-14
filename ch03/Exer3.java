import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p_sec; 
		int p_hour;
		int p_min;
		int secRemain;
		final int HOUR = 3600;
		final int MINUTES = 60;
		
		//prompt the user and getting the values
		System.out.print("Enter an amount of seconds: ");
		p_sec = in.nextInt();
		
		//Convert and output the result
		p_hour = p_sec / HOUR;
		p_min = (p_sec - (p_hour * HOUR)) / MINUTES;
		secRemain = p_sec % MINUTES;
		
		System.out.printf("%d seconds = %d hours, %d minutes ", p_sec, p_hour, p_min);
		System.out.printf("and %d seconds", secRemain);
			
	}
}