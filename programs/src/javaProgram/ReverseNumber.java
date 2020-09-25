package javaProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number=");
		int num = sc.nextInt();

		// using algorithm-

		/*
		 * int rev = 0;
		 * 
		 * while (num != 0) { rev = num % 10; num = num / 10;
		 * System.out.print(rev); }
		 */

		// Using StringBuffer class-

		
		/*
		 * StringBuffer buffer=new StringBuffer(String.valueOf(num));
		 * StringBuffer rev=buffer.reverse();
		 * 
		 * System.out.println(rev);
		 */

		
		// Using StringBuilder class-

		
	/*	StringBuilder build = new StringBuilder();
		build.append(num);
		StringBuilder rev = build.reverse();

		System.out.println(rev);
*/
	
		int rev;
		while(num!=0){
		rev=num%10;
		num=num/10;
		System.out.print(rev);
		}
		
	
	}

}
