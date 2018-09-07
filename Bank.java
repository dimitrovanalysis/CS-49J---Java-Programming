import java.util.ArrayList;
import java.util.List;

/**
 * Bank class manages Bankaccount objects
 * @author Konstantin
 *
 */
public class Bank {

   ArrayList<BankAccount> list;

   /**
    * Bank constructor
    */
   public Bank() {
	   
       list = new ArrayList<BankAccount>();
   }

   
   /**
    * add method that adds the given bankAccount objects to the list
    * @param bankAccount user given specific bank account
    */
   public void add(BankAccount bankAccount) {
       list.add(bankAccount);
   }

   /**
    * method that puts account with largest balance first 
    * 
    */
   public void largestFirst() {
	   
       double max = 0;
       int index = -1;
       
    
       for (int i = 0; i < list.size(); ++i) 
       {
           BankAccount b = list.get(i);
           
           if (b.getBalance() > max) 
           {
               max = b.getBalance();
               index = i;
               
           }

       }
       
       
       if (index != -1) 
       {
           BankAccount b = list.get(index);
           list.remove(index);
           list.add(0, b);
           
       }
       
   }

   
   /**
    * contains class that determines if given bankaccount is in the bank
    * @param bankAccountId user provided bank account id
    * @return returns true for {in the list} and false for not.
    */
   public boolean contains(String bankAccountId) {
	   
       for (int i = 0; i < list.size(); ++i) 
       {
           BankAccount b = list.get(i);
           
           if (b.getAccountId().equals(bankAccountId))
        	   
               return true;
       }
       
       return false;
   }

   
   /**
    * list method figures out a list of bankaccounts that have a balance over a certain amount
    * @param balance user provided balance used for comparison
    * @return returns the account ids that have such a balance greater than the target
    */
   public List<String> list(double balance) 
   {
       ArrayList<String> accountList = new ArrayList<String>();
       for (int i = 0; i < list.size(); ++i) 
       {
           BankAccount b = list.get(i);
           
           if (b.getBalance() > balance)
           {
               accountList.add(b.getAccountId());
           }    
       }
       return accountList;
   }

   
   /**
    * list method finds BankAccount ids in the bank
    * @return returns an array of ids in the bank
    */
   public List<String> list() 
   {
	   
       ArrayList<String> idList = new ArrayList<String>();
       
       
       for (int i = 0; i < list.size(); ++i)
       {
           BankAccount b = list.get(i);
           
           idList.add(b.getAccountId());
           
       }
       return idList;
   }


}