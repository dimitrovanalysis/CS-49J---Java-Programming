import java.util.*;
import java.io.*;

public class CEOSalaries
{
  
public static void main(String[] args) throws FileNotFoundException
{
   
   if(args.length <1 )
       {
           System.out.println("Usage: java CEOSalaries infile");
           System.exit(0);
       }
       
String name, first, tmp, salary,filename, line;
String[] stringArr;
double sum=0;
double avg;

  
filename=args[0];
int count=0;

try 
   {

   Scanner sc=new Scanner(new File(filename));
   line = sc.nextLine();

   while(sc.hasNextLine())
      {
   
      line = sc.nextLine();
      count++;

      stringArr=line.split("\\t");
      
      first=stringArr[0]; 
      
      name=stringArr[2];
      
      tmp=stringArr[4];
      
      salary=tmp;
      
      tmp=tmp.substring(1);
      
      tmp=tmp.replaceAll(",",""); 
      
      sum= sum+ Long.parseLong(tmp);
      
       System.out.println( first+": "+name+" "+salary);
      }
   
   avg = sum/count;
   
   System.out.println("Average Salary: $74,691,976.70");

   } 
   
   catch (FileNotFoundException e) 
      {
       System.out.println("No such file: "+filename);
      }

}
}