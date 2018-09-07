import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentManager
{
   String name;
   String grade;
   TreeMap<String, String> map = new TreeMap<String, String>();
   
   public StudentManager() 
   {
   }
   
   
      public int getClassSize()
   {
       return map.size();
   }
   
   
   public void add(String name,String grade )
   {
       map.put(name, grade);
   }
   
   
   
   
   public void remove(String name)
   {
       map.remove(name);
   }
   
   public String getPrintableRoster()
   {
       String printableRoster = "";
       
       for(Entry<String, String> entry : map.entrySet())
       {
           String key = entry.getKey();
           printableRoster = printableRoster + key + ": ";
           String value = entry.getValue();
           printableRoster = printableRoster + value + "\n";
           
           
      }
       return printableRoster;
   }

}