/**
*
*this progmam will display the entire song "99 bottles of beer"
*
**/
public class Exer3 {
	/**
	*99 bottles of beer on the wall,  1
	*99 bottles of beer,   2
	*ya' take one down, ya' pass it around,  3
	*98 bottles of beer on the wall.
	
	*
	
	*No bottles of beer on the wall,  1
	*no bottles of beer,   2
	*ya' can’t take one down, ya' can't pass it around,  4
	*'cause there are no more bottles of beer on the wall!  5
	*
	**/
	public static void justSpace() {
		
		System.out.println();
		//only space in the sake of a easy reading
	}
	
	//this method will be call when the beer is over
	public static void noBottles() {
		
		System.out.println("ya' can't take one down, ya' can't pass it around,");
		System.out.println("'cause there are no more bottles of beer on the wall!");
	}
	
	//this method shall take one beer down
	public static void takeOne(int beer) {
		
		System.out.println("ya' take one down, ya' pass it around,");
		justSpace();
		countDown(beer-1);
	}
	
	public static void countDown(int beer) {
		//if statement to evaluate how many beers are still left 
		if (beer > 0) {
			
			System.out.println(beer + " bottles of beer on the wall,");
			System.out.println(beer + " bottles of beer,");
			takeOne(beer);
		
		} else {
			
			System.out.println("No bottles of beer on the wall,");
			System.out.println("No bottles of beer,");
			noBottles();
		}
			
	}
	
	//main method
	public static void main (String[] args) {
		int bottlesOfBeer = 99;
		countDown(bottlesOfBeer);
	}
}