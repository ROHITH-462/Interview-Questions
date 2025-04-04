package ArrayQuestions;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,2,5};
		
		int[] revArr = new int[5];
		int j=0;
		int z=4;
		int flag=0;
		
		for(int i=4;i>=0;i--) {
			revArr[j]=arr[i];
			j++;
		}
		
		if(Arrays.equals(arr, revArr)) {
			System.out.println("Given array is PALINDROME");
		}else {
			System.out.println("Given array is not a PALINDROME");
		}
	}

}
