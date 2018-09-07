/**
 * A bank account has a balance that can be changed by 
 * deposits and withdrawals 
 *
 */
public class BankAccount
{  
    private double balance;
    public final static double MINIMUM_BALANCE = 1500;
    public final static double BELOW_MINIMUM_FEE = 10.0;

    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {   
        balance = initialBalance;
    }


    /**
       Deposits money into the bank account.
       @param amount the amount to deposit
     */
    public void deposit(double amount)
    {  
        balance = balance + amount;
    }

    /**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {   
        balance = balance - amount;
    }

    /**
       Gets the current balance of the bank account.
       @return the current balance
     */
    public double getBalance()
    {   
        return balance;
    }

    /**
     * Do end of month processing for the account
     */
    public void endOfMonth()
    {
        if (balance < MINIMUM_BALANCE)
        {
            balance = balance - BELOW_MINIMUM_FEE;
        }
    }
    
    public String toString() 
    {
       return "BankAccount[balance="+balance+"]";
    }
    
   public boolean equals(BankAccount account)
   {
    if(account == null)
       return false;
       
    if(getClass() == account.getClass() && balance ==account.balance)
       {
        return true;
       }
       
     return false;
   }
}
