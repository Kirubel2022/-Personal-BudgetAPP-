package com.example.Personal.Budget.App;

import java.util.ArrayList;
import java.util.Scanner;


public class PersonalBudgetApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//reads user inputs from the user
		int i = 0;
		double income, expense =0;
		double balance =0;
		boolean q=false;
		int choice;
		int numberOfSourceOfIncomeItems =0;
		int numberOfSourceOfExpenseItems;
		ArrayList<String>category=new ArrayList<>();


		//Display menu items
		do {
			System.out.println("1\t Enter your Income");
			System.out.println("2\t Enter your Expense");
			System.out.println("3\t View your Balance");
			System.out.println("4\t Quit");
			System.out.println("\t Enter your choice");
			choice = sc.nextInt();

			//get selection
			switch (choice) {
				case 1:
					System.out.println("Enter how many incomeItems you want: ");
					// n times mean n no.of records, i=begins from no record until n no. records
					// if we want record 5 employees the 3 fields appear and records each 5 times.
					int n = sc.nextInt();
					for ( i = 0; i < n; i++) {
						System.out.println("Enter Income NO.:");
						int incomeno = sc.nextInt();
						System.out.println("Enter Income Amount.:");
						income = sc.nextDouble();
						balance += income;}
					break;
				case 2:
					System.out.println("Enter how many Expense Items you want: ");
					int n2 = sc.nextInt();
					for ( i = 0; i < n2; i++) {
						System.out.println("Enter Income NO.:");
						int expno = sc.nextInt();
						System.out.println("Enter your expense Amount"+ i++);
						expense = sc.nextDouble();

						if(balance-expense>=0)
							balance -= expense;
						else
							System.out.println("insufficient fund");}
					break;
				case 3:
					System.out.println("Your balance is : " + " " + balance);
					break;
				case 4:
					q = true;
					System.out.println("Thank you and Good bye! " );
					break;
				default:
					System.out.println("Invalid input.Try again!");
			}
			//evaluate option
		}while (choice!=4);

	}
}




