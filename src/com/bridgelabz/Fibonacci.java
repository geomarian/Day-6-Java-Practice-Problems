package com.bridgelabz;
/**
 * 
 */


/**
 * @author ASUS
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int previousNumber = 0;
		int nextNumber = 1;
		int maxNumber =10;
		int sum;
		
		
		int  i = 0;
		
		while(i<=maxNumber) {
			++i;
		
			sum = previousNumber+ nextNumber;
			previousNumber=nextNumber;		
			nextNumber=sum;
		System.out.print(" " +  sum);	
		}

	}

}
