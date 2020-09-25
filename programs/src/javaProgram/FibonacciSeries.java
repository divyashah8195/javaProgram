package javaProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int n = sc.nextInt();

		int f = 0, f1 = 1, f2;
		for (int i = 1; i <= n; i++) {

			System.out.print(f + "\t");
			f2 = f1;
			f1 = f;
			f = f1 + f2;

		}

	}

}
