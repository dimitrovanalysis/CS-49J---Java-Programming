import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class RectangleSorter
{
   public static void sortByArea(ArrayList<Rectangle> list)
   {
	   Collections.sort(list, new Comparator<Rectangle>() 
	   {

		   @Override public int compare(Rectangle rectangle1, Rectangle rectangle2) 
		   {

			   if(rectangle1.getHeight()*rectangle1.getWidth() > rectangle2.getHeight()*rectangle2.getWidth())
				   return 1;

			   else if(rectangle1.getHeight()*rectangle1.getWidth() < rectangle2.getHeight()*rectangle2.getWidth())
				   return -1;
     
			   else
				   return 0;
		   }

       }
	   );
   }

   public static void sortByDescendingPerimeter(ArrayList<Rectangle> list)
   {
       Collections.sort(list, new Comparator<Rectangle>() 
       {
           @Override// dont need to add all together since it wont make difference
           public int compare(Rectangle rectangle1, Rectangle rectangle2) 
           {

               if((rectangle1.getHeight()+rectangle1.getWidth()) > (rectangle2.getHeight()+rectangle2.getWidth()))
                   return -1;

               else if((rectangle1.getHeight()+rectangle1.getWidth()) < (rectangle2.getHeight()+rectangle2.getWidth()))
                   return 1;

               else
                   return 0;

           }

       });

   }

}

