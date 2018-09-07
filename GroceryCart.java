import java.io.*;
import java.util.*;

public class GroceryCart
{
   
   public static void main(String[] args) throws FileNotFoundException
   {
      
       String fileName = "items.txt";
      
       Scanner scan = new Scanner(new File(fileName));
      
       String name;
       double unitPrice;
       double productPrice;
       double totalPrice=0;
       int quantity;
      
       
       String header = scan.nextLine();
      
       
       while(scan.hasNext())
       {
          name  = "";
           while(!scan.hasNextDouble())
            {
               name = name + " " + scan.next();
           }
          
           
           unitPrice = scan.nextDouble();
           quantity = scan.nextInt();
           
           productPrice = unitPrice *quantity;
          
           
           System.out.printf("%-20s %8.2f %8d %8.2f\n", name, unitPrice, quantity,productPrice);
          
           
           totalPrice = totalPrice + productPrice;
       }
      
       
       System.out.printf("Total: $%.2f\n", totalPrice);
      
       
       scan.close();
   }
}