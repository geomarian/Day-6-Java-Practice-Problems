package com.bridgelabz;
/**
 * 
 */


import java.util.Scanner;
/**
 * @author ASUS
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int reverse = 0;
		int remainder;
		
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		while(num!=0) {
			remainder = num%10;
			
			reverse = reverse * 10 + remainder;
		
			num/=10;
		
		}
		System.out.println("Reversed number is = " + reverse);
		
		}
		
		
	}
