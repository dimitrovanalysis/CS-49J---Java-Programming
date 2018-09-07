/**
 * class that find intersections between semicircles
 * @author Konstantin
 *
 */

public class SemiCircle 
{
	private int x;
	private int y;
	private int radius;
	
	/**
	 * constructor for original semicircle
	 * @param centerX center x coordinate
	 * @param centerY center y coordinate
	 * @param theRadius radius of semi circle
	 */
	public SemiCircle(int centerX, int centerY, int theRadius)
	{
		x = centerX;
		y = centerY;
		radius = theRadius;
	}
	
	/**
	 * contains method that tests a given point to see if the
	 * semi circle contains that point inside of it
	 * @param otherX given x coordinate for other point
	 * @param otherY given y coordinate for other point
	 * @return returns a boolean of whether or not the point is inside the semicircle
	 */
	public boolean contains(int otherX, int otherY)
	{
		boolean insideSemiCircle = false;
		boolean onCircumference = false;
		double putInRoot = Math.pow(otherX - x, 2) + Math.pow(otherY - y, 2);
		
		double distance = Math.sqrt(putInRoot);
		
		if (  ( (x + radius >= otherX) && (otherX >= x-radius)) && (otherY == distance + y)  )
		{
			onCircumference = true;
		}
		
		
		if ( (distance < radius) && ((otherY > y-radius) && (otherY < y)) && !onCircumference )
		{	
			insideSemiCircle = true;
		}
		
		return insideSemiCircle;
	}
	
	/**
	 * method that takes another semicircle and checks to see if its extremes intersect
	 * with the original semicircle given
	 * @param other other provided semi circle
	 * @return returns  boolean whether or not the given semicircle shares extremes inside the other  
	 */
	public boolean intersects (SemiCircle other)
	{
		boolean intersects = false;
		
		int otherWesternEnd = other.x - other.radius;
		int otherNorthernEnd = other.y - other.radius;
		int otherEasternEnd = other.x + other.radius;
		int westernEnd = x - radius;
		int northernEnd = y - radius;
		int easternEnd = x + radius;
		
		
		if( other.contains(westernEnd, y) || other.contains(easternEnd, y) || other.contains(x, northernEnd) || other.contains(otherWesternEnd, y) || other.contains(otherEasternEnd, y) || other.contains(x, otherNorthernEnd)
			||	other.contains(westernEnd, northernEnd) || other.contains(otherWesternEnd, otherNorthernEnd) || other.contains(easternEnd, otherNorthernEnd) || other.contains(otherEasternEnd, northernEnd)
			||	other.contains(otherWesternEnd, northernEnd) || other.contains(westernEnd, otherNorthernEnd) || other.contains(otherEasternEnd, otherNorthernEnd) || other.contains(easternEnd, northernEnd))
		{
			intersects = true;
		}
		return intersects; 
	}
}