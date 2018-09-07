/**
 * impatientcritter subclass of critter superclass
 * @author Konstantin
 *
 */

public class ImpatientCritter extends Critter 
{
    boolean firstTime = true;

    /**
     * subclass constructor auto. generated from super
     * @param weight given weight
     */
   public ImpatientCritter(double weight) 
   {
       super(weight);
   }
  
   /**
    * move method determines number of moves and moves the critter 
    * @param moves user provided moves
    */
   @Override public void move(int moves)
    {
      
       
       super.move(2*moves);
       
      if(firstTime)
      {
       if(firstTime)
       {
    	   super.addHistory("move to "+super.getPosition());
    	 
    	   firstTime = false;
       }
       else if(firstTime)
       {
           super.addHistory("move to "+super.getPosition());
           firstTime = false;
       }
      }
    }
  
}