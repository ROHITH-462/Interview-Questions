package ArrayQuestions;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
		int n=arr.length;
		
		int last = arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=last;
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
