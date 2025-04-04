package ArrayQuestions;

import java.util.Scanner;

public class MaxAndMin {
	
	public static void main(String args[]) {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();			
		}
		
		int max=arr[0], min=arr[0];
		
		//{10, 20, 30, 40, 50}
		
		for(int i=1;i<5;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
//		for (int i = 1; i < 5; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }

		
		System.out.println(max);
		System.out.println(min);
		
	}

}
