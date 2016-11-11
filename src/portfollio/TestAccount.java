package portfollio;

/*
Programmer: Sudath Maduwantha
Date Created: 12/10/15	Date Modified: 12/10/15
Purpose: The purpose of this program is to demonstrate pass values through methods
 and call them in main class
*/


public class TestAccount { // start class

	public static void main(String[] args) { // start main method

	//creating an object from the class named Account
		Account sudath = new Account(1122, 20000);
		sudath.setAnnualInterestRate(4.5);
		sudath.withdraw(2500);
	//pass 3000 to the account using the deposit method
		sudath.deposit(3000);
		
		//Printing the resutls to the screen
		System.out.println("The balance is : "+sudath.getBalance());	
		System.out.println("The monthly interest is : "+sudath.getMonthlyInterest());
		System.out.println("The account was created on "+ sudath.getDateCreated());
		
		
		
	}//end main method

}//end class

/*
 * The output:
 
 The balance is : 20500.0
The monthly interest is : 76.875
The account was created on Tue Dec 15 17:31:43 CST 2015

 */

