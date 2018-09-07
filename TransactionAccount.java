/**
 * transactionAccount subclass from bankaccount class
 * @author Konstantin
 *
 */
public class TransactionAccount extends BankAccount 
{
	public static final double FEE_BELOW_MINIMUM = 5.0;
    public static final int FREE_TRANSACTIONS = 4;
    public static final double MINIMUM_BALANCE = 1500;
   
   private int numTransactions;
  
   /**
    * subclass constructor providing empty string and 0 to superconstructor
    */
   public TransactionAccount() 
   {
       super(0, "");
       numTransactions=0;
   }

   /**
    * subclass constructor with given balancee and id
    * @param initialAmount provided initial ammount for transaction
    * @param id string name for account
    */
   public TransactionAccount(double initialAmount, String id)
   {
       super(initialAmount, id);      
   }
   
   
   /**
    * method that deposits amount into bank account, incrementing number of 
    * transactions by 1 each time.
    * @param amount the given amount
    */
   public void deposit(double amount)
   {
       super.deposit(amount);
       numTransactions++;
   }

   
   /**
    * method that withdraws amount from bank account, incrementing number of 
    * transactions by 1 each time
    * @param amount the given amount
    */
   public void withdraw(double amount) 
   {
       super.withdraw(amount);
       numTransactions++;
   }
   
   /**
    * method that withdraws the fee if the minimum number of transactions has been reached.
    * resets number of transactions
    */
   public void endOfMonth()
   {
       if (numTransactions>FREE_TRANSACTIONS)
       {          
           super.withdraw((numTransactions-FREE_TRANSACTIONS)*FEE_BELOW_MINIMUM);
           numTransactions=0;
       }                 
   }

}