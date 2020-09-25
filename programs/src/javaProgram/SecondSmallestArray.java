package javaProgram;

public class SecondSmallestArray {

	public static void main(String[] args) {

		int a[] = { 1, 4, 34, 56, 2, 45, 67, 35 };
		int smallest = a[0];
		int secondSmallest = 0;

		for (int i = 0; i < a.length; i++) {

			if (smallest >a[i]) {
				secondSmallest = smallest;
				smallest = a[i];
			}
			if (a[i] > smallest && a[i] < secondSmallest) {
				secondSmallest = a[i];
			}
		}
		System.out.println(secondSmallest);
	}

}
