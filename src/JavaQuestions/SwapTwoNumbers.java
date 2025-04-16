package JavaQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 10;
		int secondNumber = 20;
		int temp=0;
		
		System.out.println("Before Swap");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After Swap");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}

}
