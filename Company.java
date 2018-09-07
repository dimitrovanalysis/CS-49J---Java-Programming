public class Company
{
	private double sum = 0;
	double count = 0;
	private String company = "";
	public Company()
	{
	}
	
	public void add(CompanyEmployee s)
	{
	 company = company + s.getName() + s.getSalary();
	 sum = sum + s.getSalary();
	 count++;
	}
	
	public double getAverageSalary()
	{
		
		double averageS = 0;
		if (company == "")
		{
			return averageS;
		}
		
		else
		{
		 averageS = sum/count;
			
		}
		
		return averageS;
		
	}
	
	
}