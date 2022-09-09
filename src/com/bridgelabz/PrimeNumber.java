package com.bridgelabz;
/**
 * 
 */


import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number to check if the number is prime or not!");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean prime = true;
		
		for(int i=2;i<9;i++) {
			if(num % i == 0) {
				prime = false;
				break;
			}
				
		}
		System.out.println(prime);

	}

}
