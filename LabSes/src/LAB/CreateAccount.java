package LAB;

public class CreateAccount 
{
    
	
	
	public static  BankA create(String Account)
	{
		 if(Account == null)
		 {
	         return null;
	      }
		 if(Account.equalsIgnoreCase("Basic")){
	         return new BasicAccount("Hilal",1,25000);
	         
	      } else if(Account.equalsIgnoreCase("Gold")){
	         return new GoldAccount("Bilal",2,110000);
	         
	      } else if(Account.equalsIgnoreCase("Premium")){
	         return new PremiumAccount("Jalal",3,200000);
	      }
	      
	      return null;
	}
}
