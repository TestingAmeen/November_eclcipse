package assignments;

import java.util.Scanner;

interface Bank
{
	public void bankdetails();
	public void deposit();
	public void withdraw();
}


class sbi implements Bank
{
	Scanner sc=new Scanner(System.in);
String name="Ameen";
int balance_amount=15000;
	


	@Override
	public void bankdetails()
{
		System.out.println("Name = "+name);
		System.out.println("Balamount = "+balance_amount);
	}

	@Override
	public void deposit() 
	{
		System.out.println("Enter the amount to deposit");
		int depos=sc.nextInt();
		balance_amount=balance_amount+depos;
		System.out.println("Final balance = "+balance_amount);
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Enter the amount to Withdrew");
		int wthdraw=sc.nextInt();
		balance_amount=balance_amount-wthdraw;
		System.out.println("Final balance = "+balance_amount);
	}
	
}





public class BankApplication {
	public static void main(String[] args) {
		sbi ob=new sbi();
		ob.bankdetails();
		ob.deposit();
		ob.withdraw();
	}

}
