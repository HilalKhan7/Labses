package LAB;

public class GoldAccount extends BankAccount implements BankA 
{

	long bal;
	GoldAccount(String n, int a,long b) {
		super(n, a);
		bal=b;
	}

	public void WithDraw(int Amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deposit(int Amount) {
		// TODO Auto-generated method stub
		
	}

}
