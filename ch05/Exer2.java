/**
*
*this program will output the date in two formats; American and European
*
**/

public class Exer2 {
	
	/**
	*
	*this method will receive the four integer number and do the math
	*
	**/
	public static void checkFermat(int a, int b, int c, int n) {
		int anPow = (int) Math.pow(a, n);
		int bnPow = (int) Math.pow(b, n);
		int cnPow = (int) Math.pow(c, n);
		
		int abSum = anPow + bnPow;
		
		//condicional to evaluate if his theorem is true or not.
		if (n > 2 && abSum == cnPow) {
			
			System.out.println("Holy smokes, Fermat was wrong!");
		
		} else {
			
			System.out.println("No, that doesn't work");	
		}
		
	}
	
	/**
	*
	*main method
	*
	**/
	public static void main(String[] args) {
		
		checkFermat(4, 4, 2, 5);
	}
}