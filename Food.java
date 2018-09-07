
public class Food extends Product 
{

	private int carbs;

	public Food(String theDescription, double thePrice, int grams) 
	{
		super(theDescription, thePrice);
		setCarbs(grams);

	}


	public int getCarbs() 
	{
		return carbs;
	}

	public void setCarbs(int grams) 
	{	
		this.carbs = grams;
	}

  

	boolean isLowCarb()
	{
		if(carbs<=10)
			return true;

		else
			return false;
	}

	@Override
	public String getDescription()
	{
		return super.getDescription()+" "+" carbs="+getCarbs();
	}

}