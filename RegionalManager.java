import java.util.ArrayList;


public class RegionalManager
{
ArrayList<State> list;
	
	public RegionalManager()
	{
		list = new ArrayList<State>(); 
		
	}
	
	public void include(State state)
	{
		list.add(state);
		
	}
	
	public String smallest()
	{
		String smallest = "";
		int smallestArea = list.get(0).getArea();
		int index = 0;
		
		for (int i = 1; i < list.size(); i++)
		{
			
			if (list.get(i).getArea() < smallestArea)
			{
				smallestArea = list.get(i).getArea();
				index = i;
			}
			smallest = list.get(index).getName();
		}

		
		return smallest;
	}
	
	public ArrayList<String> getNames()
	{
		ArrayList<String> names = new ArrayList<>();
		
		
		for (int i = 0; i < list.size(); i++)
		{
			names.add(list.get(i).getName());
		}
		
		return names;
	}
	
}