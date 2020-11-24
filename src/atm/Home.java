package atm;

import java.util.Scanner;

public class Home
{
	public void Selection()
	{
		
		
		int choice;
		
		CheckingOperation obj=new CheckingOperation();
		SavingsOperation obj1=new SavingsOperation();
		
		do 
		{
			System.out.println("Select a option : ");
			
			System.out.println("1. Checking account ");
			System.out.println("2. Savings account ");
			System.out.println("3. Exit ");
			
			System.out.print("Choice : ");
			
			Scanner scan=new Scanner(System.in);
			choice=scan.nextInt();
			
			switch(choice)
			{
			    
				case 1:	
					
					obj.check();
					break;
					
				case 2:
					
					obj1.saving();
					break;
					
				case 3:
		
					System.exit(0);
					break;
					
				default:
					System.out.println("WRONG CHOICE");
			}
		}while(choice!=3);
		
		
	}
}

