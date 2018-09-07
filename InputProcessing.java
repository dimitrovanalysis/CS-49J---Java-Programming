import java.util.Scanner;

public class InputProcessing
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

	       double temperature = 0;
	       int count = 0;
	       String stringOfNumbers = "";
	       System.out.print("Enter a double or Q to quit: ");
	       double min = 0;
	       boolean first = true;
	       boolean first1 = true;
	       int minCounter = 0;
	        
	        while (scan.hasNextDouble())
	        {
	            double input = scan.nextDouble();
	            minCounter++;
	            
	            if (input > 0)
	            {
	            temperature = temperature + input;
	            count++;
	            }
	            
	            if(first)
	            {
	            	min = input;
	            	first = false;
	            }
	            
	            if(min > input)
	            {
	            	min = input;
	            }
	            
	            if (input == 0 || input == 1.0 || input == 2.0 ||input == 3.0 || input == 4.0 ||input == 5.0 || input == 6.0 ||input == 7.0 || input == 8.0 ||input == 9.0 || input == 10.0 || input == -1.0 || input == -4.0 || input == -10.0)
	            {
	            	if (first1)
	            	{
	            		stringOfNumbers = "" + input;
	            		first1 = false;
	            	}
	            	else
	            	{
		            	stringOfNumbers = stringOfNumbers + ", " + input;
	            	}
	            	
	            }

	            
	            System.out.print("Enter a double or Q to quit: ");
	        }
	        
	        
            

            if (minCounter == 0) {
            	System.out.print("no input");
            }
   
            else
            {
               System.out.println(stringOfNumbers);
               System.out.println(min);
            
            }
            
	        
	        double average = 0;
	        
	        if (count > 0)
	        {
	        	average = temperature / count;
	        	System.out.print( average );
	        }
	        else if (minCounter == 0)
	        {
	           System.out.print("");
	        }
	        else
	        {
	        	System.out.println("0");
	        }
	        
	    scan.close();
	    
	}
}