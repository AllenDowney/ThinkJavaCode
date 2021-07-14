/**
*
*this program will output the date in two formats; American and European
*
**/
public class Exer2 {
	//this method  will print the American format
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.print("American Format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year );
	}
	
	//this method  will print the European format
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.print("European Format: ");
		System.out.println(day + ", " + date + " " + month + ", " + year );
	}
	
	//main method
	public static void main(String[] args) {
		//definindo variaveis
		String day = "Friday";
		String month = "April";
		int date = 9;//dia do mês
		int year = 2021;
		
		printAmerican(day, month, date, year);
		printEuropean("Monday", 19, "April", 2021);
		
	}
}