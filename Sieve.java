import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sieve 
{
private int upperLimit;

private int count=1;

TreeSet tree = new TreeSet();

public Sieve(int upperLimit)
   {
      this.upperLimit=upperLimit;
   }
   
public Set<Integer>getPrimes()
   {
      boolean []prime = new boolean[upperLimit+1];
      
      Set<Integer> set= new HashSet<Integer>();
      
        //set >2 to true
        for (int i = 2; i <prime.length ; i++)
        {
            prime[i]=true;
        }
        
        int num =2;
        
        while(true)
        {
            for (int i = 2; ; i++) //common alg for determining primes >2
            {
                int multiple = num*i;
                
                if(multiple>upperLimit)
                {
                    break;
                }
                
                else
                {
                    prime[multiple]=false;
                }
            }
            
            boolean numNext = false;
            for (int i = num+1; i < upperLimit+1; i++) 
            {//sorting through nums using baseline
                if(prime[i])
                {
                    num=i;
                    numNext = true;
                    count++;
                    break;
                }

            }
            if(!numNext)
            {
                break;
            }
        }
        //add to our set
        for (int i = 0; i <prime.length ; i++) 
        {
            if(prime[i])
                set.add(i);

        }
      //finally form the set
        tree.addAll(set);
      
      //return the set
        return tree;
    }
    
    
    
    
    public void setUpperLimit(int newUpperLimit)
    {
      
      upperLimit=newUpperLimit;
    }
    
    
    
    public int primeCount()
    {
      return count;
    }
}