
public class FinalPrinter {
	public static void main(String[] args) {
		   
		Day today = new Day();
		System.out.println(today);
	
		Day finalDay = new Day(2017, 12, 13);
		
		System.out.println(finalDay.daysFrom(today));
		   
	   }
}
	