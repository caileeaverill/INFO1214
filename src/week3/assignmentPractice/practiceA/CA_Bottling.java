/*
 * Program: CA_Bottling.java
 * Purpose: Calculate number of bottles and leftover volume for home brew batches
 * Coder: Cailee Averill
 * Date: 2025-09-18
 */

package week3.assignmentPractice.practiceA;

/**
 * 
 */

import java.util.Scanner;

public class CA_Bottling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create scanner object 
		Scanner scnr = new Scanner(System.in);
		
		// Start program description
		System.out.println("Home Brew Bottling Program");
		System.out.println();
		System.out.println("This program will calculate the number of bottles required to bottle a batch of home brew.");
		
		// Ask user for batch size in litres
		System.out.print("Enter the batch size in L: ");
		int batchSizeInL = scnr.nextInt();
		
		// Ask user for bottle size
		System.out.print("Enter the bottle size in milliliters: ");
		int bottleSizeInMls = scnr.nextInt();
		
		// Ask user for description
		System.out.print("Enter a description for your home brew: ");
		String brewDescription = scnr.nextLine();
		
		// Add space
		System.out.println();
		
		// create variable to convert the ML into L
		int ML_PER_L = 1000;
	
		// formula to convert batch size into ML
		int batchSizeInML = batchSizeInL * ML_PER_L;
		
		// calculate the # of filled bottles
		int numOfFilledBottles = (batchSizeInML / bottleSizeInMls);
		
		// calculate remaining liquid
		int remainingLiquid = batchSizeInML % bottleSizeInMls;
		
		// output results
		System.out.printf("You will need %d bottles for your batch of %s.\n", numOfFilledBottles, brewDescription);
		System.out.printf("There will be %d mL of butter beer left over, unbottled.", remainingLiquid);
		
		scnr.close();
		
	}

}
