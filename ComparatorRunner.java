import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparatorRunner
{

   public static void main(String[] args)
   {
      
      ArrayList<CollegeWrestler> wrestlers = new  ArrayList<CollegeWrestler>();
      wrestlers.add(new CollegeWrestler("Collin", 175.5));
      wrestlers.add(new CollegeWrestler("Dong", 124.5));
      wrestlers.add(new CollegeWrestler("Jose", 140.9));
      wrestlers.add(new CollegeWrestler("Enrique", 290));
      
       Collections.sort(wrestlers,new CollegeWrestlerComparatorByWeight());
       
       for(CollegeWrestler wByWeight:wrestlers)
           System.out.println(wByWeight.getWeight()+" "+wByWeight.getName());
           
       Collections.sort(wrestlers, new CollegeWrestlerComparatorByName()); 
       
       for(CollegeWrestler wByName:wrestlers)
         System.out.println(wByName.getName()+" "+wByName.getWeight()) ; 
      
   }

}
