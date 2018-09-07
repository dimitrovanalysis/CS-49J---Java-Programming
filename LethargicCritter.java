/**
 * Lethargic critter only eats and sleeps.
 * 
 */
public class LethargicCritter extends Critter
{
    private boolean timeToEat;

    /**
     * Constructor for objects of class LethargicCritter
     * with the given weight and a position of 0
     * @param weight weight of this critter
     */
    public LethargicCritter(double weight)
    {
        super(weight);
        timeToEat = true;
    }
    
    @Override
    public void move(int steps)
    {
        if (timeToEat)
        {
            addHistory("eat");
        }
        else
        {
            addHistory("sleep");
        }
        
        timeToEat = !timeToEat;
    }
    
    public String toString()
   {
      return "Lethargic"+super.toString()+"[timeToEat=" + timeToEat + "]";
   }
  
   public boolean equals(LethargicCritter other)
   {
   if(!super.equals(other))
   {
       return false;
   }
   
   if(timeToEat == other.timeToEat)
   {
       return true;
   }
   
   if(super.getClass() != other.getClass())
   {
       return false;
   }
   return false;      
   }
}
