package javaProgram;

public class SecondLargestArray {

	public static void main(String[] args) {

		int a[] = { 89, 3, 32, 12, 45, 67 };

		int largest = a[0];

		int secondLargest = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			}
			if (a[i] < largest && a[i] > secondLargest) {
				secondLargest = a[i];
			}

		}
		System.out.println(secondLargest);
	}

}
