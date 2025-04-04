package ArrayQuestions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		input = sc.nextInt();
		
		String result = input%2==0 ? "EVEN" : "ODD";
		
		System.out.println("Given number is " + result);

	}

}
