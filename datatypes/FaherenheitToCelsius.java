package com.datatypes;

import java.util.Scanner;

public class FaherenheitToCelsius {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the faherenheit value:");
		double celsius = scan.nextDouble();
		double faherenheit = (celsius - 32) * 5/9;
		System.out.println("The celsius value is:");
		System.out.printf("%.4f" , faherenheit);
		scan.close();
	}
}
