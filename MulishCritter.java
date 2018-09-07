/**
 * mulishcritter subclass of critter supeclass
 * @author Konstantin
 *
 */

public class MulishCritter extends Critter 
{


   int i=3; // used for % in move method
   
   /**
    * mulishcritter auto gen. constructor passed to super
    * @param weight the given weight 
    */
   public MulishCritter(double weight) 
   {
       super(weight);
   }

   
   /**
    * move algorithm working as described - critter moves every third time 
    * you tell it to
    * @param moves the provided moves.
    */
   @Override public void move(int moves)
   {
       if(i%3 == 0 && i/3!=0)
           super.move(moves);
       i++;
   }


}