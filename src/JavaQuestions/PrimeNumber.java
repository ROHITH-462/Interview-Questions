package JavaQuestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				flag++;
			}
		}
		
		String result = (flag==2) ? "Prime Number" : "Not a Prime Number";

		System.out.println("Given number is " + result);
	}

}
