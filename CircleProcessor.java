import java.util.Arrays;

/**
 * class with one private array being used
 * with various functions
 * @author Konstantin
 *
 */
public class CircleProcessor
{
   private Circle[] circleArray;
   
   /**
    * constructor assigning given array to private variable
    * @param circles given circle object
    */
   public CircleProcessor(Circle[] circles)
   {
       circleArray = circles;
   }
   
   /**
    * method calculating the average area of given circles
    * @return returns the average area
    */
   public double averageArea()
   {
       double average = 0;
       double sum = 0;
       for(int i = 0; i < circleArray.length; i++)
       {
           sum = sum + circleArray[i].area();
           average = sum / (i+1);
       }
      
       return average;
   }
   
   /**
    * method that swaps the max and min of the given circle array
    */
   public void swapMaxAndMin()
   {
       int maxIndex = 0;
       int minIndex = 0;
       int j = circleArray.length;
       for(int i = 0; i < circleArray.length; i++)
       {
           if(circleArray[i].area() > circleArray[maxIndex].area())
           {
               maxIndex = i;
           }
           else if(circleArray[i].area() < circleArray[maxIndex].area())
           {
               minIndex = i;
           }
       }
       Circle temp = circleArray[minIndex];
       circleArray[minIndex] = circleArray[maxIndex];
       circleArray[maxIndex] = temp;
   }
  
   /**
    * method that forms a string to be displayed
    * @return returns the formed array string
    */
   public String toString()
   {
       String temp ="";

       
           temp = temp + Arrays.toString(circleArray) + "\n";
       
       return temp;
   }
  

 
}