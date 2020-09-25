package in.co.StringProgram;

public class CountNoDigit {

	public static void main(String[] args) {

		String s = "divya1234";
		int digit = 0,alpha=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				digit++;
			}
			else if(Character.isAlphabetic(ch)){
				alpha++;
			}

		}
		System.out.println("digit="+digit);
		System.out.println("alphabet="+alpha);
	}
}
     