package JavaQuestions;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		int firstNumber=0, secondNumber=1;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		int sum=firstNumber;
		
		for(int i=1;i<10;i++) {
			sum=firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.println(secondNumber);
		}
	}

}
