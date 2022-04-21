package com.edu;

import java.util.Scanner;

public class PreparedMain
{
	//Menu from user
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
			System.out.println("Database operations");
			System.out.println("Enter your choice");
			System.out.println("1.Display Student information");
			System.out.println("2.Insert Student record");
			System.out.println("3.Update Student information");
			System.out.println("4.Delete Student information");
			System.out.println("5.Select Student information");
			int ch=sc.nextInt();
			switch(ch) 
			{
			case 1:DataBaseOperations.displayRecords();
			break;
			case 2: DataBaseOperations.addRecords();
			break;
			case 3: DataBaseOperations.updateRecords();
			break;
			case 4: DataBaseOperations.deleteRecords();
			break;
			case 5: DataBaseOperations.selectRecords();
			default:System.out.println("Invalid choice");
			} //switch
			System.out.println("Do you want to continue y/n");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("n")) 
			{
				break;
			} //if
		}//while end
		System.out.println("Program Terminated");
		sc.close();
	}//main
}//MainApp


