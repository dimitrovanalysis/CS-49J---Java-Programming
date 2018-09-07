import java.awt.Rectangle;
import java.util.Comparator;
import java.util.Arrays;


public class ComparingRectangles
{

   public static void main(String[] args)
   {
      Rectangle[] rectangles = {
            new Rectangle(0, 0, 4, 2),
            new Rectangle(0, 0, 7, 2),
            new Rectangle(0, 0, 5, 3),
            new Rectangle(0, 0, 3, 4),           
            new Rectangle(0, 0, 6, 2) };

      //code to sort by perimeter here
      
      Arrays.sort(rectangles, new Comparator<Rectangle>() {
    	  @Override
    	  
    	  public int compare(Rectangle a, Rectangle b) {
    		  int firstPerimiter = (a.width + a.height);
    		  int secondPerimiter  = (b.width + b.height);
    		  return firstPerimiter - secondPerimiter;
    	  }
      });
       
      System.out.println("**Sorted by perimeter");
      for (Rectangle r : rectangles)
      {
         System.out.println(r);
      }

    //code to sort by area here
      
      Arrays.sort(rectangles,new Comparator<Rectangle>(){

    	  @Override
    	  public int compare(Rectangle a,Rectangle b){
    	  int firstArea=(a.width*a.height);
    	  int secondArea=(b.width*b.height);
    	  return firstArea-secondArea;

    	  }

    	  });
            
      System.out.println("**Sorted by area");

      for (Rectangle r : rectangles)
      {
         System.out.println(r);

      }
   }
}
