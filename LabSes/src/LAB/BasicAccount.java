package LAB;

public class BasicAccount extends BankAccount implements BankA
{
	
	long balance;

      BasicAccount(String n, int a,long b) 
      {
		super(n, a);
		 balance=b;
		
	}

	
	
	public void WithDraw(int Amount) 
	{
		
	}

	@Override
	public void Deposit(int Amount) 
	{
		
	}

}
