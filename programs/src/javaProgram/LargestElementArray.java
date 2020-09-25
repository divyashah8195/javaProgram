package javaProgram;

public class LargestElementArray {

	public static void main(String[] args) {

		int a[]={9,5,32,45,67,1,23,90};
		int largest=a[0];
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]>largest){
				
				largest=a[i];
			}
			
			
		}
	
		System.out.print(largest);
		
	}
}
