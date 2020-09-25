package in.co.StringProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println(
		 * "Enter string = ");
		 * 
		 * // 1. using conncatation
		 * 
		 * String rev = ""; String s = sc.next();
		 * 
		 * for (int i = s.length() - 1; i >= 0; i--) { rev=rev+ s.charAt(i);
		 * 
		 * } System.out.print(rev);
		 * 
		 * 
		 * // 2. using char array
		 * 
		 * char a[] = s.toCharArray();
		 * 
		 * for (int i = s.length() - 1; i >= 0; i--) { rev = rev + a[i];
		 * 
		 * } System.out.println(rev);
		 * 
		 * // 3. Using StringBuffer Class
		 * 
		 * StringBuffer sb = new StringBuffer(s);
		 * System.out.println(sb.reverse());
		 * 
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();

		int  a=1, b=2, c=0;
		for(int i=1;i<=n;i++)
		 {
		  if(i==1||i==2)
		  {
			  System.out.println(i);
		  // printf("%d ",i);
		  }
		  else
		  {
		   c=a*b;
		   System.out.println(c);
		//   printf("%d ",c);
		   a=b;
		   b=c;
		  }
		 }
		// return 0;
		}

	}
