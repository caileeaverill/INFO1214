/*
 * Program Name: CA_SchoolFundraiser
 * Purpose: Calculate how many computers can be purchased for a school from money raised by the school community
 * Coder: Cailee Averill
 * Date: 2025-09-18
 * Course: INFO1214
 */

package week3.assignmentPractice.practiceB;

import java.util.Scanner;

/**
 * 
 */
public class CA_SchoolFundraiser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create scanner object 
		Scanner scnr = new Scanner(System.in);
				
		// Start program description
		System.out.println("This program will calculate how many computers may be purchased for a school from money raised by the school community.");
		System.out.println();
		
		// Ask user for total money raised
		System.out.print("Enter the total amoutn of money raised: $");
		double moneyRaised = scnr.nextDouble();
		
		// Ask user for price of each computer before tax
		System.out.print("Enter the purchase price of each computer before tax: $");
		double computerPrice = scnr.nextDouble();
		
		// Computer price including 13% HST
		
		final double HST = 0.13;
		
		double priceWithTax = computerPrice * (1 + HST);
		
		priceWithTax = (int)(priceWithTax * 100 + 0.5) / 100.0;

		
		// Calculate total number of computers that can be purchased
		int totalComputers = (int) (moneyRaised / priceWithTax);
		
		// Calculate total spent on computers
		double totalSpent = totalComputers * priceWithTax;
		
		// Calculate remaining money
		double remainingMoney = (moneyRaised - totalSpent);

		// Output results
		System.out.printf("With the total funds raised of $%.2f, the school can buy %d computers at $%.2f each (including 13%% HST) 		for a total of $%.2f. There would still be $%.2f left over.", moneyRaised, totalComputers, priceWithTax, totalSpent, 		remainingMoney);
		
		System.out.printf("With the total funds raised of $%.2f the school can buy%n", moneyRaised);
		System.out.printf("%d computers at $%.2f each (including 13%% HST) for a total of%n", totalComputers, priceWithTax);
		System.out.printf("$%.2f. There would still be $%.2f left over.%n", totalSpent, remainingMoney);

		scnr.close();
	}

}
