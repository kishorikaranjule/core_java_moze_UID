import java.util.Scanner;

public class Account extends Object{
	
	private String name;
	private int acc_no;
	private double bal;
	
	public Account(String name,int acc_no,double bal) {
		this.name=name;
		this.acc_no=acc_no;
		this.bal=bal;
	}
	
	public void deposit(double amt)
	{
		bal+=amt;
		System.out.println("Balance after depositing " + "amount is "+bal);
	}
	
	public void withdraw(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println("Balance after withdrawing"+bal);
		}
		else
		{
			System.out.println("Your balance is not enough to withdraw the amount");
		}
	}

	public static void main(String[] args) {
		System.out.println("In main method--->");
		Account a = new Account("kk",11,6700);
		a.deposit(100);
		a.withdraw(1);
		 

	}

}
