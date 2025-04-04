package ArrayQuestions;

import java.util.Scanner;

public class FrequencyOfAnElement {
	
	public static void main(String args[]) {
		
		int[] arr = new int[8];
		Scanner sc = new Scanner(System.in);
		int flag=0;
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<=100;i++) {
			for(int j=0;j<8;j++) {
				if(i==arr[j]) {
					flag++;
				}
			}
			if(flag!=0) {
				System.out.println("Frequency of " + i + " : " + flag);
				flag=0;
			}
		}
		
	}

}
