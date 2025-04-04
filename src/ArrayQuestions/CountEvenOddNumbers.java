package ArrayQuestions;

import java.util.Scanner;

public class CountEvenOddNumbers {
	
	public static void main(String args[]) {
		
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		int oddNumbers=0, evenNumbers=0;
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			if(arr[i]%2==0) {
				evenNumbers++;
			}else {
				oddNumbers++;
			}
		}
		
		System.out.println("Even Numbers in an array " + evenNumbers);
		System.out.println("Odd Numbers in an array " + oddNumbers );	
		
		
	}

}
