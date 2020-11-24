package atm;

import java.util.Scanner;

public class SavingsOperation 
{
	
	int c_balance=0;
	public void saving()
	{
		int ch;
		
		do
		{
			System.out.println();
			System.out.println("Saving account : ");
			System.out.println();
			
			System.out.println("1. View Balance");
			System.out.println("2. Withdraw funds");
			System.out.println("3. Deposit funds");
			System.out.println("4. Exit");
			
			System.out.print("choice : ");
			
			Scanner scan=new Scanner(System.in);
			ch=scan.nextInt();
			
					switch(ch) 
						{
							case 1:
								viewBalance();
								break;
								
							case 2:
								withdrawFunds();
								break;
								
							case 3:
								depositFunds();
								break;
								
							case 4:
								System.exit(0);
								break;
								
							default:
								System.out.println("WRONG CHOICE!!!!");
						}
		}while(ch!=4);
	}
	
	public void viewBalance()
	{
		System.out.println("Your saving account balance is : " + c_balance + "$");
	}
	public void withdrawFunds()
	{
		System.out.println("Enter the amount for withdrawal : "  );
		
		Scanner scan=new Scanner(System.in);
		
		int w_amount=scan.nextInt();
		
		if(w_amount>c_balance)
		{
			System.out.println("Balance insufficient");
		}
		else
		{
			System.out.println("Amount debited ");
			c_balance = c_balance - w_amount;
			System.out.println("Your saving account balance is : " + c_balance + "$");
		}
	}
	public void depositFunds()
	{
		System.out.println("Enter the amount to deposit : "  );
		
		Scanner scan=new Scanner(System.in);
		
		int d_amount=scan.nextInt();
		
		System.out.println("Amount credited ");
		c_balance = c_balance + d_amount;
		
		System.out.println("Your saving account balance is : " + c_balance + "$");
		
	}
}
