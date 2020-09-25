package javaProgram;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter Number=");
		int n = sc.nextInt();
		int result = 0, p;
		int orgNum = n;
		while (n != 0) {

			p = n % 10;
			result = (result) + p * p * p;
			n = n / 10;

		}
		if (orgNum == result) {
			System.out.println("armstrong Number");
		} else {
			System.out.println("not armstrong Number");
		}

	}
}
