import java.util.Scanner;
import java.util.Random;

/**
*
*This program will prompt the user to guess a random number, and it will try to make
easer for the user guess it right.
*
**/
public class GuessTheNumber {
		
	/**
	*
	*if the user guess it right, this method will show a congratulations message
	*
	**/
    public static void verifyGuess(int guess, int rand) {
		
		if (guess == rand) {
			System.out.println("Parabens, voce acertou!");
		}else {
			hintGuess(guess, rand);
		}			
        
    }
	
	public static void hintGuess(int guess, int rand) {
		
		if (guess < rand){
			System.out.print("Muito baixo, ");
			tryAgain(guess, rand);
		}
		else {
			System.out.print("Muito alto, ");
			tryAgain(guess, rand);
		}
		
	}
	
	/**
	*
	*if the user dont't the get number right, this method will prompt him to try again
	*
	**/
    public static void tryAgain(int a, int b) {
		
		Scanner in = new Scanner(System.in);
		int otherChance = a;
		
        System.out.print("tente de novo: ");
		otherChance = in.nextInt();
		
		verifyGuess(otherChance, b);
	
    }
	
	/**
	*
	*Main method, all begins here
	*
	**/
	public static void main (String[] args ) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int randNumber = random.nextInt (20) + 1;
		int user_guess;
		
		System.out.print("Adivinhe o numero de 1 a 20 que estou pensando: ");
		user_guess = in.nextInt();
		
		verifyGuess(user_guess, randNumber );
	}
	

}
