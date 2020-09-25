package javaProgram;

import java.util.Scanner;

public class PrimeOrNot {

	/*
	 * Note: 0 and 1 are not prime numbers. The 2 is the only even prime number
	 * because all the other even numbers can be divided by 2.
	 */

	static Boolean isPrimeNumber(int num) {
		Boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if ((num % i) == 0) {
					isPrime = true;
					break;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		Boolean isPrime = isPrimeNumber(num);
		if (isPrime) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is not prime Number");
		}
	}

}
