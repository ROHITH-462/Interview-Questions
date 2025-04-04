package ArrayQuestions;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max = 0;
		int secondLargest = 0;
		
		for(int i=0;i<5;i++) {
			if(arr[i]>max) {
				secondLargest = max;
				max=arr[i];
			}else if ((arr[i] > secondLargest) && (arr[i] != max)) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Max value is " + max);
		System.out.println("Second Largest value is " + secondLargest);
	}

}
