import java.util.Scanner;
import java.util.Random;

public class Exer4 {
		
	
    
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
	

    public static void tryAgain(int a, int b) {
		Scanner in = new Scanner(System.in);
		int otherChance = a;
		
        System.out.print("tente de novo: ");
		otherChance = in.nextInt();
		
		verifyGuess(otherChance, b);
	
    }
	
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
