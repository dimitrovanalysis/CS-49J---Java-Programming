/**
 * class imitating an amazon order
 * items are shown being added and deleted, there is a subtotal
 * and contents window given once program terminantes
 * @author Konstantin
 *
 */


public class AmazonOrder
{
	private double subtotal;
	private String contents;
	
	/**
	 * contructor initializes the empty string to 
	 * contents and 0 to the subtotal
	 */
	public AmazonOrder()
	{
		subtotal = 0;
		contents = "";
		
	}
	
	/**
	 * adds the price of the item to the subtotal
	 * updates the contents with the new item and price
	 * @param cost method takes the cost of the item to add to subtotal
	 */
	public void add(double cost)
	{
		double thePrice = cost;
		subtotal = subtotal + thePrice;
		contents = contents  + "Add Item: " + thePrice + "\n";
		
	}
	
	/**
	 * removes an item from the subtotal
	 * updates the contents with the removal of the item and price
	 * @param cost method takes the cost of the item to remove it from the subtotal
	 */
	public void remove(double cost)
	{
		double thePrice = cost;
		subtotal = subtotal - thePrice;
		contents = contents  + "Remove Item: " + thePrice + "\n";
	}
	
	/**
	 * gets the subtotal of all transactions so far
	 * @return returns the subtotal of the current transaction
	 */
	public double getSubtotal()
	{
		return subtotal;
	}
	
	/**
	 * calculates the total with the constant TAX
	 * @return returns the total with the tax
	 */
	public double getTotal()
	{
		final double TAX = .085;
		double total = subtotal + (subtotal * TAX);
		return total;
	}
	
	/**
	 * gets the total contents so far in the transaction
	 * @return returns the total contents so far in the transaction
	 */
	public String getContents()
	{
		String totalAmount = "Total: " + getTotal() + "\n";
		return contents + totalAmount;
		
	}
	
	/**
	 * reset the subtotal back to 0 and the contents to the empty
	 * string
	 */
	public void reset()
	{
		subtotal = 0;
		contents = "";
		
	}
	
}