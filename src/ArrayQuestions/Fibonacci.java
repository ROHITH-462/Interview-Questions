package ArrayQuestions;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber=0;
		int secondNumber=1;
		
		int sum=firstNumber;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for(int i=1;i<=7;i++) {
			sum=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			System.out.println(secondNumber);
		}

	}

}
