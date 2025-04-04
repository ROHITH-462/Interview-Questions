package ArrayQuestions;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String args[]) {

		int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,7,8,9,0};

		
		int[] array3 = mergeArray(array1, array2);
		
		System.out.println(Arrays.toString(array3));
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int array1Length = arr1.length;
		int array2Length = arr2.length;


		int[] array3 = new int[array1Length+array2Length];

		for(int i=0;i<array1Length;i++) {
			array3[i]=arr1[i];
		}

		for(int i=0;i<array2Length;i++) {
			array3[array1Length+i]=arr2[i];
		}



		return array3;

	}

}
