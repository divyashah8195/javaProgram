package javaProgram;

public class SwapTwoNo {

	public static void main(String[] args) {

		// logic 1

		// without using third Variable.
		int a = 10, b = 20, t;

		/*
		 * a = a + b; // 10+20 =30=a b = a - b; // 30-20=10=b a = a - b; //
		 * 30-10=20 =a
		 * 
		 * System.out.println("a value " + a + "b value= " + b);
		 */
		// logic 2-

		// with using third Variable

	/*	t = a; // t=10
		a = b; // a=20
		b = t;// b=10

		System.out.println(a + "b= " + b);
*/
		// logic 3- use * and / without using third Variable

		a = a * b; // 10*20=200
		b = a / b; // 200/20=10=b
		a = a / b; // 200/10=20=a

		// logic -4 bitwise operator (^)

		a = a ^ b;  //10^20=30
		b = a ^ b; // 30^20=10
		a = a ^ b; //30^10=20

		System.out.println(a+ "b value"+b);
	
		//logic -5 Single Statement
		
		b=a+b-(a=b);  // 30-
		
		System.out.println("a value="+a +"b value=" +b);
		
	}
}
