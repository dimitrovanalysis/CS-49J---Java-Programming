/**
 * interestAccount subclass of BankAccount class
 * @author Konstantin
 *
 */
public class InterestAccount extends BankAccount 
{
	//(.0009/12)
   public static final double INTEREST_RATE=0.00075;
   
/**
 * interestAccount subclass constructor passes values to banKaccount for construction
 * @param balance account balance
 * @param id string of account name
 */
   public InterestAccount(double balance, String id)
   {
       super(balance, id);
   }

   /**
    * endofmonth method finds the balance at the end of the month using interest rate
    */
   public void endOfMonth()
   {      
       double superBalance=super.getBalance(); 
       
       double interest=superBalance*INTEREST_RATE;
       
       super.deposit(interest);      
   }

}