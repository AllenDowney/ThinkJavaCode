public class Date {
	public static void main(String[] args) {
		//definindo variaveis
		String day = "Friday";
		String month = "April";
		int date = 9;//dia do mês
		int year = 2021;
		
		System.out.println("American Format:");
		System.out.println(day + ", " + month + " " + date + ", " + year );
		
		//formato Europeu
		System.out.println("European Format:");
		System.out.println(day + ", " + date + " " + month + ", " + year );
		
	}
}