package javaProgram;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();

		int orgNum = n, p;
		int result = 0;

		while (n != 0) {
			p = n % 10;
			result = (result * 10) + p;
			n = n / 10;

		}

		if (result == orgNum) {
			System.out.println("palindrom Number");
		} else {
			System.out.println("not palindrome");
		}

	}
}
