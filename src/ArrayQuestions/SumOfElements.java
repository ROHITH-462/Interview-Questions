package ArrayQuestions;

import java.util.Scanner;

public class SumOfElements {
	
	public static void main(String args[]) {
		
		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		for(int i=0;i<5;i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			sum=sum+numbers[i];
		}
		
		System.out.println("Total Sum is " + sum);
	}

}
