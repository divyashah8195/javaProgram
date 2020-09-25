package in.co.StringProgram;

public class CountCharacterOccurance {

	public static void main(String[] args) {

		String s = "divyainterviews";
		int count = 0, count1 = 0;
		int d = 0, v = 0, y = 0, a = 0, n = 0, t = 0, e = 0, r = 0, w = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == 'd') {
				d++;
			} else if (ch == 'i') {
				count++;
			} else if (ch == 'v') {
				v++;
			} else if (ch == 'y') {
				y++;
			} else if (ch == 'a') {
				a++;
			} else if (ch == 'n') {
				n++;
			} else if (ch == 't') {
				t++;
			} else if (ch == 'e') {
				e++;
			} else if (ch == 'r') {
				r++;
			} else if (ch == 'w') {
				w++;
			} else if (ch == 's') {
				count1++;
			}
		}
		System.out.println("no of String d=" + d);
		System.out.println("no of String i=" + count);
		System.out.println("no of String v=" + v);
		System.out.println("no of String y=" + y);
		System.out.println("no of String a=" + a);
		System.out.println("no of String n=" + n);
		System.out.println("no of String t=" + t);
		System.out.println("no of String e=" + e);
		System.out.println("no of String r=" + r);
		System.out.println("no of String w=" + w);
		System.out.println("no of String s=" + count1);

	}

}
