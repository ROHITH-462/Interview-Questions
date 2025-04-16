package JavaQuestions;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=43, b=98;
		
		System.out.println("Before Swap");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap");
		System.out.println("A = " + a);
		System.out.println("B = " + b);

	}

}
