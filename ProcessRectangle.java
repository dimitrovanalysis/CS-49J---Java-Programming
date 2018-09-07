import java.awt.Rectangle;

public class ProcessRectangle
{

   public static void main(String[] args)
   {
      Rectangle rec = new Rectangle();
      rec.setBounds(100, 200, 80, 50);

      
      rec.translate(20, 25);
      System.out.print(rec.getX());
      System.out.print(", ");
      System.out.println(rec.getY());     
      
      rec.grow(10, 0);
      System.out.println(rec);
      
   }
   
}
