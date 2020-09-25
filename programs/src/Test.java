public class Test {

	   static void countEachChar(String s) 
	   { 
		
		int count[] = new int[256]; 

		//String length

		for (int i = 0; i <s.length(); i++) 
			count[s.charAt(i)]++; 

		// We are creating another array with the size of String
		char array[] = new char[s.length()]; 
	        for (int i = 0; i <s.length(); i++) { 
		   array[i] = s.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			/* If a char is found in String then set the flag 
			 * so that we can print the occurrence
			 */
			if (s.charAt(i) == array[j])  
				flag++;                 
		   } 

		   if (flag == 1)  
		      System.out.println("Occurrence of char " + s.charAt(i)
			 + " in the String is:" + count[s.charAt(i)]);             
		} 
	   } 
	   public static void main(String[] args) 
	   {  
		String s = "divyainterview"; 
		countEachChar(s); 
	   } 
	}

	
	
	


