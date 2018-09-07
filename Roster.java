import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Roster
{
	List<Student> list;
	
	public Roster()
	{
		list = new LinkedList<Student>(); 
		
	}
	
	
	public void add(Student s)
	{
		list.add(s);
		Collections.sort(list, new Comparator<Student>() 
		{ 
			public int compare(Student firstN, Student secondN) 
			{
				return firstN.getName().compareTo(secondN.getName());
			}
		}
						);
		
	}
	
	public void remove(String name)
	{
	   for(Student s : list) // efficient for loop for iteration
	   {
	      if(s.getName().equals(name))
	      {
	           list.remove(s);
               break;
	      }
	   }
	}
	
	public List<String> getNames()
	{
		 List<String> listOfNames = new ArrayList<String>();
	       for(Student s : list) //special loop for iteration.
	       {
	           listOfNames.add(s.getName());
	       }
	       
	       
	       return listOfNames;
	   }
	}
	
