package com.datatypes;

import java.util.Scanner;

public class CelsiusToFaherenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the celsius value:");
		double celsius = scan.nextInt();
		double faherenheit = (celsius * 9/5) + 32;
		System.out.println("The faherenheit value is:");
		System.out.printf("%.4f" , faherenheit);
		
	}

}
