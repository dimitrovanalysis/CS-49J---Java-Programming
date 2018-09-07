import java.util.ArrayList;

/**
 * A simulated critter.
 */
public class Critter
{
    private int position;
    private double weight;
    private ArrayList<String> history;

    /**
    Constructs a critter at position 0 with blank history.
     */
    public Critter(double theWeight)
    {
        position = 0;
        weight = theWeight;
        history = new ArrayList<String>();
    }

    /**
    Gets the history of this critter.
    @return the history
     */
    public ArrayList<String> getHistory()
    {
        return history;
    }

    /**
    Adds to the history of this critter.
    @param event the event to add to the history
     */
    public void addHistory(String event)
    {
        history.add(event);
    }

    /**
    Gets the position of this critter.
    @return the position
     */
    public int getPosition()
    {
        return position;
    }

    /**
    Moves this critter.
    @param steps the number of steps by which to move.
     */
    public void move(int steps)
    {
        position = position + steps;
        addHistory("move to " + position);
    }

    public double getWeight()
    {
        return weight;
    }
    
    public String toString()
   {
      return "Critter[position="+position+",weight="+weight+",history="+history.toString()+"]";
   }


   public boolean equals(Critter other)
   {
   if(other == null)
       return false;
       
   if(position != other.position)
       return false;
       
   if(weight != other.weight)  
       return false;
       
   return history.toString().contentEquals(other.history.toString())?true:false;  
   }
}
