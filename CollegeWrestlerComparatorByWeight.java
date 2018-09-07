import java.util.Comparator;

public class CollegeWrestlerComparatorByWeight implements Comparator<CollegeWrestler> 
{
  
   public int compare(CollegeWrestler firstWrestler, CollegeWrestler secondWrestler)
   {
      
       return Double.compare(firstWrestler.getWeight(), secondWrestler.getWeight());
   }
   
}