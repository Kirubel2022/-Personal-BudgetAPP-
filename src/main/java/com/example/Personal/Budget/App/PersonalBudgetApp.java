package com.example.Personal.Budget.App;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class PersonalBudgetApp {

	public static void main(String[] args) {

		//reads user inputs from the user
		Scanner scanner=new Scanner(System.in);
		int i=0;
		double income;

		System.out.println("1) Enter your salary");
		System.out.println("2) Enter your commissions");
		System.out.println("3)Enter your interest");
		System.out.println("4) Enter your salary");
		System.out.println("5)  Enter your investment");
		System.out.println("6) Enter your gift");
		System.out.println("7) Enter your royalty");
		System.out.println("8) Enter your other source of income ");
		System.out.println("9) totalIncome");
		System.out.println("10) Enter your  expense");
		System.out.println("11) totalExpense");
		System.out.println("12)  balance");

		double totalIncome;//it will hold total source of income
		double commissions;//it will hold the amount of tips(commissions)
		double investment;//it will hold investment income
		double gift;//it will hold gift/donations income
		double royalty;//it will hold royalty/rent income
		double other;//it will hold other source of  income

		System.out.println("Enter your salary amount");
		//it will hold total source of income
		double salary = scanner.nextDouble();
		System.out.println("Enter your commissions ");
		commissions= scanner.nextDouble();
		System.out.println("Enter your interest ");
		//it will hold interest income
		double interest = scanner.nextDouble();
		System.out.println("Enter your investment");
		investment= scanner.nextDouble();
		System.out.println("Enter your gift ");
		gift= scanner.nextDouble();
		System.out.println("Enter your royalty ");
		royalty= scanner.nextDouble();
		System.out.println("Enter your other source of income ");
		other= scanner.nextDouble();
		// total income formula
		//totalIncome = salary + commissions + interest + investment + gift + royalty + other
		totalIncome = salary + commissions + interest + investment + gift + royalty + other;
		System.out.println("The total Income is:" + totalIncome);
		System.out.println("How much you want to spend?");
		double expense;
		double totalExpense;//it will hold total expense
		totalExpense=0.0;

		do{
			System.out.println("Enter your  expense:");
			expense=scanner.nextDouble();
			totalExpense +=expense;
		} while (totalExpense<= totalIncome);
		double balance= totalIncome-totalExpense;
		if(balance<0) {
			System.out.println("You do not have money left to save. You are over budget:" + String.valueOf(balance));
		} else if (balance >0) {System.out.println("You  have money left to save. You are under budget:" + String.valueOf(balance));

		}
		else {
			System.out.println(" You are on budget:" + String.valueOf(balance));

		}
		System.out.println("0) to Exit");
	}

}
