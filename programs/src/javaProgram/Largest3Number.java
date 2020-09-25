package javaProgram;

import java.util.Scanner;

public class Largest3Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = sc.nextInt();

		System.out.println("Enter Second Number");

		int b = sc.nextInt();

		System.out.println("Enter Third Number");

		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("a is greater");

		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}

		// ternary operater

		int largest1 = a > b ? a : b;

		int largest2 = c > largest1 ? c : largest1;

		System.out.println(largest2 + " largest number");

	}
}
