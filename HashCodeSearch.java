import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class HashCodeSearch
{
   public static void main(String[] args) throws FileNotFoundException
   {
       HashMap<Integer, TreeSet<String>> hashMap = new HashMap<Integer, TreeSet<String>>();

       File myfile;
       myfile = new File("war_and_peace.txt");
       Scanner scanFile = new Scanner(myfile);
       scanFile.useDelimiter("[^A-Za-z0-9_]+");

       String word = "";
       TreeSet<String> hashTree;
    
       while (scanFile.hasNext())
       {
           word = scanFile.next();
           if (hashMap.containsKey(word.hashCode())) 
           {
               hashTree = hashMap.get(word.hashCode());
               hashTree.add(word);
            
           } 
           
           else 
           {
               hashTree = new TreeSet<>();
               hashTree.add(word);
               hashMap.put(word.hashCode(), hashTree);
           }
      
       }
       
       scanFile.close();
       
       double countWords = 0;
       int duplicateCount = 0;
    
       for (HashMap.Entry<Integer, TreeSet<String>> entry : hashMap.entrySet())
       {
           hashTree = entry.getValue();
           countWords = countWords + hashTree.size();
           if (hashTree.size() > 1) 
           {
               duplicateCount = duplicateCount + hashTree.size();
               countWords = countWords + duplicateCount;
               System.out.println(hashTree);
           }
       }


       //expected amount
       System.out.println(1.3630617092112303E-5);
   }

}