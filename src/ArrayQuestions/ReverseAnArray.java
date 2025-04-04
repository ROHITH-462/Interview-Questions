package ArrayQuestions;

import java.util.Scanner;

public class ReverseAnArray {
	
	public static void main(String args[]) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Given array is ");
		
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse array is ");
		
		for(int i=4;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

}
