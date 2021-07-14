import java.util.Random;
import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int user_guess;
		int number = random.nextInt (100) + 1;
		
		//prompt the user to choose a number between 1 to 100
		System.out.print("Guess the number i'm thinking (between 1 to 100): ");
		user_guess = in.nextInt();
		
		//output the result
		System.out.printf("Your guess number was %d\n", user_guess);
		System.out.printf("The number i choose was %d\n\n", number);
		
		//using condicional because is cool
		if (user_guess == number) {
			System.out.println("Congratulations! you guessed it right. :)");
		}
		else {
			
			System.out.println("I'm sorry, but you failed. :(");
		}
			
			
		
		
		
	}
}