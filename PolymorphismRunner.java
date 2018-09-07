public class PolymorphismRunner
{
  
   public static void main(String[] args) {
   BankAccount account[] =new BankAccount[5];
   account[0]=new BankAccount(1000);
   account[1]=new SavingsAccount(1000,0.01);
   account[2]=new CheckingAccount(3000,3);
   account[3]=new SavingsAccount(1000,0.01);
   account[4]=new SavingsAccount(2000,0.012);


int i;


for(i=0;i<5;i++)
{
  account[i].deposit(200);
} 

for(i=0;i<5;i++)
{
  account[i].withdraw(100);
}     

for(i=0;i<5;i++)
{
  account[i].endOfMonth();
}


for(i=0;i<5;i++)
       {
           System.out.println("Balance: "+String.format( "%.2f",account[i].getBalance()));
           
           if(i==1||i==3||i==4)
           {
               System.out.println("Interest: "+((SavingsAccount) account[i]).getInterestRate());
           }
       }
      
      
   }

}