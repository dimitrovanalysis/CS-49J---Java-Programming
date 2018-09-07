import java.util.Scanner;

public class InputStuff
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your favorite dessert: ");
		String input = scan.nextLine();
		
		if(input.equals ("brownies"))
		{
			System.out.println("Delicious");
			
		}
		
		else if(input.equals ("chocolate cake"))
		{
			System.out.println("Yummy");
		}
		
		else
		{
			System.out.println("All sugar is good");
		}
		
		System.out.print("Enter a double: ");
		double inputDouble = scan.nextDouble();
		System.out.print("Enter an integer: ");
		int inputInt = scan.nextInt();
		double answer = inputDouble * inputInt;
		System.out.println(answer);
		
		if(answer > 0)
		{
			System.out.println("That's a positive");
			// this gives us 2 decimal places
		}
		
		else if(answer == 0)
		{
			
		System.out.println("That's nothing");	
		}
		
		else
		{
		System.out.println("What a negative");
			
		}
		scan.close();
	
	
		
		
		
		
	}
	
	
	
}