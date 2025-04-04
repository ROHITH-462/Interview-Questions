package ArrayQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="ROHITH";
		
		char[] tempName;
		
		
		tempName=name.toCharArray();
		int length = tempName.length;
		char[] revName = new char[length];
		
		int j=0;
		for(int i=length-1;i>=0;i--) {
			revName[j]=tempName[i];
			j++;
		}
		
		String reversedString = new String(revName);
		System.out.println("REVERSRED STRING IS " + reversedString);
		
	}

}
