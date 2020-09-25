package in.co.StringProgram;

public class OccuranceOfEachChar {

	static void countCharacter(String s) {

		int count[]=new int[256];
		
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)]++;
		
		
		
		char array[]=new char[s.length()];
		
		for(int i=0;i<s.length();i++){
			array[i]=s.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++){
				
				if(s.charAt(i)==array[j])
					flag++;
			}
			if(flag==1)
				System.out.println("occurance of char "+s.charAt(i)+" in the String is"+count[s.charAt(i)]);
		}
	}

	public static void main(String[] args) {

		String s = "divyasinterview";

		countCharacter(s);

	}

}
