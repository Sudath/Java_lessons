/*
Programmer: Sudath Maduwantha

Date Created: 12/22/15	Date Modified: 12/22/15
Purpose: The purpose of this program is to demonstrate, how to handle exeptions like InputMismatchException.
*/
package javaProjects;
//import Scanner class
import java.util.Scanner;										

public class InputMismatchExceptionDemo				//create InputMismatchExceptionDemo class
{													//start InputMismatchExceptionDemo class
	public static void main(String[] args)			//main method
	{												//start main method
		Scanner input = new Scanner(System.in);		//create a Scanner

		//declare numbers as integers
		int number1 = 0;
		int number2 = 0;

		boolean done = false;						//declare done as a boolean

		System.out.print("Enter two integers: ");	//prompt user to enter values

		while (!done)								//loop-continuation-condition
		{											//start loop
			try										//try block
			{										//start try
				//declare numbers as integers
				number1 = input.nextInt();
				number2 = input.nextInt();

				done = true;						//done changed
			}										//end try
			catch (Exception ex)					//catch block
			{										//start catch
				ex.printStackTrace();							//print throwable object
				System.out.print("Incorrect input and re-enter two integers: ");	//output statement
				input.nextLine();							//discard input
			}										//end catch
		}											//end loop

		System.out.println("Sum is " + (number1 + number2));					//output statement
	}												//end main method
}													//end InputMismatchExceptionDemo class