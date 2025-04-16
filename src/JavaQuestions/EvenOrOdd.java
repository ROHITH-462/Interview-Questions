package JavaQuestions;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String args[]) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Given number is EVEN");
		} else {
			System.out.println("Given number is ODD");
		}
		
		String result  = n%2==0 ? "EVEN" : "ODD";
		
		System.out.println("Given number is " + result);
	}

}
