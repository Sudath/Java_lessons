package javaProjects;

/*
Programmer: Sudath Maduwantha
Date Created: 12/10/15	Date Modified: 12/10/15
Purpose: The purpose of this program is to demonstrate pass values through methods
 and call them in main class 
*/

import java.util.Scanner;

public class HexToDecimal {
  
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    
    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();

    System.out.println("The decimal value for hex number "
      + hex + " is " + hexToDeci(hex.toUpperCase()));
    input.close();
  }

  public static int hexToDeci(String hex) {
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }
    
    return decimalValue;
  }

  public static int hexCharToDecimal(char ch) {
    if (ch >= 'A' && ch <= 'F')
      return 10 + ch - 'A';
    else 
      return ch - '0';
  }
  
}
