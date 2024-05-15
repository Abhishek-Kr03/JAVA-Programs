package com.ifelse;

import java.util.Scanner;

public class MultipleOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of X:");
		int num = scan.nextInt();
		System.out.println("Enter the vlaue of Y:");
		int n = scan.nextInt();
		if(num % n == 0) {
			System.out.println("X is the multiple of Y");
		}
		else {
			System.out.println("X is not multiple of Y");
		}
		scan.close();
	}
}
