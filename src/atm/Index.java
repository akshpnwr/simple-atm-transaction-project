package atm;

import java.util.Scanner;


public class Index
{
	public static void main(String args[])
	{
		int AKASH = 1234;
		int A_PWD = 1613;
		int RAHUL = 5678;
		int R_PWD = 2560;
		
		int acnt_no,pwd;  //Account no ,password
		
		Scanner login=new Scanner(System.in);
		
		System.out.println("Welcome to ATM !!!");
		
		
		System.out.print("Enter your Account no. : ");
		acnt_no = login.nextInt();
		
		System.out.print("Enter your password : ");
		pwd = login.nextInt();
		
		
		Home obj=new Home();
		
		if(acnt_no==AKASH && pwd==A_PWD)
		{
			System.out.println("Successfull!!!");
			
			obj.Selection();
		}
		
		else if(acnt_no==RAHUL && pwd==R_PWD)
		{
			System.out.println("Successfull!!!");
			
			obj.Selection();
			
		}
		
		else
			System.out.println("WRONG DETAILS!!!");
			
		
		
	}
}
