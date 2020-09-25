package in.co.StringProgram;

public class CheckString {

	public static void main(String[] args) {

		// check

		String s1 = "divya";
		String s2 = "divya";

		System.out.println(s1.equals(s2)); //true
		System.out.println(s1 == s2);  //true

		// check
		/*
		 * String s1 = "divya"; 
		 * String s2 = new String("divya");
		 * 
		 * System.out.println(s1.equals(s2)); //true
		 * 
		 * System.out.println(s1==s2); //false
		 * 
		 */

		// check
	/*	String s1 = new String("divya");

		String s2 = new String("divya");

		System.out.println(s1.equals(s2)); // true

		System.out.println(s1 == s2); // false

		// check
		String s = new String("divya");
		String s3 = new String("shah");

		String s5 = s.concat(s3);
		System.out.println("concat =" + s5);

		// check
		String name = "DIVYA";
		String lower = name.toLowerCase();
		name.toLowerCase();
		System.out.println(name);// DIVYA
		System.out.println(lower); // divya
*/
	}
}
