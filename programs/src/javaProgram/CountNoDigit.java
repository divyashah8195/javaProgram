package javaProgram;

public class CountNoDigit {

	public static void main(String[] args) {

		int n = 12345698;
		int count = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);

	}

}
