
/**
 * painting sub class from product
 * @author Konstantin
 *
 */
public class Painting extends Product
{
private double price;
private String description;
private String artist;
/**
* Constructs for a product with price/description and artist
* @param thePrice the price of product
* @param theDescription the description of product
* @param theartist the artist of the painting
*/
  
public Painting(String theDescription, double thePrice, String theartist)
{
   super(theDescription, thePrice);
   this.price = thePrice;
   this.description = theDescription;
   this.artist = theartist;
}



/**
* getArtist method returns the artist
* @return returns the artist of this product
*/
public String getArtist()
{
	return artist;
}
/**
* sameArtist method takes in another painting and compares to see if artists are the same
* @param otherPainting the painting the original is being compared to
* @return true if the artist of this Product object and other object artist
*
*/
public boolean sameArtist( Painting otherPainting)
{
	
   if(otherPainting.artist==artist)
	   return true;
   else
	   return false;
}


  
/**
* getDescription method overidess other description method in super class
* 
* @return returns the description being "description + artist"
*/
@Override public String getDescription()
{
	return description+" "+artist;
}



/**
* getPrice method finds the price of product
* @return returns the price of product
*/
public double getPrice()
{
	return price;
}




}