/**
* An account that earns interest every month
*/
public class SavingsAccount extends BankAccount
{
  private double annualInterestRate;
 
  /**
   * Creates a InterestAccount object with a starting balance and account id
   * @param initialBalance the starting balance
   * @param rate the annual interest rate
   */
  public SavingsAccount(double initialBalance, double rate)
  {
      super(initialBalance);
      annualInterestRate = rate;
  }
  
  public double getInterestRate()
  {
     return annualInterestRate;
  }
  
  @Override
  public void endOfMonth()
  {
      double interest = getBalance() * annualInterestRate / 100 /12;
      deposit(interest);
  }
  
  public String toString() 
  {
   return "SavingsAccount[balance="+getBalance()+"][anualInterstRate="+annualInterestRate+"]";
  }

  public boolean equals(SavingsAccount account)
  {
   if(account == null)
       return false;
       
   if(getBalance() ==account.getBalance())
   {
       return true;
   }
   return false;
}
}
