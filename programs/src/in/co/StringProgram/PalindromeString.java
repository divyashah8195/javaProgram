package in.co.StringProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string or number ");
		String s = sc.next();

		String original = s, reverse = ""; // Objects of String class

		for (int i = s.length() - 1; i >= 0; i--)
			reverse = reverse + s.charAt(i);
		if (s.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
	}
}
