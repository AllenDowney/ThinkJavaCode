	public class Time {
			public static void main(String[] args) {
					//definindo variaveis
					int hour = 16 ;
					int minute = 30;
					int second = 59;
					double dayPercent = hour * 100 / 24;
					int hourInSecond = hour * 3600 ;
					int hourNow = 17 - hour;
					int minuteNow = 34 - minute;
					
					
					System.out.println("The number of secods since midnight is " + hourInSecond + " secods!");
					System.out.println("The percent of the day that has passed is " + dayPercent + "%");
					//hora atual
					System.out.println("The current time is " +hour + ":" + minute + ":" + second + "pm");
					//tempo decorrido desde o inicio do exercicio
					System.out.println("Elapsed time since i started is " + hourNow + " hour and " + minuteNow + " minutes.");
					



			}
	}