package portfollio;

/*
Programmer: Sudath Maduwantha
Date Created: 12/10/15	Date Modified: 12/10/15
Purpose: The purpose of this program is to demonstrate pass values through methods
 and call them in main class 
*/


import java.util.Date;

public class Account { //start class

	//Initializing private variables
	
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	private double monthlyInterestRate;
	
	
	
	//creating no-arg constructor
	Account(){
		
	}

	//Creating constructor with id and balance variables
	public Account(int id, double balance) {
		
		this.id = id;
		this.balance = balance;
	}

	

	public double getBalance() {// creating a method to get balance
		return balance;
	}

	public void setBalance(double balance) { // creating a method to set balance
		this.balance = balance;
	}

	// creating a method to get annual interest rate
	public double getAnnualInterestRate() { 
		return annualInterestRate;
	}

	//creating a method to set annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// creating a method to get date created
	public Date getDateCreated() {
		
		Date dateCreated = new Date();
		return dateCreated;
	}
	
	// creating a method to get monthly interest
	public double getMonthlyInterest(){
		annualInterestRate = annualInterestRate/100;
		monthlyInterestRate = (annualInterestRate/12) * balance;
		 return monthlyInterestRate;
	}
	
	// creating a method to withdraw money from the account
	public double withdraw(double withdraw){
		balance  = balance - withdraw;
		return balance;
	}
	
	// creating a method to deposit money to the account
	public double deposit(double deposit){
	
		balance = balance + deposit;
		return balance;
	}
	
}//end class
