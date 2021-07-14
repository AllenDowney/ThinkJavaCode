import java.util.Scanner;

public class BugScanner {
	public static void main(String[] args) {
		String name;
		int age;
		Scanner in = new Scanner(System.in);

		//prompt the user and get the values
		System.out.print("What's your name? ");
		name = in.nextLine();
		System.out.print("How old are you? ");
		age = in.nextInt();
		
		//output the result
		System.out.printf("\nHello %s, age %d!\n\n", name, age);
		
		//TIME FOR TEST THE SCANNER BUG.................
		System.out.print("-----TIME FOR THE BUG-------\n\n ");
		System.out.print("How old are you? ");
		age = in.nextInt();
		System.out.print("What's your name? ");
		name = in.nextLine();

		//i'm so anxious
		System.out.printf("\nHello %s, age %d!\n\n", name, age);
		
		//FIXING THE BUG-------------
		System.out.print("-----FIXING THE BUG------\n\n ");
		System.out.print("How old are you? ");
		age = in.nextInt();
		in.nextLine();//<--------this solve the problem
		System.out.print("What's your name? ");
		name = in.nextLine();

		//i'm so anxious
		System.out.printf("\nHello %s, age %d!\n", name, age);
	}	
}