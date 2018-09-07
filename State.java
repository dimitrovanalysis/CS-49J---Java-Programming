import java.util.Objects;
/**
 * Models a US state with name and area
 */
public class State 
{
    private String name;
    private int area;
    
    /**
     * Constructs a State with name and area
     * @param stateName name of this state
     * @param theArea area of this state
     */
    public State(String stateName, int theArea)
    {
        name = stateName;
        area = theArea;
    }
    
    /**
     * Gets the state name
     * @return     the name of the state
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the state area
     * @return the area of the state
     */
    public int getArea()
    {
        return area;
    }   
    
    public boolean equals(State givenState) 
    {    
        if(givenState==null)
            return false; 
            
        else  
            return (name.equals(givenState.getName()) && area==givenState.getArea());
    }

    public String toString() 
    {  
       
        return String.format("State[name=%s,area=%d]", name,area);
    }
    
   
    public int hashCode() 
    {      
       
       
        return Objects.hash(name,area);
    }
 }
    
    
    
    
