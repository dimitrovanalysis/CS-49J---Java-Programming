import java.util.TreeSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WordLengthFinder
{
   public static void main(String[] args)
   {
       String passage = "mary had a little lamb";
       Scanner scan = new Scanner(passage);
       scan.useDelimiter("[^A-Za-z0-9]+");
       TreeMap<Integer, TreeSet<String>> treeMap = parsePassage(scan);
       
       while (!treeMap.isEmpty()) //IF NOT empty
       {
            System.out.println(treeMap.pollFirstEntry().getValue());
       }
    }
   
    private static TreeMap<Integer, TreeSet<String>> parsePassage(Scanner scan) 
    {
        Map<Integer, TreeSet<String>> treeMap = new TreeMap<>();
        while (scan.hasNext()) 
        {
            String s = scan.next(); 
            int length = s.length(); 
            if (treeMap.containsKey(length))
            { 
               
                Set<String> set = treeMap.get(length); 
                set.add(s); 
            }
            
            else //NEWSET
            { 
               
                Set<String> set = new TreeSet<>();
                set.add(s); 
                treeMap.put(length, (TreeSet<String>) set); 
            }
        }
        
        return (TreeMap<Integer, TreeSet<String>>) treeMap;
    }

}
