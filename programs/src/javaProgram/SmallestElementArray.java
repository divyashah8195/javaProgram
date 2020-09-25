package javaProgram;

public class SmallestElementArray {

	public static void main(String[] args) {

		int a[] = { 90, 8, 7, 78, 56, 2, 56,1 };

		int smallest = a[0];

		for (int i = 0; i < a.length; i++) {

			if ( smallest >a[i]) {

				smallest=a[i];

			}

		}
		System.out.println(smallest);

	}
}
