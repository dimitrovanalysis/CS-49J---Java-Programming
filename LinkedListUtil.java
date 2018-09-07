import java.util.LinkedList;

public class LinkedListUtil 
{
   public static void shrink(LinkedList<String> strings, int n)
   {
       for(int i=n-1;i<strings.size();i= i+n)
       {
    	   strings.remove(i);
    	   i--;
       }
   }
   
   
   public static LinkedList<String> reverse(LinkedList<String> strings) 
   {
       for(int i=0;i<strings.size()/2; i++)
       {
           String temp =(String) strings.get(i);
           strings.set(i, strings.get(strings.size()-1-i));
           strings.set(strings.size()-1-i,temp);
       }
       return strings;
   }
}