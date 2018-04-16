package LAB;

public class BankAccount 
{
     public String Name;
     public int accno;
     
     BankAccount(String n,int a)
     {
    	 Name=n;
    	 accno=a;
    	 
    	 
     }
     public void details()
     {
    	 
    	 System.out.println("Name = "+Name+"Account no="+accno);
     }
}
