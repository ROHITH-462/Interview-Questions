package ArrayQuestions;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		int flag=0;
		
		for(int i=0;i<5;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter an element to search ");
		int searchElement = scan.nextInt();
		
		for(int i=0;i<5;i++) {
			if(searchElement == arr[i]) {
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("Element not found " + searchElement);
		} else {
			System.out.println("Element found " + searchElement);
		}
		
	}	

}
