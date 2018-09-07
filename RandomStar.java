import java.awt.Graphics2D;
import java.util.Random;


public class RandomStar
{
	private Random gen;
	
private int x;
private int y;
private int maxDistFromCenter;
private int numLines;


	public RandomStar(int centerX, int centerY, int theMaxDistFromCenter, int theNumLines )
	{
		gen = new Random(987654321);
		x = centerX;
		y = centerY;
		maxDistFromCenter = theMaxDistFromCenter;
		numLines = theNumLines;
		
	
	}
	
	
	public void draw(Graphics2D g2)
	{
		for(int i = 0; i < numLines; i++)
		{
			int x2 =  x+ gen.nextInt(maxDistFromCenter * 2)- maxDistFromCenter;
			int y2 =  y+ gen.nextInt(maxDistFromCenter * 2)- maxDistFromCenter;
			g2.drawLine(x, y, x2, y2);
			
		
		}

	}
	
}