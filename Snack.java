

public class Snack extends Product implements Comparable<Snack>, Cloneable
{

   public double price;
   public String description;
   public int gramsOfFat;

   public Snack(String theDescription, double thePrice, int gramsOfFat) 
   {
      
       super(theDescription, thePrice);
       this.description = theDescription;
       this.price = thePrice;
       this.gramsOfFat = gramsOfFat;
   }

   @Override
   public int compareTo(Snack s) 
   {
       if (gramsOfFat < s.gramsOfFat) 
       {
           return gramsOfFat - s.gramsOfFat;
       } 
       
       else if (gramsOfFat == s.gramsOfFat) 
       {
          
           if (price < s.price) 
           {
               return (int) (price - s.price);
           } 
           
           else if (price == s.price) 
           {
               String original=getDescription();
               String param=s.getDescription();
               
               return original.compareTo(param);
           }
           
       } 
       
       else 
       {
           return 0;
       }
       
       return 0;
   }

   public int getGramsOfFat()
   {
       return gramsOfFat;
   }

   public Boolean isHealthier(Snack s) 
   {
       if (gramsOfFat < s.gramsOfFat) 
       {
           return true;
       } 
       else 
       {
           return false;
       }
   }

   public void setGramsOfFat(int gramsOfFat) 
   {
       this.gramsOfFat = gramsOfFat;
   }



@Override
public Object clone() 
{
	try
	{
		return (Snack) super.clone();
	} 
	catch (CloneNotSupportedException e)
	{
		return null;
	}
}



   @Override
   public String toString() 
   {
       return getClass().getName() + "[description=" + getDescription() + ",price="
         + getPrice() + "][gramsOfFat=" + getGramsOfFat() + "]";
   }
}