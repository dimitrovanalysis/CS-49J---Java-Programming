import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Rainbow
{
	private int x;
	private int y;
	private int height;
	
	public Rainbow(int givenX, int givenY, int givenHeight)
	{
		x = givenX;
		y = givenY;
		height = givenHeight;	
	}
	
	
	public void draw(Graphics2D g2)
	{
		int width  = height * 5;
		
		Rectangle red = new Rectangle(x,y, width, height );
		g2.setColor(Color.RED);
		g2.fill(red);
	 	Rectangle orange = new Rectangle(x,y + height, width, height);
	 	g2.setColor(Color.ORANGE);
		g2.fill(orange);
		Rectangle yellow = new Rectangle(x,y + (height * 2), width, height );
		g2.setColor(Color.YELLOW);
		g2.fill(yellow);
	 	Rectangle green = new Rectangle(x,y + (height * 3), width, height );
	 	g2.setColor(Color.GREEN);
		g2.fill(green);
		Rectangle blue = new Rectangle(x,y + (height * 4), width, height );
		g2.setColor(Color.BLUE);
		g2.fill(blue);
		Rectangle indigo = new Rectangle(x,y + (height * 5), width, height);
		Color Indigo = new Color(75,0,130);
		g2.setColor(Indigo);
		g2.fill(indigo);
		Rectangle violet = new Rectangle(x,y + (height * 6) , width, height);
		Color Violet = new Color(143,0,255);
		g2.setColor(Violet);
		g2.fill(violet);
		
		
	}
	
}