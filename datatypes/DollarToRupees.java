package com.datatypes;

import java.util.Scanner;

public class DollarToRupees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float dollar = 80.8f;
		System.out.println("Enter the amount in dollars:");
		int n = scan.nextInt();
		float rupees = dollar * n;
		
		System.out.println("Amount in rupees based the data is : " + rupees);
		scan.close();
		
		
	}

}
