package com.bridgelabz;
/**
 * 
 */


import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class StopWatch {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        System.out.print("Press any Numkey to Start :");
        input.nextFloat();
        long startTime = System.currentTimeMillis();
        System.out.println("Timer started...");

        System.out.print("Press any Numkey to Stop :");
        input.nextFloat();
        long stoppedTime = System.currentTimeMillis();
        long timeElapsed = (stoppedTime - startTime)/1000;
        System.out.println("Timer stopped!");
        
        System.out.print("Elapsed time is " + timeElapsed);
	}
}
