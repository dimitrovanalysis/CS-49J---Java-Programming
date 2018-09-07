import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GirlNamesWithZ
{
    public static void main(String[] args) throws FileNotFoundException
    {
       String filename = "babynames2000s.txt"; 
       Scanner scan = new Scanner(new File(filename));
       scan.nextLine();
       scan.nextLine();
       
       while(scan.hasNextLine()) 
       {
          
         String line = scan.nextLine();
         String names[] = line.split("\\s+");
         String girl = names[3];
            
            if(girl.contains("z") || girl.contains("Z")) 
            {
               System.out.println(girl);
            }
       }
        scan.close();
       
    }
}
